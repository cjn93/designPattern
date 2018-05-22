package com.cjn.decorate.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月22日 下午3:50:40
*@remark 
*
**/
public abstract class Decorator extends Component {
	
	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}

	@Override
	public void operation() {
		if(component != null){
			component.operation();
		}
		
	}
}
