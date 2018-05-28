package com.cjn.prototype.demo4;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:22:24
*@remark 
*
**/
public class Resume implements Cloneable {
	
	private String name;
	private String rex;
	private String age;
	private WorExperience work;
	
	public Resume() {
		// TODO Auto-generated constructor stub
	}
	
	public  Resume(String name,String rex, String age,String timeArea,String company){
		this.name = name;
		this.age = age;
		this.rex = rex;
		this.work =new WorExperience(company, timeArea);
	}
	
	private Resume(WorExperience work)  {
		try {
			this.work = (WorExperience) work.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setInfo(String name,String rex, String age){
		this.name = name;
		this.age = age;
		this.rex = rex;
	}
	public void setWorkInfo(String timeArea,String company){
		this.work.setCompany(company);
		this.work.setTimeArea(timeArea);
	}
	
	
	public void displayInfo(){
		System.out.println("***************个人简历****************");
		System.out.println("姓名:"+name+"\t年龄:"+age+"\t性别:"+rex);
		System.out.println("公司名:"+work.getCompany()+"\t\t时间:"+work.getTimeArea());
		System.out.println("*************************************");
	}
	
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		
		Resume obj = new Resume(this.work);
		obj.setName(name);
		obj.setAge(age);
		obj.setRex(rex);
		
		return obj;
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

	public WorExperience getWork() {
		return work;
	}

	public void setWork(WorExperience work) {
		this.work = work;
	}

	
	

}
