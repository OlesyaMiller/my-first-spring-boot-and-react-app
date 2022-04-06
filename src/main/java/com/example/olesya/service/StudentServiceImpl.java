package com.example.olesya.service;

import com.example.olesya.model.Student;
import com.example.olesya.repository.StudentRepository;


import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceImpl implements StudentService  {
    
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student saveStudent(Student student) {
        return null;
    }
}
