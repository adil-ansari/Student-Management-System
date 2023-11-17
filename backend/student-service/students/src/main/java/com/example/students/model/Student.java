package com.example.students.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name="students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column
    private String name;
    @Column
    private String depId;
    @Column
    private int age;

    public Student(){

    }

    public Student(long id, String name, String depId, int age) {
        this.id = id;
        this.name = name;
        this.depId = depId;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepId(String depId) {
        this.depId = depId;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepId() {
        return depId;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && age == student.age && name.equals(student.name) && depId.equals(student.depId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, depId, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", depId='" + depId + '\'' +
                ", age=" + age +
                '}';
    }
}
