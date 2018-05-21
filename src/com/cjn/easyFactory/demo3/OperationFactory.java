package com.cjn.easyFactory.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午3:17:46
*@remark 简单运算工厂类
*
**/
public class OperationFactory {
	
	public static 	Operation createOperate(String operate){
		
		Operation oper = null;
		
		switch (operate) {
		case "+":
			oper = new OperationAdd();
			break;
		case "-":
			oper = new OperationSub();
			break;
		case "*":
			oper = new OperationMul();
			break;
		case "/":
			oper = new OperationDiv();
			break;
		}
		
		return oper;
	}
	
	public static void main(String[] args) {
		try {
			Operation oper = OperationFactory.createOperate("/");
			oper.setNumberA(5);
			oper.setNumberB(0);
			System.out.println(oper.getResult());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("输入有误，"+e.getMessage());
		}
	}
	

}
