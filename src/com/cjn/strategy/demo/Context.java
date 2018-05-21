package com.cjn.strategy.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午4:35:13
*@remark 
*
**/
public class Context {
	
	Strategy strategy;
	
	public Context(Strategy strategy){
		this.strategy = strategy;
	}
	
	public void ContextInterface(){
		strategy.AlgorithmInterface();
	}
	
	public static void main(String[] args) {
		
		Context context ;
		
		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();
		
		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();
		
		
	}
	

}
