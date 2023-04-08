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


import com.mybatis.beans1.Country1;
import com.mybatis.beans1.Minister1;

import com.mybatis.dao.IMinisterDao;
import com.mybatis.utils.MyBatisUtils;
//省去impl文件，直接和mapper.xml对接
public class Mytest6 {
	private IMinisterDao dao;
	private SqlSession sqlSession;
	private Country1 country1;
	private Minister1 minister1;
	@Before
	public void before(){
		sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(IMinisterDao.class);	
	}
	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}
   /* @Test
	public void test1(){
		minister1 = dao.seleMinister1ById(3);
		System.out.println(minister1);
	}*/
    @Test
	public void test2(){
		minister1 = dao.seleMinister1ById1(4);
		System.out.println(minister1);
	}
	
}
