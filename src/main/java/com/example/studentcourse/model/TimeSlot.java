package com.example.studentcourse.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;
import java.util.Set;

@Data
@Entity
@Table(name = "time_slots")
public class TimeSlot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "start_time", nullable = false)
    private Time startTime;

    @Column(name = "end_time", nullable = false)
    private Time endTime;

    @Column(name = "weekday", nullable = false)
    private WeekdayType weekday;

    @ManyToMany
    private Set<Course> courses;
}

enum WeekdayType {
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY
}
