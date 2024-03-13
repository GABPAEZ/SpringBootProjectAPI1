package com.gabrielpaez.sudentmanagmentbackendapp.controller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielpaez.sudentmanagmentbackendapp.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    //esto va a ser usando en el service otorgando los metodos para la bbdd que lo va a enviar al controller

}
