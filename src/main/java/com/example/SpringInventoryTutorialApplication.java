package com.example;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringInventoryTutorialApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringInventoryTutorialApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringInventoryTutorialApplication.class, args);

	}
}
