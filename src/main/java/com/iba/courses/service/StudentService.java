package com.iba.courses.service;


import com.iba.courses.domain.Student;
import com.iba.courses.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudent() {
        System.out.println("Service getAllStudent");
        return studentRepository.getAllStudents();
    }

   public void insertStudent(Student student) {
        studentRepository.insertStudent(student.getName(),student.getLogin(),student.getPassword(),
                                         student.getUniversity(),student.getCourse());
        System.out.println("Service insertStudent");
    }



    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    public void deleteStudentById(Long id) {
        studentRepository.deleteStudentById(id);
    }
}
