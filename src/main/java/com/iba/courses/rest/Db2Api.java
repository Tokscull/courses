package com.iba.courses.rest;

import com.iba.courses.domain.Command;
import com.iba.courses.service.Db2Connect.Db2TerminalService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/db2")
public class Db2Api {

    @PostMapping("/db2Connect")
    private Map getDb2Connect(@RequestBody Command command){
        return Collections.singletonMap("result", new Db2TerminalService().Db2Terminal(command));
    }
}
