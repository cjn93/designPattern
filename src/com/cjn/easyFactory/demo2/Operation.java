package com.cjn.easyFactory.demo2;

import java.util.Scanner;

/**
*@author cjn
*2018年5月21日 下午2:23:05
**/
public class Operation {
	
	public static String getResult(double numberA,double numberB,String operate){
		String res = "";
		 switch (operate) {
			case "+":
				res = (numberA + numberB)+"";
				break;
			case "-":
				res = (numberA - numberB)+"";
				break;
			case "*":
				res = (numberA * numberB)+"";
				break;
			case "/":
				if(numberB != 0){
					res = (numberA / numberB)+"";
				}else{
					res = "除数不能为0！";
				}	
				break;
			}
		return res;
	}
	
	
	public static void main(String[] args) {
		
		try {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			double numberA= 0;
			System.out.println("请输入数字A:");
			numberA = scan.nextDouble();
			System.out.println("请输入要进行的操作 (+ 、-、*、/) :");
			String operate = scan.next();
			double numberB= 0;
			System.out.println("请输入数字B:");
			numberB = scan.nextDouble();
			
			System.out.println("计算结果是："+Operation.getResult(numberA, numberB, operate));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("您输入的有误，"+e.getMessage());
			
		}
        
        
	}

}
