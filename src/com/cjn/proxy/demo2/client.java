package com.cjn.proxy.demo2;
/**
*@author cjn
*@version 1.0
*@date 2018年5月24日 上午10:24:45
*@remark 代理模式
* 运用代理模式，让daili替zhuojiayi给娇娇送花送礼物
**/
public class client {
	public static void main(String[] args) {
		SchoolGirl mm = new SchoolGirl("娇娇");
		
		
		Proxy daili = new Proxy(mm);
		
		daili.giveDolls();
		daili.giveFlower();
		
		
	}
}
