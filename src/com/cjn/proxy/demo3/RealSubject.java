package com.cjn.proxy.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月24日 上午10:57:07
*@remark 
*
**/
public class RealSubject implements Subject {

	@Override
	public void request() {
		// TODO Auto-generated method stub
		System.out.println("RealSubject类,真实的请求！！");
	}

}
