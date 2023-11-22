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

import com.mybatis.beans.Country;
import com.mybatis.beans.Minister;
import com.mybatis.dao.ICountryDao;
import com.mybatis.utils.MyBatisUtils;
//省去impl文件，直接和mapper.xml对接
public class Mytest5 {

	private ICountryDao dao;

	private SqlSession sqlSession;

	private Country country;

	private Minister minister;

	@Before
	public void before(){
		sqlSession= MyBatisUtils.getSqlSession();
		 dao = sqlSession.getMapper(ICountryDao.class);	
	}

	@After
	public void after(){
		if(sqlSession!=null){
			sqlSession.close();
		}
	}

	@Test
    public void selectCountryById(){

	   country = dao.selectCountryById(1);
	   System.out.println(country.getMinisters());
	   Set<Minister> ministers = country.getMinisters();
	   Iterator<Minister> it = ministers.iterator();
	   //获取set中的数据
	   while(it.hasNext()){
		   System.out.println(((Minister)it.next()).getMname());
	   }
	}
	
	@Test	
    public void selectCountryById1(){
	   country = dao.selectCountryById1(1);
	   System.out.println(country.getCname());
	   /*Set<Minister> ministers = country.getMinisters();
	   Iterator<Minister> it = ministers.iterator();
	   //获取set中的数据
	   while(it.hasNext()){
		   System.out.println(((Minister)it.next()).getMname());
	   }*/
	}
}
