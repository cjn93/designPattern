package com.cjn.decorate.demo4;
/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午3:25:02
*@remark  作用类似于 Decorator类
*
**/
public class Finery extends Person {
	
	protected Person component;
	
	public void decorate(Person component){
		this.component = component;
	}

	@Override
	public void show() {
		
		if(component != null){
			component.show();
		}

	}
	
	

}
