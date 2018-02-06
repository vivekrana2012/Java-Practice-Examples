package com.mypackage.Service;

import com.mypackage.Dao.FakeStudentDaoImpl;
import com.mypackage.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    FakeStudentDaoImpl fakeStudentDaoImpl;

    public Collection<Student> getAllStudents(){
        return fakeStudentDaoImpl.getAllStudents();
    }

    public Student getStudentById(int id){
        return fakeStudentDaoImpl.getStudentById(id);
    }

    public String removeStudentById(int id){
        return fakeStudentDaoImpl.removeStudentById(id);
    }

    public String updateStudent(Student student){
        return fakeStudentDaoImpl.updateStudent(student);
    }

    public String insertStudent(Student student){
        return fakeStudentDaoImpl.insertStudent(student);
    }
}
