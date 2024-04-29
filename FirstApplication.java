package com.etekhno.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstApplication.class, args);
	}

	@GetMapping("/info")
	public String getAppName(){
		return "First Spring boot app.";
	}

	@GetMapping("/status")
	public String getAppStatus(){
		return "First Spring boot app status is healthy.";
	}
}
