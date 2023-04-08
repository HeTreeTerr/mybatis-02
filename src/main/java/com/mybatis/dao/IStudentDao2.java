package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.mybatis.beans.Student;

public interface IStudentDao2 {

	List<Student> selectStudentsByCondition(Map<String, Object> map);
	List<Student> selectStudentsByCondition1(String name, int age);
	List<Student> selectStudentsByCondition2(Student student);
	List<Student> selectStudentsByCondition3(Student student);
	List<Student> selectStudentsByCondition4(Student student);
	List<Student> selectStudentsByCondition5(int[] ids);
	List<Student> selectStudentsByCondition6(List<Integer> lis);
	List<Student> selectStudentsByCondition7(List<Student> lis);
	List<Student> selectStudentsByCondition8(List<Student> lis);
}
