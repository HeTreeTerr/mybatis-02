package com.mybatis.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.mybatis.beans.Student;

public interface IStudentDao1 {

	/*
	 * mybatis注解式,使用注解时，可省去在mapper.xml中配置
	 * 若数组中只有一个元素，可省略不写
	 * 个人感觉一般，重在了解*/
	@Insert(value={"insert into tbl_student(tname,tage,tscore) values(#{name},#{age},#{score})"})
	public void insertStu(Student student);//插入
	
	public void insertStudentCacheId(Student student);
	
	@Delete(value={"delete from tbl_student where tid=#{id}"})
	public void deleteById(int id);//由id删除
	public void updateStu(Student student);//更新
	
	//因为属性名问题反射失败
	@Select("select tid,tname,tage,tscore from tbl_student")
	public List<Student> selectStu();//查询所有
	public Map<String, Object> selectAllStudentsMap();
	
	public Student selectStuById(int id);//由id查询单条记录
	public List<Student> selectStuByName(String name);//由姓名查找
}
