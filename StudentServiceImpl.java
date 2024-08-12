package org.javapatil.adityaproject.service.impl;

import java.util.List;

import org.javapatil.adityaproject.dao.StudentDao;
import org.javapatil.adityaproject.model.StudentForm;
import org.javapatil.adityaproject.service.StudentService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService{
	private StudentDao studentDao;

	@Override
	public List<StudentForm> getStudListService() {
		
		List<StudentForm> studList=studentDao.getStudList();
		
		return studList;
	}

	}