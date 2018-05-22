package com.cjn.decorate.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午3:54:25
*@remark 
*
**/
public class ConcreteDecoratorA extends Decorator {
	
	//本类独有的功能，却别与ConcreteDecoratorB类
	private String addStatus;

	@Override
	public void operation() {
		
		super.operation();//首先运行原有的Component的operation方法，在执行本类独有的功能,相当于对原有的 Component 进行装饰
		addStatus = "呜啦啦啦";//本类独有的功能，却别与ConcreteDecoratorB类
		System.out.println("具体装饰对象A的操作");
		
		
	}

	public String getAddStatus() {
		return addStatus;
	}

	public void setAddStatus(String addStatus) {
		this.addStatus = addStatus;
	}
	
	
	
	

}
