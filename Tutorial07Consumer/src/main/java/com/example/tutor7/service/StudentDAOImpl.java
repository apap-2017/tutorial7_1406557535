package com.example.tutor7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.tutor7.dao.StudentDAO;
import com.example.tutor7.model.StudentModel;

@Service
public class StudentDAOImpl implements StudentDAO{
	@Autowired
	private RestTemplate restTemplate;
	
	@Override
	public StudentModel selectStudent(String npm) {
		StudentModel student = restTemplate.getForObject("http://localhost:8080/rest/student/view/"+npm, 
				StudentModel.class);
		return student;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<StudentModel> selectAllStudents() {
		List<StudentModel> students = restTemplate.getForObject("http://localhost:8080/rest/student/viewall", 
				List.class);
		return students;
	}

}
