package com.cjn.prototype.demo4;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午3:42:29
*@remark 
*
**/
public class WorExperience implements Cloneable {
	
	private String company;
	private String timeArea;
	public WorExperience(String company, String timeArea) {
		super();
		this.company = company;
		this.timeArea = timeArea;
	}
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
