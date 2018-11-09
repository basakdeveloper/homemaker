package com.basak.homemaker.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class HomemakerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomemakerConfigServerApplication.class, args);
	}
	
}
