package com.example.tutor7.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutor7.model.CourseModel;
import com.example.tutor7.service.StudentService;

@RestController
@RequestMapping("/rest")
public class CourseRestController {
	@Autowired
	StudentService studentService;
	
	//latihan 2
	@RequestMapping("/course/view/{id_course}")
	public CourseModel view(
			@PathVariable(value = "id_course") 
			String id_course) {
		CourseModel course = 
				studentService.selectCourse(id_course);
		return course;
	}
	
	//latihan 2
	@RequestMapping("/course/viewall")
	public List<CourseModel> viewAll() {
		List<CourseModel> course = 
				studentService.selectAllCourses();
		return course;
	}
}
