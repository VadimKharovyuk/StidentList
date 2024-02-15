package com.example.stidentlist.controller;

import com.example.stidentlist.entity.Student;
import com.example.stidentlist.servis.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/student/edit/{id}")
    public String editStudent(@PathVariable Long id ,Model model) {
        model.addAttribute("student",studentService.getById(id));
        return "edit_student";


    }
    @PostMapping("/students/{id}")
    public String update( @PathVariable Long id ,@ModelAttribute ("student")Student student ,Model model){
        Student existStudent = studentService.getById(id);
        existStudent.setId(student.getId());
        existStudent.setFirstName(student.getFirstName());
        existStudent.setEmail(student.getEmail());
        existStudent.setLastName(student.getLastName());

        studentService.saveStudent(existStudent);
        return "redirect:/students" ;



    }




}
