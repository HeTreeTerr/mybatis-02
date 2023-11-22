package com.mybatis.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.beans1.NewsLabel1;
import com.mybatis.dao.INewsLabelDao1;
import com.mybatis.utils.MyBatisUtils;
//省去impl文件，直接和mapper.xml对接
public class Mytest8 {

	private INewsLabelDao1 dao;

	private SqlSession sqlSession;

	private NewsLabel1 newsLabel1;

	@Before
	public void before(){
		sqlSession= MyBatisUtils.getSqlSession();
		dao = sqlSession.getMapper(INewsLabelDao1.class);
	}

	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}

	@Test
	public void test01(){

		NewsLabel1 newsLabel1 = dao.selectNewsLabelById(7);
		System.out.println(newsLabel1);
	}
   
}
