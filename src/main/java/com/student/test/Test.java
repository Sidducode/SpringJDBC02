package com.student.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.student.dao.StudentDao;
import com.student.dto.Student;

public class Test {

	public static void main(String[] args) {

		ApplicationContext Context = new ClassPathXmlApplicationContext("com/student/test/config.xml");
		StudentDao stdDao = (StudentDao) Context.getBean("StudentDao");
		Student std = new Student();
		std.setId(0);
		//std.setName("RC ");
		//mstd.setPhonenumber(9177972690L);
		//int res=stdDao.create(std);
		//int res=stdDao.update(std);
		int res=stdDao.delete(std);
		System.out.println(res);
		
	}

}
