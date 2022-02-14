package com.kh.chap01.run;

import com.kh.chap01.condition.A_If;
import com.kh.chap01.condition.B_Else;
import com.kh.chap01.condition.C_Switch;

public class ConditionRun {
	/*
	 * 프로그램은 기본적으로 위에서부터 아래로 순차적으로 실행됨
	 * 하지만 이 순차적인 흐름을 바꾸고자 할 때 "제어문" 이라는 걸 통해서 직접 제어 가능
	 * 
	 * 조건문=> 선택적으로 실행하는 선택문(if문, if-else문, if-else if문, switch문)
	 * 반복문=> 반복적으로 실행하는 실행문(for문, while문, do-while문)
	 * 분기문=> 그 이외의 흐름을 제어하는 구문(continue, break)
	 * 
	 * 조건문
	 * "조건식"을 통해 결과가 참이나 거짓이냐를 판단해서 해당 조건이 참일 경우 그에 해당되는 구문을 실행 가능
	 * =>조건식의 결과는 true/false라는 논리값만 나와야함
	 * =>보통 조건식에서는 비교연산자(대소, 동등), 논리연산자(&&, ||)를 주로사용한다
	 * 
	 * 조건문은 크게 if문 계열과 switch문으로 나뉨
	 * 
	 * 1. if문
	 * 단독 if문
	 * if-else문
	 * if-else if문
	 * 
	 * 2. switch문
	 * 
	 */
	public static void main(String[] args) {
		//A_If a=new A_If();
		//a.method1();
		//a.method3();
		//a.method4();
		//a.method5();
		//B_Else b=new B_Else();
		//b.method1();
		//b.method2();
		//b.method3();
		//b.method4();
		//b.method5();
		//b.method6();
		C_Switch c=new C_Switch();
		//c.method1();
		//c.method2();
		//c.method3();
		c.method4();
	}
}
