package com.cjn.factory.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午2:53:42
*@remark 减法类 继承 操作父类并重写方法
*
**/
public class OperationSub extends Operation {
	
	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double res = 0;
		res = super.getNumberA() - super.getNumberB() ;
		return res;
	}

}
