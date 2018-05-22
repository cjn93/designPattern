package com.cjn.decorate.demo2;
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
		//其他衣服类不在赘述，只拿 西装和T-shirt来实现比较
		Person ps = new Person("小明");
		
		System.out.println("第一种打扮：");
		ps.show();
		Finery fi = new TShirt();
		fi.show();
		
		System.out.println("第二种打扮：");
		ps.show();
		Finery fii = new Suit();
		fii.show();
		
		
	}
	
}
