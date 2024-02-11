package com.example.stidentlist.controller;

import com.example.stidentlist.servis.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class StudentController {
    private final StudentService studentService ;

    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("student",studentService.getAllStudents());
        return "students";


    }


}
