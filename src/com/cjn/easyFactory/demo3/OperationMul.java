package com.cjn.easyFactory.demo3;
/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午3:15:44
*@remark 乘法类 继承 操作父类并重写方法
*
**/
public class OperationMul extends Operation {

	
	@Override
	public double getResult() {
		// TODO Auto-generated method stub
		double res = 0;
		res = super.getNumberA() * super.getNumberB() ;
		return res;
	}
}
