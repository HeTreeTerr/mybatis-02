package com.mybatis.beans1;


public class Country1 {

	private Integer cid;

	private String cname;

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
	
	@Override
	public String toString() {
		return "Country1 [cid=" + cid + ", cname=" + cname +  "]";
	}
	
	
}
