package com.mybatis.test;

import org.junit.Before;

import com.mybatis.dao.IStudentDao1;
import com.mybatis.dao.impl.StudentDaoImpl2;

public class Mytest2 {
	private IStudentDao1 dao;
	@Before
	public void before(){
		 dao = new StudentDaoImpl2();	
	}
   /* @Test
	public void testInsert(){
		
		Student student = new Student("李四", 15, 98);
		
	    dao.insertStu(student);
	}*/
    /*@Test
	public void testInsert(){
		
		Student student = new Student("李二狗", 15, 98);
		System.out.println(student);
	    dao.insertStudentCacheId(student);
	    System.out.println(student);
	}*/
    /*@Test
	public void testInsert(){
		
		int id = 15;
		
	    dao.deleteById(id);
	    
	}*/
	/*@Test
	public void testInsert(){
		
		Student student = new Student();
		student.setId(19);
		student.setName("小花");
		student.setAge(18);
		student.setScore(98);
		
	    dao.updateStu(student);
	    
	}*/
	/*@Test
    public void testInsert(){
		
		List<Student> students = dao.selectStu();
		
		for(Student student:students){
			System.out.println(student);
		}
	    
	}*/
	/*@Test
	 public void testInsert(){
			
			Map<String, Object> map = dao.selectAllStudentsMap();
			
			
				System.out.println(map.get("李二狗"));
			
		    
		}*/
	/*@Test
	 public void testInsert(){
	  
		int id=16;
		Student student = dao.selectStuById(id);
		System.out.println(student);
	  
		}*/
	/*@Test
	 public void testInsert(){
	  
		String name="李";
		List<Student> students = dao.selectStuByName(name);
		for(Student student:students){
			System.out.println(student);
		}
	  
		}*/
}
