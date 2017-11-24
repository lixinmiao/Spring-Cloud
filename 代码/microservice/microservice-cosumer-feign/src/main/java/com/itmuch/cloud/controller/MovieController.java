package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.service.MyFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MovieController {
    @Autowired
    MyFeignClient myFeignClient;

    @GetMapping(value="/movie/{id}")
    public User findById(@PathVariable Long id)
    {
        User user= this.myFeignClient.findById(id);
        return user;
    }

    @GetMapping(value="/movie1/{id}")
    public User findById1(@PathVariable Long id)
    {
        User user= this.myFeignClient.findById(id);
        return user;
    }
}
