package com.cjn.strategy.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午5:18:28
*@remark 
*
**/
public class CashContext {
	
	private CashSuper cashsuper;
	
	public CashContext(CashSuper cashsuper) {
		this.cashsuper = cashsuper;
	}
	public CashContext() {
		// TODO Auto-generated constructor stub
	}
	
	public double contextRes(double money) throws Exception{
		
		return cashsuper.acceptCash(money);
	}
	
	public static void main(String[] args) {
		try {
			CashContext cashtext = null;
			int num = 3;
			switch (num) {
			case 1:
				cashtext = new CashContext(new CashNormal());
				break;
			case 2:
				cashtext = new CashContext(new CashReturn(300,100));
				break;
			case 3:
				cashtext = new CashContext(new CashRebate(0.8));
				break;

			}
			System.out.println(cashtext.contextRes(1000)); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
