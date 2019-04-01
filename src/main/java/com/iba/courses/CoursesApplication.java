package com.iba.courses;

import com.iba.courses.service.ImsConnectionService;
import com.iba.courses.service.ImsInteractionException;
import com.iba.courses.service.ImsParameters;
import com.iba.courses.service.TerminalService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CoursesApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoursesApplication.class, args);


        new TerminalService().ImsTerminal();
    }

}
