package com.mybatis.dao.impl;

import java.io.IOException;
import java.io.InputStream;

import javax.management.loading.PrivateClassLoader;

import com.mybatis.dao.IStudentDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.beans.Student;

public class StudentDaoImpl implements IStudentDao {

	private SqlSession sqlSession;
	@Override
	public void insertStu(Student student) {
		// TODO Auto-generated method stub
		
		try {
			//1.加载主配置文件
			InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
			//2.创建sqlSessionFactory对象
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//3.创建sqlSession对象
			 sqlSession = sqlSessionFactory.openSession();
	        //4.相关操作
			sqlSession.insert("test.insertStudent",student );
			//提交，若没有，id以创建，但插入操作失败
			sqlSession.commit();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
        
	}

}
