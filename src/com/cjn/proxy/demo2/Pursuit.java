package com.cjn.proxy.demo2;
/**
*@author cjn
*@version 1.0
*@date 2018年5月24日 上午10:19:01
*@remark 没有代理的 追求者
*
**/
public class Pursuit implements GiveGift {
	
	SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm) {
		// TODO Auto-generated constructor stub
		this.mm = mm;
	}


	@Override
	public void giveDolls(){
		System.out.println(mm.getName()+",送你的洋娃娃");
	}
	@Override
	public void giveFlower(){
		System.out.println(mm.getName()+",送你的鲜花");
	}
	
	
	

}
