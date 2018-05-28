package com.cjn.decorate.demo4;


/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午4:32:05
*@remark 
*
**/
public class client {
	public static void main(String[] args) {
		
		Person person = new Person("小明明");
		
		System.out.println("第一次");
		
		Suit suit = new Suit();
		Shoes shoes = new Shoes();
		
		
		suit.decorate(person);
		shoes.decorate(suit);
		shoes.show();
		
		System.out.println("第二次");
		TShirt tShirt = new TShirt();
		Shoes shoes2 = new Shoes();
		
		tShirt.decorate(person);
		shoes2.decorate(tShirt);
		shoes2.show();
	
		
		
		
		
	}
}
