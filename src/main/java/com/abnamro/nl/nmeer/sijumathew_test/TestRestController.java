package com.abnamro.nl.nmeer.sijumathew_test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TestRestController {

    @Autowired
    private TestGateWay workUnitGateway;

    @RequestMapping("/send")
    public String hello(){

        this.workUnitGateway.generateWork("ss");
        return "Send message ss";

    }

}
