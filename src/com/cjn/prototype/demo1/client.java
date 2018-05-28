package com.cjn.prototype.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午3:06:20
*@remark 
*
**/
public class client {
	
	public static void main(String[] args) {
		ConcretePrototype c = new ConcretePrototype("KK");
		ConcretePrototype c1= (ConcretePrototype) c.cloneInfo();
		
		System.out.println(c1.getId());
	}
	

}
