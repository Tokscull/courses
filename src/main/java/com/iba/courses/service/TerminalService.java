package com.iba.courses.service;

public class TerminalService {

    public String ImsTerminal() {
        ImsConnectionService imsConnectionService = new ImsConnectionService();
        try {
            imsConnectionService.init(new ImsParameters());
            imsConnectionService.connect();
            String outPut =  imsConnectionService.execute("/dis a");
         //   System.out.println(outPut);
            return  outPut;
        } catch (ImsInteractionException e) {
            e.printStackTrace();
        }
        return null;
    }


}
