package com.itmuch.cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MicroserviceConfigClientController {

    @Value("${name}")
    String name;
    @RequestMapping(value = "/hi")
    public String hi(){
        return name;
    }
}
