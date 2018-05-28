package com.cjn.factory.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:06:56
*@remark  客户端
*
**/
public class client {

	public static void main(String[] args) {
		IFactory ifactory = new StudentFactory();
		
		LeiFeng lf =ifactory.helpPerson();
		
		lf.buy();
		lf.wash();
		lf.sweep();
		
	}
	
	
}
