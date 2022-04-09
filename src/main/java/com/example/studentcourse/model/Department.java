package com.example.studentcourse.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;


@Entity
@Data
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String name;

    @OneToMany
    private Set<Student> students;

    @OneToMany
    private Set<Teacher> teachers;

    @OneToMany
    private Set<Course> courses;

}
