package com.mybatis.dao.impl;



import com.mybatis.dao.IStudentDao;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.beans.Student;
import com.mybatis.utils.MyBatisUtils;

public class StudentDaoImpl1 implements IStudentDao {

	private SqlSession sqlSession;

	@Override
	public void insertStu(Student student) {
		// TODO Auto-generated method stub
		
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			sqlSession.insert("test.insertStudent",student );
			//提交，若没有，id以创建，但插入操作失败
			sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		
        
	}

}
