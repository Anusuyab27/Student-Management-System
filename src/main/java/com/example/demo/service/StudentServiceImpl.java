package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    StudentRepository rep;

    public StudentServiceImpl(StudentRepository rep) {
        this.rep = rep;
    }

    @Override
    public void addStudent(Student st) {
        rep.save(st);
    }

    @Override
    public List<Student> getAllStudents() {
        return rep.findAll();
    }
}
