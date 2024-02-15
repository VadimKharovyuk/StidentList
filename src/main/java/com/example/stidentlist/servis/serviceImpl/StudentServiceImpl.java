package com.example.stidentlist.servis.serviceImpl;

import com.example.stidentlist.entity.Student;
import com.example.stidentlist.repository.StudentRepository;
import com.example.stidentlist.servis.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);

    }

}
