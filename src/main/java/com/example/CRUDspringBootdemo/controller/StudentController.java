package com.example.CRUDspringBootdemo.controller;

import com.example.CRUDspringBootdemo.entity.Student;
import com.example.CRUDspringBootdemo.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentController  {

    private StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @PostMapping("/create")
    public Student createStudent(@RequestBody Student s){
        Student createdStudent = studentService.createStudent(s);
        return createdStudent;

    }
}
