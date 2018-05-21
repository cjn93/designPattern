package com.cjn.strategy.demo2;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午5:18:28
*@remark  简单工厂模式 和 策略模式的融合
*   对简单工厂模式进行简单变种改造，将工厂放置在 构造函数中来使用
*
**/
public class CashContext {
	
	private CashSuper cashsuper = null;
	
	public CashContext(String  str) {
		switch (str) {
		case "正常":
			cashsuper = new CashNormal();
			break;
		case "满减":
			cashsuper = new CashReturn(300,100);
			break;
		case "折扣":
			cashsuper = new CashRebate(0.8);
			break;
		default:
			cashsuper = new CashNormal();
			System.out.println("走到默认值了");
			break;		
		}
		
	}
	
	public double contextRes(double money) throws Exception{
		
		return cashsuper.acceptCash(money);
	}
	
	public static void main(String[] args) {
		try {
			CashContext cashtext = new CashContext("满减");
			System.out.println(cashtext.contextRes(1000)); 
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
