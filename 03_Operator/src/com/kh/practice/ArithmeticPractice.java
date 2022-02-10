package com.kh.practice;

import java.util.Scanner;

public class ArithmeticPractice {
	public void devideCandy() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("인원 수: ");
		int a=sc.nextInt();
		sc.nextLine();
		
		System.out.print("사탕 갯수: ");
		int b=sc.nextInt();
		sc.nextLine();
		
		System.out.println("1인당 나눠줄 사탕 갯수: "+(b/a));
		System.out.println("남는 사탕 갯수: "+(b%a));
	}
}
