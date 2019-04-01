package com.iba.courses.service;

import com.ibm.ims.connect.*;

public class ImsConnectionService {

    private final String USER_ID = "LAPUSHA";
    private final String PASSWORD = "LAPUSHA2";
    private final String HOST = "172.20.2.116";

    private ConnectionFactory connectionFactory;
    private Connection connection;
    private TmInteraction tmInteraction;



    public void init(ImsParameters imsParameters) throws ImsInteractionException {


        imsParameters.setHostname(HOST);
        imsParameters.setDatastore("IVP1");
        imsParameters.setExitIdentifier("*SAMPL1*");
        imsParameters.setPort(7003);
        imsParameters.setUserId(USER_ID);
        imsParameters.setPassword(PASSWORD);

        try {
            this.connectionFactory = new ConnectionFactory();
            this.connectionFactory.setHostName(imsParameters.getHostname());
            this.connectionFactory.setPortNumber(imsParameters.getPort());
            this.connectionFactory.setSocketType(ConnectionFactory.SOCKET_TYPE_PERSISTENT);
            this.connection = this.connectionFactory.getConnection();
            this.tmInteraction = this.connection.createInteraction();

            /* Interaction settings */
            this.tmInteraction.setImsConnectTimeout(5000);
            this.tmInteraction.setInteractionTimeout(50000);
            this.tmInteraction.setTrancode("");
            this.tmInteraction.setInputMessageDataSegmentsIncludeLlzzAndTrancode(false);
            this.tmInteraction.setCommitMode(ApiProperties.COMMIT_MODE_0);
            this.tmInteraction.setResponseIncludesLlll(true);
            this.tmInteraction.setInteractionTypeDescription(ApiProperties.INTERACTION_TYPE_DESC_SENDRECV);
            this.tmInteraction.setImsConnectUserMessageExitIdentifier(imsParameters.getExitIdentifier());
            this.tmInteraction.setImsDatastoreName(imsParameters.getDatastore());
            /* RACF settings */
            this.tmInteraction.setRacfUserId(imsParameters.getUserId());
            this.tmInteraction.setRacfPassword(imsParameters.getPassword());
            this.tmInteraction.setRacfGroupName("");
            this.tmInteraction.setRacfApplName("");
        } catch (ImsConnectApiException e) {
            throw new ImsInteractionException("Can't set IMS connection properties. IMS Connect API message: " + e.getMessage(), e);
        }
    }

    public void connect(){
        try {
            this.connection.connect();
        } catch (Exception e) {
            System.out.println("Error in connecting");
            e.printStackTrace();
        }
    }
    
    public String execute(String command){
        try {
            InputMessage inputMessage = this.tmInteraction.getInputMessage();
            inputMessage.setInputMessageData(command.getBytes(tmInteraction.getImsConnectCodepage()));
            this.tmInteraction.execute();
            OutputMessage outputMessage = tmInteraction.getOutputMessage();
            return outputMessage.getDataAsString();
        } catch (Exception e) {
            System.out.println("Error in executing");
            e.printStackTrace();
        }
        return "Error";
    }

}


