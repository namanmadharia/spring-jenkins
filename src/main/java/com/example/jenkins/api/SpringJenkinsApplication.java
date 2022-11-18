package com.example.jenkins.api;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class SpringJenkinsApplication {

	public static org.slf4j.Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	public inti() {
		logger.info("App started...");
	}
	public static void main(String[] args) {
		logger.info("Application executed...");
		System.out.println("Runnnig");
		SpringApplication.run(SpringJenkinsApplication.class, args);
	}

}
