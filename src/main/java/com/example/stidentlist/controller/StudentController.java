package com.example.stidentlist.controller;

import com.example.stidentlist.entity.Student;
import com.example.stidentlist.servis.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService ;

    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";


    }
    @GetMapping("/students/new")
    public String crateSdudent( Model model){
        Student student= new Student() ;
        model.addAttribute("student",student);
        return "create_student";


    }
    @PostMapping("/students")
    public String saveStudent(@ModelAttribute ("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";


    }



}
