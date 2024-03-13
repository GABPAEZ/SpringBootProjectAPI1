package com.gabrielpaez.sudentmanagmentbackendapp.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielpaez.sudentmanagmentbackendapp.Student;
import com.gabrielpaez.sudentmanagmentbackendapp.services.IStudentService;
import java.util.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @Autowired
    private IStudentService service;

    @PostMapping("/Student")
    public ResponseEntity<Student> createStudent(@RequestBody Student student) {

        Student st = service.createStudent(student);

        return new ResponseEntity<>(st, HttpStatus.CREATED);
    }

    @GetMapping("/Student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Student student = service.getStudentById(id);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @GetMapping("/Students")
    public ResponseEntity<List<Student>> getAllStudents() {
        List<Student> students = service.getAllstudents();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @DeleteMapping("/Student/{id}")
    public ResponseEntity<String> delectStudentById(@PathVariable Long id) {

        Boolean isDeleted = service.deleteStudentById(id);

        if (isDeleted) {
            return new ResponseEntity<>("The student was deleted succesfully", HttpStatus.OK);
        }
        return new ResponseEntity<>("Student not found", HttpStatus.NOT_FOUND);
    }

    @PutMapping("/Student/{id}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Long id, @RequestBody Student student) {

        boolean updated = service.updateStudentById(id, student);
        if (updated)
            return new ResponseEntity<>("Student was udptated successfully", HttpStatus.CREATED);
        return new ResponseEntity<>("Student was not found", HttpStatus.NOT_FOUND);
    }

}
