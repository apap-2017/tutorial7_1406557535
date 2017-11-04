package com.example.tutor7.dao;

import java.util.List;

import com.example.tutor7.model.CourseModel;

public interface CourseDAO {
	CourseModel selectCourse (String id_course);
	
	List<CourseModel> selectAllCourses();
}
