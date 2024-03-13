package com.gabrielpaez.sudentmanagmentbackendapp.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.gabrielpaez.sudentmanagmentbackendapp.Student;

@Service
public class StudentServiceImpl implements IStudentService {

    // rememeber the arraus are inmutable you cant change the state

    // List<Student> students = Arrays
    // .asList(new Student("Gabriel", "gabriel@test.com", "jorge", "av. europa 123",
    // "Java", "1"),
    // new Student("Sofia", "sofia@test.com", "raul", "Estancia 254", "Python",
    // "2"),
    // new Student("Alberto", "alberto@test.com", "nissan", "españa 123",
    // "abogacia", "3"));

    List<Student> students = new ArrayList<Student>();
    private Long nextId = 1L;

    @Override
    public Student createStudent(Student student) {

        // logic here
       
        student.setId(nextId++);
        students.add(student);
        System.out.println("Student data " + student);
        return student;
    }

    @Override
    public List<Student> getAllstudents() {

        return students;
    }

    @Override
    public Student getStudentById(Long id) {

        Student student = students.stream()
                .filter(st -> id.equals(st.getId()))
                .findAny()
                .orElse(null);

        return student;
    }

    @Override
    public Boolean deleteStudentById(Long id) {

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}
