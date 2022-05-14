package com.amer.spring.cloud.git;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitDemoApplication {

	@GetMapping("/")
	public String hellow()
	{
		return " hello from first git project git demo version 06" ;
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(GitDemoApplication.class, args);
	}

}
