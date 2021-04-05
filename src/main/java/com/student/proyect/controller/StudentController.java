package com.student.proyect.controller;

import com.student.proyect.model.Student;
import com.student.proyect.service.implementation.StudentServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {
@Autowired
    StudentServiceImplementation studentServiceImplementation;

@GetMapping
    public List<Student> getAllStudents(){
    return studentServiceImplementation.getAllStudents();
}

@GetMapping("/{idStudent}")
    public Optional<Student> getStudentsById(@PathVariable String idStudent){
    return studentServiceImplementation.getStudentsById(idStudent);
}

@PostMapping
 public String saveStudent(@RequestBody Student student){
    return studentServiceImplementation.saveStudents(student);
}

@DeleteMapping("/{idStudent}")
    public String deleteStudentsById(@PathVariable String idStudent){
    return  studentServiceImplementation.deleteStudentsById(idStudent);
}


}
