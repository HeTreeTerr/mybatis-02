package com.mybatis.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.beans.Student;
import com.mybatis.dao.IStudentDao1;
import com.mybatis.utils.MyBatisUtils;
//省去impl文件，直接和mapper.xml对接
public class Mytest3 {
	private IStudentDao1 dao;
	private SqlSession sqlSession;
	@Before
	public void before(){
		sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(IStudentDao1.class);	
	}
	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
   /* @Test
	public void testInsert(){
		
		Student student = new Student("李四", 15, 98);
		
	    dao.insertStu(student);
	    sqlSession.commit();
	}*/
    /*@Test
	public void testInsert(){
		
		Student student = new Student("李二狗", 15, 98);
		System.out.println(student);
	    dao.insertStudentCacheId(student);
	    sqlSession.commit();
	    System.out.println(student);
	}*/
	/* @Test
	public void testInsert(){
		
		int id = 5;		
	    dao.deleteById(id);
	    sqlSession.commit();
	}*/
	/*@Test
	public void testInsert(){
		
		Student student = new Student();
		student.setId(19);
		student.setName("小花");
		student.setAge(18);
		student.setScore(98);
		
	    dao.updateStu(student);
	    sqlSession.commit();
	}*/
    @Test
    public void testInsert(){
		
		List<Student> students = dao.selectStu();
		
		for(Student student:students){
			System.out.println(student);
		}
	    
	}
	/*@Test
	 public void testInsert(){
			//不能正常执行，找不到key键
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
	/*@Test
	 public void testInsert(){
	  //调用两次sql语句只执行了一次，所以他证明了一级缓存的存在
		//强制开启，不可关闭
		//缓存底层实现是一个Map，Map的value是查询结果
		//Map的key，即查询依据，使用的ORM架构不同，查询依据是不同的
		//mybatis的查询依据：sql的id+sql语句
		//hibernate的查询依据是：查询结果对象的id
		//增删改对一级缓存的影响：会刷新（清空）缓存，无论是否提交
		int id=2;
		Student student = dao.selectStuById(id);
		System.out.println(student);
	    
		Student student1 = dao.selectStuById(id);
		System.out.println(student1);
		}*/
	//开启二级缓存步骤
	//1.对实体进行序列化
	//2.在映射文件中添加<cache/>标签
	//3.增删改也会清空二级缓存
	//4.对于二级缓存的清空，实质上是对查找的key对应的value置为null
	//而并非将Map对象删除
	//3.从DB中进行select查询的条件：
	//1）缓存中不存在这个key
	//2)缓存中存在该key所对应的Entry对象，但其value为null
	/*@Test
	 public void testInsert(){
	  
		int id=2;
		Student student = dao.selectStuById(id);
		System.out.println(student);
		sqlSession.close();
		
		sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(IStudentDao1.class);
		  
			
		    dao.insertStu(new Student("李四", 15, 98));*/
		 
		    /* sqlSession.commit();
		 
		 sqlSession.close();
		 
		 sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(IStudentDao1.class);*/
		/*Student student3 = dao.selectStuById(id);
		System.out.println(student3);
		}*/
	/*@Test
	public void testInsert(){
		String path = System.getProperty("java.io.tmpdir");
		System.out.println(path);
	}*/
	
}
