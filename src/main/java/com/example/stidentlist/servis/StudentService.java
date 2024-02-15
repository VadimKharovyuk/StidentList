package com.example.stidentlist.servis;

import com.example.stidentlist.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student) ;
}
