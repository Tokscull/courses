package com.iba.courses.service;


import com.iba.courses.domain.Student;
import com.iba.courses.repoaitory.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        System.out.println("Service");
        return studentRepository.getAllStudents();
    }
}
