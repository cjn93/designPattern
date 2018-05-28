package com.cjn.prototype.demo;
/**
*@author cjn
*@version 1.0
*@date 2018年5月28日 下午2:32:36
*@remark 
*
**/
public class client {
	public static void main(String[] args) {
		System.out.println("方式一:");
		one();
		System.out.println("");
		System.out.println("方式二:");		
		two();
		
	}

	private static void two() {
		Resume resume = new Resume("陈佳楠", "男", "25", "2016-2018", "阿里巴巴");
		resume.displayInfo();
		
		Resume r2 = resume;
		Resume r3 = resume;
		
		resume.displayInfo();
		System.out.println("");
		r2.displayInfo();
		System.out.println("");
		r3.displayInfo();
	}

	private static void one() {
		Resume resume = new Resume("陈佳楠", "男", "25", "2016-2018", "阿里巴巴");
		resume.displayInfo();
		System.out.println("");
		Resume resume1 = new Resume("陈佳楠", "男", "25", "2016-2018", "阿里巴巴");
		resume1.displayInfo();
		System.out.println("");
		Resume resume2 = new Resume("陈佳楠", "男", "25", "2016-2018", "阿里巴巴");
		resume2.displayInfo();
	}
}
