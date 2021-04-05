package com.student.proyect.service.implementation;

import com.student.proyect.model.Student;
import com.student.proyect.repository.StudentRepository;
import com.student.proyect.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class StudentServiceImplementation implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Optional<Student> getStudentsById(String idStudent) {
        return studentRepository.findById(idStudent);
    }

    @Override
    public String saveStudents(Student student) {
        studentRepository.save(student);
        return "Student was saved";
    }

    @Override
    public String deleteStudentsById(String idStudent) {
        studentRepository.deleteById(idStudent);
        return "Student was delete";
    }


}
