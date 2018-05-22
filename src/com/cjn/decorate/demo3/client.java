package com.cjn.decorate.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午4:03:59
*@remark  模拟客户端
*
**/
public class client {
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent();
		ConcreteDecoratorA d1= new ConcreteDecoratorA();
		ConcreteDecoratorB d2 = new ConcreteDecoratorB();
		
		d1.setComponent(c);
		d2.setComponent(d1);
		d2.operation();
		
	}
}
