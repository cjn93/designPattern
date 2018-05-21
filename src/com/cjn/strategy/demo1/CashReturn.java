package com.cjn.strategy.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午4:47:56
*@remark 
*
**/
public class CashReturn extends CashSuper {
	
	private double numberA;
	private double numberB;
	
	public CashReturn(double numberA,double numberB) {
		this.numberA = numberA;
		this.numberB = numberB;
	}
	

	@Override
	public double acceptCash(double money) throws Exception {
		
		if(money >= numberA){
			if(numberA == 0){
				throw new Exception("输入的满减参数有误！");
			}
			int num = (int) Math.floor(money /numberA);
			
			return money - (num * numberB);
		}else{
			return money;
		}

	}



	public double getNumberA() {
		return numberA;
	}

	public void setNumberA(double numberA) {
		this.numberA = numberA;
	}

	public double getNumberB() {
		return numberB;
	}

	public void setNumberB(double numberB) {
		this.numberB = numberB;
	}
	
}
