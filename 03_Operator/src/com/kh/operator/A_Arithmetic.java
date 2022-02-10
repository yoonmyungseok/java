package com.kh.operator;

public class A_Arithmetic {
	/*
	 * 산술 연산자
	 * 이항연산자로서 연산 방법, 우선순위가 기존에 우리가 알던 일반 수학 산술과 동일한 역할을 하는 연산자
	 * 
	 * 종류
	 * + : 덧셈
	 * - : 뺄셈
	 * * : 곱셈
	 * 슬래시(/) : 나눗셈 => 나누기를 하고 몫을 구한다
	 * % : 모듈러(Modular)  => 나누기를 하고 나머지를 구한다
	 */
	public void method1() {
		int num1 =10;
		int num2 =3;
		
		System.out.println("num1+num2="+(num1+num2));
		System.out.println("num1-num2="+(num1-num2));
		
		System.out.println("num1*num2="+num1*num2);
		System.out.println("num1/num2="+num1/num2);
		System.out.println("num1%num2="+num1%num2);
		
		double a=35;
		double b=10;
		System.out.println("a + b = " + (a+b));
		System.out.println("a - b = " + (a-b));
		System.out.println("a * b = " + (a*b));
		System.out.println("a / b = " + (a/b));
		System.out.println("a % b = " + (a%b));
	}
	
}
