package com.kh.chap06_method.run;

import com.kh.chap06_method.model.controller.MethodTest1;
import com.kh.chap06_method.model.controller.MethodTest2;

public class MethodRun {

	public static void main(String[] args) {
		// 1. MethodTest1 클래스
		MethodTest1 m1=new MethodTest1();
		m1.method1();
		System.out.println("------------------------");
		
		System.out.println("랜덤값: "+m1.method2());
		
		System.out.println("------------------------");
		m1.method3(10, 5);
		
		System.out.println("------------------------");
		System.out.println(m1.method4(42, 2));
		/*
		 * 반환형이 있고 없고의 차이
		 * 반환형이 있는 경우 (void가 아닌경우): 메소드를 호출하는 곳에서 그 반환형에 맞는 변수를 선언해서 결과를 대입하는 형태
		 * 반환형이 없는 경우: 돌려줄 결과값이 없으니 메소드 내에서 결과를 출력하는 형태
		 */
		
		// 2. MethodTest2 클래스
		System.out.println("------------------------");
		MethodTest2.method1();
		System.out.println("------------------------");
		
		System.out.println(MethodTest2.method2());
		System.out.println("------------------------");
		MethodTest2.method3("홍길동", 20);
		
		System.out.println(MethodTest2.method4(10, 6, '+'));
		
		/*
		 * static 메소드의 경우에는 new 문으로 객체를 생성할 필요가 없음
		 * static이 붙은 클래스변수와 마찬가지로 메소드 또한 프로그램 실행 시에
		 * 메모리의 static이라는 정적인 영역에 할당(저장)된다
		 */
	}

}
