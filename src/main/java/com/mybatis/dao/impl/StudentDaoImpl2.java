package com.mybatis.dao.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.mybatis.dao.IStudentDao1;
import org.apache.ibatis.session.SqlSession;

import com.mybatis.beans.Student;
import com.mybatis.utils.MyBatisUtils;

public class StudentDaoImpl2 implements IStudentDao1 {

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
	@Override
	public void insertStudentCacheId(Student student) {
		// TODO Auto-generated method stub
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			sqlSession.insert("test.insertStudentCacheId",student );
			//提交，若没有，id以创建，但插入操作失败
			sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			sqlSession.delete("test.deleteById",id );
			//提交，若没有，id以创建，但插入操作失败
			sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	@Override
	public void updateStu(Student student) {
		// TODO Auto-generated method stub
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			sqlSession.update("test.updateStu",student);
			//提交，若没有，id以创建，但插入操作失败
			sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
	}
	@Override
	public List<Student> selectStu() {
		// TODO Auto-generated method stub
		List<Student> students = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			students = sqlSession.selectList("test.selectStu");
			//提交，若没有，id以创建，但插入操作失败
			//查询功能不需要提交事务
			//sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return students;
	}
	@Override
	public Map<String, Object> selectAllStudentsMap() {
		// TODO Auto-generated method stub
		Map<String, Object> map = new HashMap<>();
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			map = sqlSession.selectMap("test.selectStu","name" );
			//提交，若没有，id以创建，但插入操作失败
			//sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return map;
	}
	@Override
	public Student selectStuById(int id) {
		// TODO Auto-generated method stub
		Student student = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			student = sqlSession.selectOne("test.selectStuById",id);
			//提交，若没有，id以创建，但插入操作失败
			//sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return student;
		
	}
	@Override
	public List<Student> selectStuByName(String name) {
		// TODO Auto-generated method stub
		List<Student> students = null;
		try {
			sqlSession = MyBatisUtils.getSqlSession();
			students = sqlSession.selectList("test.selectStuByName",name);
			//提交，若没有，id以创建，但插入操作失败
			//sqlSession.commit();
		}finally{
			if(sqlSession!=null){
				sqlSession.close();
			}
		}
		return students;
	}

}
