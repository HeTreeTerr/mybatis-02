package com.mybatis.beans;

import java.util.Set;

public class Student2 {

	private Integer sid;

	private String sname;

	private Set<Courser> coursers;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Set<Courser> getCoursers() {
		return coursers;
	}

	public void setCoursers(Set<Courser> coursers) {
		this.coursers = coursers;
	}

	@Override
	public String toString() {
		return "Student2 [sid=" + sid + ", sname=" + sname + ", coursers="
				+ coursers + "]";
	}
	
}
