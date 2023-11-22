package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.beans.Student2;
import com.mybatis.dao.IStudent2Dao;
import com.mybatis.utils.MyBatisUtils;
//省去impl文件，直接和mapper.xml对接
public class Mytest9 {

	private IStudent2Dao dao;

	private SqlSession sqlSession;

	private Student2 student2 ;

	@Before
	public void before(){
		sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(IStudent2Dao.class);	
	}

	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}

	@Test
	public void selectStudent2ById(){
		student2 = dao.selectStudent2ById(2);
		System.out.println(student2);
	}
   
}
