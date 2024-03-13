package com.gabrielpaez.sudentmanagmentbackendapp.services;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielpaez.sudentmanagmentbackendapp.controller.dao.StudentRepository;
import com.gabrielpaez.sudentmanagmentbackendapp.entity.Student;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createStudent(Student student) {

        if (student != null)
            studentRepository.save(student);

        return student;
    }

    @Override
    public List<Student> getAllstudents() {

        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(Long id) {

        if (id != null) {
            Student student = studentRepository.findById(id).orElse(null);
            if (student != null)
                return student;
        }
        return null;
    }

    @Override
    public Boolean deleteStudentById(Long id) {

        if (id != null) {
            Student student = studentRepository.findById(id).orElse(null);
            if (student != null) {
                studentRepository.deleteById(id);
                return true;
            }
        }
        return false;
    }

    @Override
    public Boolean updateStudentById(Long id, Student studentToUpdate) {

        if (id != null) {
            Optional<Student> studentOptional = studentRepository.findById(id);
            if (studentOptional.isPresent()) {
                Student student = studentOptional.get();
                if(studentToUpdate.getName() != null) student.setName(studentToUpdate.getName());
                if(studentToUpdate.getlastName() != null) student.setlastName(studentToUpdate.getlastName());
                if(studentToUpdate.getEmail() != null ) student.setEmail(studentToUpdate.getEmail());
                if(studentToUpdate.getAddress()!= null) student.setAddress(studentToUpdate.getAddress());
                if (studentToUpdate.getClassName() != null) student.setClassName(studentToUpdate.getClassName());
                if(student != null)
                studentRepository.save(student);
                return true;
            }
        }

        return false;
    }
}
