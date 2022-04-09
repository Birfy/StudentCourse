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

    @OneToMany(mappedBy = "department")
    private Set<Student> students;

    @OneToMany(mappedBy = "department")
    private Set<Teacher> teachers;

    @OneToMany(mappedBy = "department")
    private Set<Course> courses;

}
