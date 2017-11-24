package com.itmuch.cloud.service;

import com.itmuch.cloud.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class MyFeignClientHystric implements MyFeignClient {
    @Override
    public User findById(@RequestParam(value = "id")  Long id) {
        User user= new User();
        user.setId(id);
        user.setUsername("error");
        return user;
    }
}
