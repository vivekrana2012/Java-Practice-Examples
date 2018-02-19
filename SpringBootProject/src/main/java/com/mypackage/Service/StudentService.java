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

    public Student getStudentById(int id){
        return studentRepo.findOne(id);
    }

    public String removeStudentById(int id){
        studentRepo.delete(id);
        return "ok";
    }

    public String updateStudent(Student student){
        studentRepo.delete(student.getId());
        studentRepo.save(student);
        return "ok";
    }

    public String insertStudent(Student student){
        studentRepo.save(student);
        return "ok";
    }
}
