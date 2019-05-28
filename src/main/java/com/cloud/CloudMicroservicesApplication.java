package com.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CloudMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudMicroservicesApplication.class, args);
	}

}
