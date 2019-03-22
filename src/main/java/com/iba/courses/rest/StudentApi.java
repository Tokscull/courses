package com.iba.courses.rest;

import com.iba.courses.domain.Student;
import com.iba.courses.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/student")
public class StudentApi {


    @Autowired
    private StudentService studentService;

   @GetMapping("/getAllStudent")
    private List<Student>getAllStudent(){
        System.out.println("REST");
        return studentService.getAllStudent();
    }


    @PostMapping("/insertStudent")
    private void insertStudent(){
        Student student = new Student(1,"Kirylenka Yahor","123","321","bsuir",3);
        studentService.insertStudent(student);
        System.out.println("insert student");
    }

    @PostMapping("/addStudent")
    private void addStudent(@RequestBody Student student){
       studentService.addStudent(student);
    }



     /*
    @GetMapping("/greeting/{myVariable}")
    private String greeting(@PathVariable String myVariable){
        System.out.println("in our first rest");
        return  "Hello " + myVariable;
    }

    @PostMapping("/simplePost/{id}")
    private int postMethod(@RequestBody String s, @PathVariable int id){
        System.out.println(s);
        return id;

    }
     */
}
