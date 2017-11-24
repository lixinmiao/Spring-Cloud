package com.itmuch.cloud.controller;

import com.itmuch.cloud.entity.User;
import com.itmuch.cloud.repository.UserRepository;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    private static final Logger LOG = Logger.getLogger(UserController.class.getName());

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/simple")
    public User findById(@RequestParam Long id)
    {
        LOG.log(Level.INFO, "calling trace findById  ");

        return userRepository.findOne(id);
    }


}
