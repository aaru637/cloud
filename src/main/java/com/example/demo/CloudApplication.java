package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CloudApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
	}

	@RequestMapping("/")
	public String hello() {
		return "Welcome";
	}

	@RequestMapping("/prime")
	public String prime(@RequestParam int number) {
		boolean flag = false;
		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0) {
				flag = true;
				break;
			}
		}
		return number + " " + (!flag ? "is a Prime Number." : "is not a Prime Number");
	}

}
