package com.kh.operator;

public class D_LogicalNegation {
	/*
	 * 논리부정연산자
	 * true 또는 false라는 논리값을 반전시켜주는 연산자
	 * 
	 * [표현법]
	 * !논리값
	 * 
	 */
	public void method1() {
		System.out.println("true의 부정: "+!true);
		System.out.println("false의 부정: "+!false);
		
		boolean b1=true;
		boolean b2=!b1; // false
		
		System.out.println("b1: "+b1);
		System.out.println("b2: "+b2);
	}
}
