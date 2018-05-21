package com.cjn.easyFactory.demo3;

import javax.xml.crypto.dsig.spec.ExcC14NParameterSpec;

/**
*@author cjn
*@version 1.0
*@date 2018年5月21日 下午3:10:46
*@remark  除法类 继承 操作父类并重写方法
*
**/
public class OperationDiv extends Operation{
	
	@Override
	public double getResult() throws Exception {
		// TODO Auto-generated method stub
		double res = 0;
		if(super.getNumberB() == 0){
			throw new Exception("除数不能为0");
		}
		res = super.getNumberA() / super.getNumberB() ;
		return res;
	}
}
