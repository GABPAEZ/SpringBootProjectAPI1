package com.gabrielpaez.sudentmanagmentbackendapp.services;

import java.util.List;

import com.gabrielpaez.sudentmanagmentbackendapp.Student;

public interface IStudentService {

    public Student createStudent(Student student);

    public List<Student> getAllstudents();

    public Student getStudentById(Long id);

    public Boolean deleteStudentById(Long id);
}
