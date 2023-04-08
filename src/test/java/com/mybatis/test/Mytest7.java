package com.mybatis.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mybatis.beans.NewsLabel;
import com.mybatis.dao.INewsLabelDao;
import com.mybatis.utils.MyBatisUtils;
//省去impl文件，直接和mapper.xml对接
public class Mytest7 {
	private INewsLabelDao dao;
	private SqlSession sqlSession;
	private NewsLabel newsLabel;
	@Before
	public void before(){
		sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(INewsLabelDao.class);	
	}
	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
	/*@Test
	public void test01(){
		List<NewsLabel> childrenLabels = dao.selectChildrenById(2);
		for(NewsLabel newsLabel:childrenLabels){
			System.out.println(newsLabel);
		}
	}*/
	@Test
	public void test01(){
		NewsLabel newsLabel = dao.selectNewsLabelById(1);
		
			System.out.println(newsLabel);
		
	}
   
}
