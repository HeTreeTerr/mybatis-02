package com.mybatis.beans1;

import java.util.Set;

public class NewsLabel1 {

	private Integer id;

	private String name;

	private NewsLabel1 parent;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public NewsLabel1 getParent() {
		return parent;
	}

	public void setParent(NewsLabel1 parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "NewsLabel1 [id=" + id + ", name=" + name + ", parent=" + parent
				+ "]";
	}
	
}
