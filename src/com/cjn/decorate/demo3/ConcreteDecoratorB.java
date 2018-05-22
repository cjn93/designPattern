package com.cjn.decorate.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午3:54:37
*@remark 
*
**/
public class ConcreteDecoratorB extends Decorator {

	
	@Override
	public void operation() {
		
		super.operation();//首先运行原有的Component的operation方法，在执行本类独有的功能,相当于对原有的 Component 进行装饰
		myselfMethod();//本类独有的功能，却别与ConcreteDecoratorA类
		System.out.println("具体装饰对象B的操作");
		
		
	}
	//本类独有的功能，却别与ConcreteDecoratorA类
	private void myselfMethod(){
		System.out.println("本类独有方法");
	}
	
}
