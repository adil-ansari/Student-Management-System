package com.example.students.repository;

import com.example.students.StudentsApplication;
import com.example.students.model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    List<Student> students = new ArrayList<>();

    public StudentRepository() {
        this.students.add(new Student("1","Mit", "1", 26));
        this.students.add(new Student("2","Adil", "1", 26));
        this.students.add(new Student("3","Avinash", "2", 24));
        this.students.add(new Student("4","Akash", "1", 24));
        this.students.add(new Student("5","Meghna", "3", 24));
    }


    public List<Student> findAll(){
        return this.students;
    }

    public Student findById(String id){
        for(Student s : students){
            if(s.getId().equals(id)){
                return s;
            }
        }
        return null;
    }

    public Student create(Student student){
        students.add(student);
        return student;
    }

    public Student deleteById(String id) {
        Student deletedStudent = null;
        for (Student s : students) {
            if (s.getId().equals(id)) {
                deletedStudent = s;
                students.remove(s);
                break;
            }
        }
        return deletedStudent;
    }

    public Student update(Student updatedStudent, String id) {
        Student updated = null;
        for (Student s : students) {
            if (s.getId().equals(id)) {
                s.setName(updatedStudent.getName());
                s.setAge(updatedStudent.getAge());
                s.setDepId(updatedStudent.getDepId());
                updated = updatedStudent;
                break;
            }
        }
        return updated;
    }

    }
