package com.studentImpl.daoImpl;

import org.springframework.jdbc.core.JdbcTemplate;

import com.student.dao.StudentDao;
import com.student.dto.Student;

public class StudentImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	@Override
	public int create(Student student) {
       String sql="insert into Student values(?,?,?)";
      int result=jdbcTemplate.update(sql,student.getId(),student.getName(),student.getPhonenumber());
		return result;
	}
	
	@Override
	public int update(Student student) {
		String sql="update Student set name=?,phonenumber=? where id=?";
		int resultupdate = jdbcTemplate.update(sql,student.getName(),student.getPhonenumber(),student.getId());
		return resultupdate;
	}
	
	@Override
	public int delete(Student student) {
       String sql="delete from Student where id=?";
       int result=jdbcTemplate.update(sql, student.getId());
		return result;
	}
	
	/**
	 * @return the jdbcTemplate
	 */
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	/**
	 * @param jdbcTemplate the jdbcTemplate to set
	 */
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	




	
	
	
	

}
