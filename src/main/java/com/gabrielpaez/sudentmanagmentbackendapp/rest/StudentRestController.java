package com.gabrielpaez.sudentmanagmentbackendapp.rest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gabrielpaez.sudentmanagmentbackendapp.Student;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @PostMapping("/Student")
    public Student createStudent(@RequestBody Student student) {

        System.out.println("Student data " + student);
        return student;
    }
}
