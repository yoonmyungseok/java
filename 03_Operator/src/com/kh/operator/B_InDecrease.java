package com.kh.operator;

public class B_InDecrease {
	/*
	 * 증감연산자
	 * 단항연산자로써 한번에 값을 1씩만 증가시키거나, 감소시키는 연산자
	 * 
	 * 종류
	 * ++: 한 번에 값을 1만 증가시키겠다
	 * [표현법]
	 * ++값: 전위연산자
	 * 값++: 후위연산자
	 * 
	 * --: 한번에 값을 1만 감소시키겠다
	 * [표현법]
	 * --값: 전위연산자
	 * 값--: 후위연산자
	 * 
	 * => 연산자의 위치에 따라서 연산이 언제 될지 결정
	 * (증감연산자)값: 연산이 먼저 되고 나서 값을 처리함 => 선증감 후처리
	 * 값(증감연산자): 값이 처리되고 나서 그 다음에 연산이 이루어짐 => 선처리 후증감
	 */
	public void method1() {
		int num=10;
		System.out.println("num :"+num);
		num++;
		
		System.out.println("변경된 num: "+num);
		
	}
	public void method2() {
		int a=10;
		int b=++a;
		System.out.println("a :"+a+", b: "+b);
		
		int c=10;
		int d=c++;
		System.out.println("c: "+c+", d: "+d);
		
	}
	public void method3() {
		// 후위 연산
		int num1=20;
		int result1=num1++*3;
		System.out.println("num1: "+num1); // 21
		System.out.println("result1: "+result1); // 60
		
		// 전위 연산
		int num2=20;
		int result2=++num2*3;
		System.out.println("num2: "+num2); //21
		System.out.println("result2: "+result2); //63
		
		// --
		int num3=10;
		//int result3=--num3*5; //45
		int result3=num3--*5;
		System.out.println("num3: "+num3); // 9
		System.out.println("result3: "+result3); // 50

	}
}
