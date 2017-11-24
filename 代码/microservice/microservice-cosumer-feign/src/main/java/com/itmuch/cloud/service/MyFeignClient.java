package com.itmuch.cloud.service;

import com.itmuch.cloud.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "microservice-provider-user",fallback = MyFeignClientHystric.class)
public interface MyFeignClient {
    @RequestMapping(value = "/simple",method = RequestMethod.GET)
    User findById(@RequestParam(value = "id")  Long id);
}