package com.example.tutor7.dao;

import java.util.List;

import com.example.tutor7.model.StudentModel;

public interface StudentDAO {
	StudentModel selectStudent (String npm);
	
	List<StudentModel> selectAllStudents ();
}