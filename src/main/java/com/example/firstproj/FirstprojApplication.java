package com.example.firstproj;

import com.example.firstproj.model.User;
import com.example.firstproj.repository.UsersRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class FirstprojApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstprojApplication.class, args);
	}
}
