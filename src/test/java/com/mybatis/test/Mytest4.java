package com.mybatis.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.beans.Student;
import com.mybatis.dao.IStudentDao2;
import com.mybatis.utils.MyBatisUtils;
//省去impl文件，直接和mapper.xml对接
public class Mytest4 {
	private IStudentDao2 dao;
	private SqlSession sqlSession;
	private Student student;
	@Before
	public void before(){
		sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(IStudentDao2.class);	
	}
	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}

	
	//多条件查询
    /*@Test
	 public void testInsert(){
    	student = new Student("lele",18,60);
    	Map<String, Object> map =new HashMap<String, Object>();
    	map.put("nameCon", "李");
    	map.put("ageCon", "15");
    	//map.put("scoreCon","59" );
    	map.put("student", student);
		List<Student> students = dao.selectStudentsByCondition(map);
		for(Student student:students){
			System.out.println(student);
		}
	  
		}*/
	/*@Test
	public void testInsert(){
		
		String name = "李二狗";
		int age = 14;
		List<Student> students = dao.selectStudentsByCondition1(name, age);
		
		for(Student student:students){
			System.out.println(student);
		}
	  
	}*/
	/*@Test
	public void testInsert(){
		
		student = new Student("",18,60);
		List<Student> students = dao.selectStudentsByCondition2(student);
		
		for(Student student:students){
			System.out.println(student);
		}
	  
	}*/
	
	/*@Test
	public void testInsert(){
		
		student = new Student("",0,60);
		List<Student> students = dao.selectStudentsByCondition3(student);
		
		for(Student student:students){
			System.out.println(student);
		}
	  
	}*/
	
	/*@Test
	public void testInsert(){
		
		student = new Student("",10,60);
		List<Student> students = dao.selectStudentsByCondition4(student);
		
		for(Student student:students){
			System.out.println(student);
		}
	  
	}*/
	/*@Test	
    public void testInsert(){
		
		int ids [] = {1,4};
		List<Student> students = dao.selectStudentsByCondition5(ids);
		
		for(Student student:students){
			System.out.println(student);
		}
	  
	}*/
	/*@Test	
    public void testInsert(){
		
		List<Integer> lis = new ArrayList<>();
		lis.add(1);
		lis.add(2);
		lis.add(4);
		List<Student> students = dao.selectStudentsByCondition6(lis);
		
		for(Student student:students){
			System.out.println(student);
		}
	  
	}*/
	
	@Test	
    public void testInsert(){
		List<Student> lis = new ArrayList<>();
		Student stu1 = new Student();
		stu1.setId(1);
		Student stu2 = new Student();
		stu2.setId(2);
		Student stu3 = new Student();
		stu3.setId(4);
		lis.add(stu1);
		lis.add(stu2);
		lis.add(stu3);
		
		List<Student> students = dao.selectStudentsByCondition7(lis);
		
		for(Student student:students){
			System.out.println(student);
		}
	  
	}
}
