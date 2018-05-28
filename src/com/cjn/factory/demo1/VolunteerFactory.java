package com.cjn.factory.demo1;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:04:51
*@remark 志愿者工厂
*
**/
public class VolunteerFactory implements IFactory{

	@Override
	public LeiFeng helpPerson() {
		// TODO Auto-generated method stub
		return new Volunteer();
	}

}
