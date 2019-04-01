package com.iba.courses.repository;

import com.iba.courses.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository  <Student, Long> {

    @Query("select student from Student student")
    List<Student> getAllStudents();


    @Transactional
    @Modifying
    @Query(value = "insert into student (name, login, password, university,course) values (:name, :login, :password, :university ,:course)",
            nativeQuery = true)
    void insertStudent(@Param("name") String name, @Param("login") String login,
                       @Param("password") String password, @Param("university") String university,
                       @Param("course") Integer course);



    @Transactional
    Long deleteStudentById(Long id);
}
