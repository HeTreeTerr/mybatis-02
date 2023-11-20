package com.mybatis.test;

import org.junit.Before;
import org.junit.Test;

import com.mybatis.beans.Student;
import com.mybatis.dao.IStudentDao;
import com.mybatis.dao.impl.StudentDaoImpl;

public class Mytest {

	private IStudentDao dao;

	@Before
	public void before(){
		 dao = new StudentDaoImpl();	
	}

    @Test
	public void testInsert(){
		
		Student student = new Student("李四", 15, 98);
	    dao.insertStu(student);
	}
}
