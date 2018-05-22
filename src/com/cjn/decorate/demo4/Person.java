package com.cjn.decorate.demo4;
/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午3:08:32
*@remark 改变 将Person类 作为 ConcreteComponent 类来使用
*
**/
public class Person {
	
	private String name;
	
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void show(){
		System.out.println(name+"打扮成");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
