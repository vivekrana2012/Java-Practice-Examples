package com.mypackage.Dao;

import com.mypackage.Entity.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    String removeStudentById(int id);

    String updateStudent(Student student);

    String insertStudent(Student student);
}
