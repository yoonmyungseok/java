package com.kh.practice;

import java.util.Scanner;

public class KeyboardInputPractice {
	public void myCalculator() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("첫 번째 정수: ");
		int a=sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 정수: ");
		int b=sc.nextInt();
		sc.nextLine();
		
		System.out.println("더하기 결과: "+(a+b));
		System.out.println("빼기 결과: "+(a-b));
		System.out.println("곱하기 결과: "+a*b);
		System.out.println("나누기 결과: "+a/b);
	}
}
