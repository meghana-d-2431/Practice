package curd2.restapis.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import curd2.restapis.entity.Student;

@RestController
public class StudentController {
    
    @PostMapping("/api/students")
    public void saveStudent( @RequestBody Student student) { // it is mandatory student object should be in json format and it will be converted to java object by spring boot
        // Logic to save student
        System.out.println(student);
    }

}
