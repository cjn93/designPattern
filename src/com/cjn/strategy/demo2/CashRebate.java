package com.cjn.strategy.demo2;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午4:47:41
*@remark 
*
**/
public class CashRebate  extends CashSuper {
	
	private double rate;
	
	public CashRebate(double rate) {
		this.rate = rate;
	}

	@Override
	public double acceptCash(double money) {
		// TODO Auto-generated method stub
		return money * rate;
	}
	
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}


}