package com.iba.courses.service.Db2Connect;

import java.sql.SQLException;

public class Db2TerminalService {
    public String Db2Terminal(String command) {
        Db2ConnectionService db2ConnectionService2 = new Db2ConnectionService();
        try {
            db2ConnectionService2.init(new Db2Parameters());
           return db2ConnectionService2.execute(command);  // -dis ddf
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Error";
    }
}
