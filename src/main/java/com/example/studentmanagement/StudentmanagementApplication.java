package com.example.studentmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StudentmanagementApplication {


	public static void main(String[] args) {
		SpringApplication.run(StudentmanagementApplication.class, args);
		System.out.println("*******************************");
        System.out.println("server running on the port 8471");
		System.out.println("*******************************");
	}

	@GetMapping("/")
	public String Welcome(){
		return "welcome to our student management applicartion running on the port 8471";
	}
}
