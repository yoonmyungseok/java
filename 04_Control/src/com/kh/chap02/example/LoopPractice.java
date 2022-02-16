package com.kh.chap02.example;

import java.util.Scanner;

public class LoopPractice {
	public void practice12() {
		Scanner sc=new Scanner(System.in);
		for(;;) {
			System.out.print("연산자(+, -, *, /, %): ");
			String oper=sc.nextLine();
			if(oper.equals("exit")) {
				System.out.println("프로그램을 종료합니다");
				return;
			}
			System.out.print("정수1: ");
			int num1=sc.nextInt();
			sc.nextLine();
			System.out.print("정수2: ");
			int num2=sc.nextInt();
			sc.nextLine();
			
			if(oper.equals("/")&&num2==0) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요");
			}else if(oper.equals("+")) {
				System.out.printf("%d + %d = %d\n",num1,num2,num1+num2);
			}else if(oper.equals("-")){
				System.out.printf("%d - %d = %d\n",num1,num2,num1-num2);
			}else if(oper.equals("*")){
				System.out.printf("%d * %d = %d\n",num1,num2,num1*num2);
			}else if(oper.equals("/")){
				System.out.printf("%d / %d = %d\n",num1,num2,num1/num2);
			}else if(oper.equals("%")){
				System.out.printf("%d % %d = %d\n",num1,num2,num1%num2);
			}else {
				System.out.println("없는 연산자입니다. 다시 입력해주세요");
			}
			System.out.println();
		}
	}
}
