package com.cz.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"com.cz.controller"})
public class Appaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Appaction.class, args);
	}

}
