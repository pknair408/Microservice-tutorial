package com.sniqsys.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

public class UserLoginServiceTwoApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserLoginServiceTwoApplication.class, args);
	}

}
