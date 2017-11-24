package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class MicroserviceSleuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroserviceSleuthApplication.class, args);
    }
}
