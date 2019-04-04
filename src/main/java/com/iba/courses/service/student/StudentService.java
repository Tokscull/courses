package com.iba.courses.service.student;


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
        return studentRepository.getAllStudents();
    }

   public void insertStudent(Student student) {
        studentRepository.insertStudent(student.getName(),student.getLogin(),student.getPassword(),
                                         student.getUniversity(),student.getCourse());
    }


   public void deleteStudentById(Integer id) {
        studentRepository.deleteStudentById(id);
    }
}
