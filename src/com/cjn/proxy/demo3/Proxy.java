package com.cjn.proxy.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月24日 上午10:58:18
*@remark 
*
**/
public class Proxy implements Subject {
	
	RealSubject realSubject;
	

	@Override
	public void request() {
		// TODO Auto-generated method stub
		if(realSubject == null){
			realSubject = new RealSubject();
		}
		realSubject.request();
	}

}
