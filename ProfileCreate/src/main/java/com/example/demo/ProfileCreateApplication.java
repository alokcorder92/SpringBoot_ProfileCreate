package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.test.DatabaseConnect;

@SpringBootApplication
public class ProfileCreateApplication {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(ProfileCreateApplication.class, args);
		DatabaseConnect databaseConnect=context.getBean("databaseConnect",DatabaseConnect.class);
		databaseConnect.display();
		
	}

}
