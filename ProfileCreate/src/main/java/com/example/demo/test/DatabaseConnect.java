package com.example.demo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class DatabaseConnect {
	
	@Value("${database}")
	private String database;
	@Value("${dbname}")
	private String dbname;
	@Value("${password}")
	private String password;
	
	public void display() {
		System.out.println("Database is "+database);
		System.out.println("Dbname is "+dbname);
		System.out.println("Password is "+password);
		
			
		}
	}
