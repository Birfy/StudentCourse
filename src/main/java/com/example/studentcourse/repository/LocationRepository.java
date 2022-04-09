package com.example.studentcourse.repository;

import com.example.studentcourse.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
