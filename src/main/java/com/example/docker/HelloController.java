package com.example.docker;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/welcome")
	public String welcome(){
		return "Spring Boot Docker Demo";
	}
	}
