package com.example.stidentlist;

import com.example.stidentlist.entity.Student;
import com.example.stidentlist.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StidentListApplication  {

	public static void main(String[] args) {
		SpringApplication.run(StidentListApplication.class, args);
	}


}
