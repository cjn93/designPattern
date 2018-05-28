package com.cjn.factory.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午1:45:58
*@remark  客户端
*
**/
public class client {
	
	public static void main(String[] args) {
		try {
			
			IFactory ifactory= new AddFactory();
		
			Operation oper = ifactory.createOperation();
			
			oper.setNumberA(100);
			oper.setNumberB(101);
			
			System.out.println(oper.getResult());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
