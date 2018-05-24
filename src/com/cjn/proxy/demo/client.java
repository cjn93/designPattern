package com.cjn.proxy.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月24日 上午10:24:45
*@remark 
*
**/
public class client {
	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl("娇娇");
		
		//没有代理，卓佳怡 不认识 娇娇的 此处有问题的
		Pursuit zhuojiayi = new Pursuit(mm);
		
		zhuojiayi.giveDolls();
		zhuojiayi.giveFlower();
		
		
	}
}
