package com.example.stidentlist;

import com.example.stidentlist.entity.Student;
import com.example.stidentlist.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StidentListApplication implements CommandLineRunner  {
	private  StudentRepository  repository;


	public static void main(String[] args) {
		SpringApplication.run(StidentListApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Student student = new Student("vadim","mavfa","Andrei@mail.com");
		Student student1 = new Student("Adnrei","mavfa","Andrei@mail.com");
		Student student2 = new Student("vadim","mavfa","Andrei@mail.com");
		Student student3 = new Student("vadim","mavfa","Andrei@mail.com");
		Student student4 = new Student("vadim","mavfa","Andrei@mail.com");
		repository.save(student);
		repository.save(student1);
		repository.save(student2);
		repository.save(student3);
		repository.save(student4);

	}
}
