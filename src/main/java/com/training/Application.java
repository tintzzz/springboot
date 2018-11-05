package com.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class Application {
	
	@Autowired
	RestTemplate template;
	
	public static void main(String args[]){
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}

	
}
 