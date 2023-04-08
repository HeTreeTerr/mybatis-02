package com.mybatis.beans;

import java.io.Serializable;
//序列化实体类
//implements Serializable
//外部的二级缓存不需要序列化实体类
public class Student{
	// 推荐使用Integer
	private Integer id;
	private String name;
	private int age;
	private double score;
	public Student(){
		super();
	}
	public Student(String name,int age,double score){
		super();
		this.name=name;
		this.age=age;
		this.score=score;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age
				+ ", score=" + score + "]";
	}

}
