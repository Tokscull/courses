package com.iba.courses.service.Db2Connect;

import com.iba.courses.domain.Command;

import java.sql.SQLException;

public class Db2TerminalService {
    public String Db2Terminal(Command command) {
        System.out.println("Command message " + command.getMessage());
        System.out.println("Command login " +command.getLogin());
        System.out.println("Command password " +command.getPassword());
        Db2ConnectionService db2ConnectionService2 = new Db2ConnectionService();
        try {
            db2ConnectionService2.init(new Db2Parameters(),command.getLogin(),command.getPassword());
            return db2ConnectionService2.execute(command.getMessage());  // -dis ddf
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
