package com.example.students.model;

import java.util.Objects;

public class Student {

    private final String id;
    private String name;
    private String depId;
    private int age;

    public Student(String id, String name, String depId, int age) {
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

    public String getId() {
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
        return age == student.age && id.equals(student.id) && name.equals(student.name) && depId.equals(student.depId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, depId, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", depId='" + depId + '\'' +
                ", age=" + age +
                '}';
    }
}
