package com.student.proyect.service;

import com.student.proyect.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    List<Student> getAllStudents();
    Optional<Student> getStudentsById(String idStudent);
    String saveStudents(Student student);
    String deleteStudentsById(String idStudent);
}
