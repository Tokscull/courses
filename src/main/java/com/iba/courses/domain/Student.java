package com.iba.courses.domain;

import lombok.*;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Student")
public class Student {

    @Id
    @Getter
    @Setter
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Getter
    @Setter
    @Column(name = "name")
    @NonNull
    private String name;


    @Getter
    @Setter
    @Column(name = "login")
    @NonNull
    private String login;


    @Getter
    @Setter
    @Column(name = "password")
    @NonNull
    private String password;


    @Getter
    @Setter
    @Column(name = "university")
    @NonNull
    private String university;


    @Getter
    @Setter
    @Column(name = "course")
    @NonNull
    private Integer course;


}
