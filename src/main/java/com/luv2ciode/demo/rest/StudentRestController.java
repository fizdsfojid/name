package com.luv2ciode.demo.rest;


import com.luv2ciode.demo.entity.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Roman", "Lahovcyh", "roman@gmail.com", 253232, 50));
        students.add(new Student("Maksym", "Slidarchuk", "maksyn@gmail.com", +48523523, 32));
        students.add(new Student("Ustym", "Yat", "ustym@gmail.com", +485114312, 40));

        return students;
    }
}
