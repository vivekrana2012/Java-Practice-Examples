package com.mypackage.Controller;

import com.mypackage.Entity.Student;
import com.mypackage.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentService studentService;

    @RequestMapping(value="/all", method = RequestMethod.GET)
    public Iterable<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

//    @RequestMapping(value="/{id}", method = RequestMethod.GET)
//    public Student getStudentById(@PathVariable("id") int id){
//        return studentService.getStudentById(id);
//    }
//
//    @RequestMapping(value="/remove/{id}", method = RequestMethod.DELETE)
//    public String removeStudentById(@PathVariable("id") int id){
//        return studentService.removeStudentById(id);
//    }
//
//    @RequestMapping(value = "/update", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
//    public String updateStudent(@RequestBody Student student){
//        return studentService.updateStudent(student);
//    }
//
    @RequestMapping(value = "/add", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }
}
