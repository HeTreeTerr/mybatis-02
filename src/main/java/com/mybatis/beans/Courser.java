package com.mybatis.beans;

import java.util.Set;

public class Courser {

	private Integer cid;

	private String cname;

	private Set<Student2> student2s;

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Set<Student2> getStudent2s() {
		return student2s;
	}

	public void setStudent2s(Set<Student2> student2s) {
		this.student2s = student2s;
	}

	//对于双向的关联关系，只要一方能看到另一方即可，双向输出则会出现溢出
	@Override
	public String toString() {
		return "Courser [cid=" + cid + ", cname=" + cname  + "]";
	}
	
}
