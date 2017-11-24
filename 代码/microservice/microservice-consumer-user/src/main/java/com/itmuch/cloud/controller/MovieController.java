package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {

    private static final Logger LOG = Logger.getLogger(MovieController.class.getName());

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(value="/movie/{id}")
    public User findById(@PathVariable Long id)
    {
        LOG.log(Level.INFO, "calling trace findById  ");
        User user= this.restTemplate.getForObject("http://microservice-provider-user/simple?id="+id,User.class);
        return user;
    }

    @GetMapping(value="/movie1/{id}")
    public User findById1(@PathVariable Long id)
    {
        User user= this.restTemplate.getForObject("http://microservice-provider-user/simple?id="+id,User.class);
        return user;
    }
}
