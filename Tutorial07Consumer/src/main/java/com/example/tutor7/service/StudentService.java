package com.example.tutor7.service;

import java.util.List;

import com.example.tutor7.model.CourseModel;
import com.example.tutor7.model.StudentModel;

public interface StudentService
{
    StudentModel selectStudent (String npm);

    List<StudentModel> selectAllStudents ();

    void addStudent (StudentModel student);

    void deleteStudent (String npm);
    
    void updateStudent (StudentModel student);
    
    CourseModel selectCourse (String id);
    
    List<CourseModel> selectAllCourse ();
}