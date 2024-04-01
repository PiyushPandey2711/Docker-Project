package com.nagarro.training.notesapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class NotesapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotesapiApplication.class, args);
	}
	@GetMapping("/message")
	public String message() {
		return "this is demo spring project";
	}
}
