package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroserviceSimpleProviderUserApplication3 {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceSimpleProviderUserApplication3.class, args);
	}
}
