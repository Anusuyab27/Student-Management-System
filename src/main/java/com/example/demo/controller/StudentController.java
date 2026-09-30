package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.service.StudentServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private final StudentService ser;

    public StudentController(StudentService ser) {
        this.ser = ser;
    }

    @GetMapping("/")
    public String home()
    {
        return "home";
    }
    @PostMapping("/save")
    public String saveStudent(Student s)
    {
        ser.addStudent(s);
        return "register";
    }
    @GetMapping("/addst")
    public String addStudent(Model m)
    {
        m.addAttribute("student",new Student());
        return "studentform";
    }
    @GetMapping("/viewst")
    public String viewStudent(Model m)
    {
        m.addAttribute("students",ser.getAllStudents());
        return "studentlist";
    }


}
