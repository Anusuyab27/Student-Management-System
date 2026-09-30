package com.example.demo.service;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentService {
    void addStudent(Student st);
    List<Student> getAllStudents();
}