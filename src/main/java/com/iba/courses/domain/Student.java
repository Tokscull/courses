package com.iba.courses.domain;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "login")
    @NonNull
    private String login;


    @Column(name = "password")
    @NonNull
    private String password;


    @Column(name = "university")
    @NonNull
    private String university;

    @Column(name = "course")
    @NonNull
    private Integer course;


}
