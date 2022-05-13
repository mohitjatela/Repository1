package com.restapi.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringBootCreatingRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCreatingRestApiApplication.class, args);
	}

}
