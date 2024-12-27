package com.example.ops_learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class OpsLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpsLearningApplication.class, args);
	}

	@RestController
	public class Hello {
		@GetMapping("/hello")
		public String sayHello(){
			return "Hello I m running :PP";
		}
	}

}
