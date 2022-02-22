package com.kh.chap06_method.model.controller;

public class MethodTest2 {
	//static 메소드의 경우에는 호출 시 new 구문으로 객체를 생성할 필요가 없음
	public static void method1() {
		System.out.println("매개변수가 없고 반환값도 없는 static 메소드");
		
	}
	public static String method2() {
		return "매개변수는 없지만 반환값은 있는 static 메소드";
	}
	public static void method3(String name, int age) {
		System.out.printf("%d살의 %s님 환영합니다^^\n", age, name);
	}
	public static int method4(int num1, int num2, char op) {
		int result=0;
		
		switch(op) {
		case '+': result=num1+num2; break;
		case '-': result=num1-num2; break;
		case '*': result=num1*num2; break;
		case '/': result=num1/num2; break;
		case '%': result=num1%num2; break;
		default : result=-999999; break;
		}
		return result;
	}
}
