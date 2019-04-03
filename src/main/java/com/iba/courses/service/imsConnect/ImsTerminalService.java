package com.iba.courses.service.imsConnect;

import com.iba.courses.domain.Command;

public class ImsTerminalService {

    public String ImsTerminal(Command command) {
        ImsConnectionService imsConnectionService = new ImsConnectionService();
        try {
            imsConnectionService.init(new ImsParameters(),command.getLogin(),command.getPassword());
            imsConnectionService.connect();
            return  imsConnectionService.execute(command.getMessage()); // /dis a
        } catch (ImsInteractionException e) {
            e.printStackTrace();
        }
        return "Error";
    }


}
