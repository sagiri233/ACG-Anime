package com.example.controller;

import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import com.example.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private StudentMapper studentMapper;
    @GetMapping("/student")
    Result<Student>getStudent(){
        Student student = studentMapper.selectById(1);
        return Result.success(student);
    }
    @PostMapping("/stu")
    Result<Student>getStudents(Student student){
        System.out.println(student.getName());
        System.out.println(student.getAge());
        Student students= studentMapper.getStudentById(1);
        return Result.success(students);
    }
}
