package com.luv2ciode.demo.rest;


import com.luv2ciode.demo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    public void LaodData() {

        students = new ArrayList<>();
        students.add(new Student("Roman", "Lahovcyh", "roman@gmail.com", 253232, 50));
        students.add(new Student("Maksym", "Slidarchuk", "maksyn@gmail.com", +48523523, 32));
        students.add(new Student("Ustym", "Yat", "ustym@gmail.com", +485114312, 40));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {
        if (studentId < 0 || studentId > students.size()) {
            throw new StudntNotFoundException("Student id " + studentId + " not found");
        }
        return students.get(studentId);
    }


}
