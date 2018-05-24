package com.cjn.proxy.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月24日 上午10:19:01
*@remark 只有代理的 追求者
*
**/
public class Proxy {
	
	SchoolGirl mm;
	
	public Proxy(SchoolGirl mm) {
		// TODO Auto-generated constructor stub
		this.mm = mm;
	}
	
	public void giveDolls(){
		System.out.println(mm.getName()+",送你的洋娃娃");
	}
	public void giveFlower(){
		System.out.println(mm.getName()+",送你的鲜花");
	}
	
	
	

}
