package com.example.studentcourse.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "student_course_relationship")
public class StudentCourseRelationship {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    Course course;

    @Column(name = "grade")
    private int grade;

    @Column(name = "status", nullable = false)
    private Status status;

}

enum Status {
    ENROLLED, WITHDRAWN, PASSED, FAILED
}
