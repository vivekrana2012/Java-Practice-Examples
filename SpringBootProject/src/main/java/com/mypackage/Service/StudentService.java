package com.mypackage.Service;

import com.mypackage.Dao.FakeStudentDaoImpl;
import com.mypackage.Dao.StudentRepo;
import com.mypackage.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class StudentService {

    @Autowired
     private StudentRepo studentRepo;

    public Iterable<Student> getAllStudents(){
        return studentRepo.findAll();
    }

//    public Student getStudentById(int id){
//        return fakeStudentDaoImpl.getStudentById(id);
//    }
//
//    public String removeStudentById(int id){
//        return fakeStudentDaoImpl.removeStudentById(id);
//    }
//
//    public String updateStudent(Student student){
//        return fakeStudentDaoImpl.updateStudent(student);
//    }
//
    public String insertStudent(Student student){
        studentRepo.save(student);
        return "ok";
    }
}
