package com.example.studentcourse.contoller;

import com.example.studentcourse.model.Student;
import com.example.studentcourse.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    @PostMapping()
    public ResponseEntity<List<Student>> saveStudent(@RequestBody List<Student> students) {
        return new ResponseEntity<>(studentService.addStudents(students), HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<List<Student>> getAllEmployee() {
        return new ResponseEntity<>(studentService.getAllStudents(), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Student> getStudents(@PathVariable("id") long studentId) {
        return new ResponseEntity<>(studentService.getStudentById(studentId), HttpStatus.OK);
    }

    @PutMapping({"{id}"})
    public ResponseEntity<Student> updateEmployee(@RequestBody Student student,
                                                   @PathVariable("id") long studentId) {
        return new ResponseEntity<>(studentService.updateStudent(student, studentId), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long studentId) {
        studentService.deleteStudent(studentId);
        return new ResponseEntity<>("Employee deleted successfully!", HttpStatus.OK);
    }
}
