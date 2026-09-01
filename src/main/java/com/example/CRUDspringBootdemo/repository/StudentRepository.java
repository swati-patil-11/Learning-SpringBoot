package com.example.CRUDspringBootdemo.repository;

import com.example.CRUDspringBootdemo.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {

     public static Student saveStudent(Student studentrq){
        Student s1 = new Student();
        s1.setAge(20);
        s1.setName("Swati");
        s1.setEmail("abc@gmail.com");
        s1.setRollno(1);
        s1.setSubject("DBMS");

        return s1;
    }
}
