package com.cjn.easyFactory.demo;

import java.util.Scanner;

/**
*@author cjn
*2018年5月21日 下午1:58:19
**/
public class demo2 {
		public static void main(String[] args) {
			try{
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
			        String res= "";
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
			        
			        System.out.println("计算结果是:"+res);
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("输入有误，"+e.getMessage());
			}
		}
}
