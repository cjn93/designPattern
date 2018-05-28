package com.cjn.factory.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:03:56
*@remark 学生工厂
*
**/
public class StudentFactory implements IFactory {

	@Override
	public LeiFeng helpPerson() {
		// TODO Auto-generated method stub
		return new Student();
	}

}
