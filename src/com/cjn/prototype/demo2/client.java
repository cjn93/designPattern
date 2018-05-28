package com.cjn.prototype.demo2;

/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:32:36
*@remark 
*
**/
public class client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume();
		resume.setInfo("陈佳楠", "男", "25");
		resume.setWorkInfo("2016-2018", "阿里巴巴");
		Resume r1 = (Resume) resume.clone();
		r1.setWorkInfo("2000-2018", "tenxun");
		
		Resume r2 = (Resume) resume.clone();
		r2.setWorkInfo("1999-2018", "baidu");
		
		resume.displayInfo();
		System.out.println("");
		r1.displayInfo();
		System.out.println("");
		r2.displayInfo();
		
		
	}

	

	
}
