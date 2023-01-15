package com.greatlearning.assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.assignment1.service.EmployeeService;

@SpringBootApplication
public class Assignment1Application implements CommandLineRunner {

	@Autowired
	EmployeeService employeeServiceImpl;

	public static void main(String[] args) {
		SpringApplication.run(Assignment1Application.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

	}

}
