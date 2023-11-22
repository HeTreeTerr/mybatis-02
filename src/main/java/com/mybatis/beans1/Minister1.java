package com.mybatis.beans1;

public class Minister1 {
/*不要使用驼峰命名规格，容易出错*/
	private Integer mid;

	private String  mname;

	private Country1 country1;

	public Integer getMid() {
		return mid;
	}

	public void setMid(Integer mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public Country1 getCountry1() {
		return country1;
	}

	public void setCountry1(Country1 country1) {
		this.country1 = country1;
	}

	@Override
	public String toString() {
		return "Minister1 [mid=" + mid + ", mname=" + mname + ", country1="
				+ country1 + "]";
	}
	
	
}
