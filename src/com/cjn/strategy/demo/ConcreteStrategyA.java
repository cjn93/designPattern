package com.cjn.strategy.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午4:18:55
*@remark 
*
**/
//具体实现策略类
public class ConcreteStrategyA extends Strategy{
	
	//具体实现策略的方法
	@Override
	public void AlgorithmInterface() {
		// TODO Auto-generated method stub
		System.out.println("实现A策略算法");
	}

}
