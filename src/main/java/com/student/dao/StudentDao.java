package com.student.dao;

import com.student.dto.Student;

public interface StudentDao {

	 int create(Student student);
	 
	 int update(Student student);
	 
	 int delete(Student student);
}
