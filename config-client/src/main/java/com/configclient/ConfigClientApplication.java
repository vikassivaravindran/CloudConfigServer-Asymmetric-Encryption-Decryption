package com.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
	
	@Value("${user.name}")
	private String username;
	
	@Value("${user.password}")
	private String password;
	
	
	@GetMapping(value="/api/message")
	public String getMessage(){
		return String.format("Hello %s your password is %s",username,password);
	}
}
