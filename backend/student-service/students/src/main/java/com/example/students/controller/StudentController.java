package com.example.students.controller;

import com.example.students.StudentsApplication;
import com.example.students.model.Student;
import com.example.students.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentController {

    Logger logger = LoggerFactory.getLogger(StudentController.class);

    private StudentRepository repository;

    public StudentController(StudentRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Student> findAll(){
        logger.info("Processing request: GET /students");
        return repository.findAll();

    }

    @GetMapping("/{id}")
    public Optional<Student> findById(@PathVariable long id){
        logger.info("Processing request: GET /students/"+id);
        return repository.findById(id);

    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Student create(@RequestBody Student student){
                return repository.save(student);
    }

//    @ResponseStatus(HttpStatus.OK)
//    @PutMapping
//    public Optional<Student> updateById(@RequestBody Student student){
//        return repository.updateById(student, student.getId());
//    }


    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id){
        repository.deleteById(id);
    }
}
