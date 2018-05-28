package com.cjn.factory.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午1:40:11
*@remark  加法工厂
*
**/
public class AddFactory implements IFactory {

	@Override
	public Operation createOperation() {
		// TODO Auto-generated method stub
		return new OperationAdd();
	}

}
