package com.cjn.prototype.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:22:24
*@remark 
*
**/
public class Resume {
	
	private String name;
	private String rex;
	private String age;
	private String timeArea;
	private String company;
	
	public Resume() {
		// TODO Auto-generated constructor stub
	}
	
	public  Resume(String name,String rex, String age,String timeArea,String company){
		this.name = name;
		this.age = age;
		this.rex = rex;
		this.timeArea =timeArea;
		this.company = company;
	}
	
	public void displayInfo(){
		System.out.println("***************个人简历****************");
		System.out.println("姓名:"+name+"\t年龄:"+age+"\t性别:"+rex);
		System.out.println("公司名:"+company+"\t\t时间:"+timeArea);
		System.out.println("*************************************");
	}
	
	
	//set and get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRex() {
		return rex;
	}
	public void setRex(String rex) {
		this.rex = rex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getTimeArea() {
		return timeArea;
	}
	public void setTimeArea(String timeArea) {
		this.timeArea = timeArea;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}

}
