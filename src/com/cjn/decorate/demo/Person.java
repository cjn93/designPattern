package com.cjn.decorate.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午3:08:32
*@remark 装饰模式
*
**/
public class Person {
	private String name;
	
	
	public Person(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	
	public void wearTshirt(){
		System.out.println("穿T-shirt");
	}
	public void wearBigTours(){
		System.out.println("穿垮裤");
	}
	public void wearSneakers(){
		System.out.println("穿破洞鞋");
	}
	public void wearSuit(){
		System.out.println("穿西装");
	}
	public void wearLeatherShoes(){
		System.out.println("穿皮鞋");
	}
	public void wearTie(){
		System.out.println("戴领带");
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
	
	public static void main(String[] args) {
		//模拟客户端
		Person ps = new Person("小明");
		
		System.out.println("第一种打扮：");
		ps.show();
		ps.wearTshirt();
		ps.wearBigTours();
		ps.wearSneakers();
		
		System.out.println("第二种打扮：");
		ps.show();
		ps.wearSuit();
		ps.wearTie();
		ps.wearLeatherShoes();
		//工能实现，但违背开放封闭原则
		
	}
	
}
