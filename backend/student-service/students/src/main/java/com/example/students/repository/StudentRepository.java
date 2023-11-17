package com.example.students.repository;

import com.example.students.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

//    public Optional<Student> updateById(Student updatedStudent, long id);

    }
