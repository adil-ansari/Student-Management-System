package com.example.students.controller;

import com.example.students.StudentsApplication;
import com.example.students.model.Student;
import com.example.students.repository.StudentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Student> findAll(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable String id){
        return repository.findById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Student create(@RequestBody Student student){
        return repository.create(student);
    }

    @ResponseStatus(HttpStatus.OK)
    @PutMapping
    public Student updateById(@RequestBody Student student){
        return repository.update(student, student.getId());
    }


    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public Student deleteById(@PathVariable String id){
        return repository.deleteById(id);
    }
}
