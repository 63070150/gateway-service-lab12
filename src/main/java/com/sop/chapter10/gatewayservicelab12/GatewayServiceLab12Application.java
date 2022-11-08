package com.sop.chapter10.gatewayservicelab12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class GatewayServiceLab12Application {

	public static void main(String[] args) {

		SpringApplication.run(GatewayServiceLab12Application.class, args);
	}

}
