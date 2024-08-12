package org.javapatil.adityaproject.dao.impl;

import java.util.List;

import org.javapatil.adityaproject.dao.StudentDao;
import org.javapatil.adityaproject.extractor.StudentListExtractor;
import org.javapatil.adityaproject.model.StudentForm;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	private StudentListExtractor studentListExtractor;
	@Override
	public List<StudentForm> getStudList() {

	List<StudentForm> studList=jdbcTemplate.query("Select * from student order by sno", studentListExtractor::extractData);		
		return studList;
	}
	
}