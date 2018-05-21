package com.cjn.easyFactory.demo;

import java.util.Scanner;

/**
*@author yhy
*2018年5月21日 下午1:51:52
**/
public class demo1 {
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a= 0;
        System.out.println("请输入数字A:");
        a = scan.nextDouble();
        System.out.println("请输入要进行的操作 (+ 、-、*、/) :");
        String str = scan.next();
        double b= 0;
        System.out.println("请输入数字B:");
        b = scan.nextDouble();
        if("+".equals(str)){
            System.out.println("计算结果是"+(a + b));
        }else if("-".equals(str)){
            System.out.println("计算结果是"+(a - b));
        }else if("*".equals(str)){
            System.out.println("计算结果是"+(a * b));
        }else if("/".equals(str)){
            System.out.println("计算结果是"+(a / b));
        }
    }

}
