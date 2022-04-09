package com.example.studentcourse.service;

import com.example.studentcourse.model.Student;
import com.example.studentcourse.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {


    private StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }


    public List<Student> addStudents(List<Student> studentList) {

        return studentRepository.saveAll(studentList);

    }


    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }


    public Student getStudentById(long id) {
        return studentRepository.getById(id);
    }


    public Student updateStudent(Student student, long id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(
                RuntimeException::new);


        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());

        studentRepository.save(existingStudent);
        return existingStudent;
    }

    public Student deleteStudent(long id) {
        Student existingStudent = studentRepository.findById(id).orElseThrow(
                RuntimeException::new);

        studentRepository.deleteById(id);
        return existingStudent;
    }
}
