package com.iba.courses.rest;


import com.iba.courses.domain.Command;
import com.iba.courses.service.imsConnect.ImsTerminalService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("api/ims")
public class ImsApi {


    @PostMapping("/imsConnect")
    private Map getImsConnect(@RequestBody Command command){
        return Collections.singletonMap("result", new ImsTerminalService().ImsTerminal(command));
    }
}
