package com.example.studentcourse.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "locations")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "building", nullable = false)
    private String building;

    @Column(name = "room", nullable = false)
    private String room;

    @OneToMany(mappedBy = "location")
    private Set<Course> courses;
}
