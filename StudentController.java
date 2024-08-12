package org.javapatil.adityaproject.controller;

import java.util.List;

import org.javapatil.adityaproject.extractor.StudentListExtractor;
import org.javapatil.adityaproject.model.StudentForm;
import org.javapatil.adityaproject.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value="student")
public class StudentController {

	private StudentService studentService;
	
	@GetMapping
	public List<StudentForm> getStListCtrl()
	{	
	List<StudentForm> stduList=studentService.getStudListService();
	return stduList;
	}
}
