package com.example.studentcourse.service;

import com.example.studentcourse.model.Department;
import com.example.studentcourse.repository.DepartmentRepository;



public class DepartmentService {

    private DepartmentRepository departmentRepository;

    public DepartmentService(DepartmentRepository departmentRepository) {
        super();
        this.departmentRepository = departmentRepository;
    }

    public Department getDepartmentById(long id) {
        return departmentRepository.getById(id);
    }
}
