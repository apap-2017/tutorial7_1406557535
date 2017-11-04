package com.example.tutor7.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tutor7.model.StudentModel;
import com.example.tutor7.service.StudentService;

@RestController
@RequestMapping("/rest")
public class StudentRestController
{     
	@Autowired
    StudentService studentService;
	
	//contoh before latihan 1
    @RequestMapping("/student/view/{npm}")
    public StudentModel view (@PathVariable(value = "npm") String npm) {
        StudentModel student = studentService.selectStudent (npm);
        return student;
    }
    
    //latihan 1
    @RequestMapping("/student/viewall")
	public List<StudentModel> viewAll() {
		List<StudentModel> student = 
				studentService.selectAllStudents();
		return student;
	}
}

