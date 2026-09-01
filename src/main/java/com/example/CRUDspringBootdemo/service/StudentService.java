package com.example.CRUDspringBootdemo.service;

import com.example.CRUDspringBootdemo.entity.Student;
import com.example.CRUDspringBootdemo.repository.StudentRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){

        this.studentRepository = studentRepository;
    }

        public Student createStudent(Student studrq){
            Student studentResp = StudentRepository.saveStudent(studrq);
            return studentResp;
        }

}
