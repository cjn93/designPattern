package com.cjn.proxy.demo2;
/**
*@author cjn
*@version 1.0
*@date 2018年5月24日 上午10:19:01
*@remark 只有代理的 追求者
*
**/
public class Proxy implements GiveGift {
	
	Pursuit gg;//zhuojiayi
	SchoolGirl mm;
	
	public Proxy(SchoolGirl mm) {
		// TODO Auto-generated constructor stub
		gg = new Pursuit(mm);
	}
	@Override
	public void giveDolls(){
		gg.giveDolls();
	}
	@Override
	public void giveFlower(){
		gg.giveFlower();
	}
	
	
	

}
