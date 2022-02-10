package com.kh.practice;

import java.util.Scanner;

public class VariablePractice {
	public void myString() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요: ");
		String s=sc.nextLine();
		
		char c1=s.charAt(0);
		char c2=s.charAt(1);
		char c3=s.charAt(2);
		
		System.out.println("첫 번째 문자: "+c1);
		System.out.println("두 번째 문자: "+c2);
		System.out.println("세 번째 문자: "+c3);
		
	}
}
