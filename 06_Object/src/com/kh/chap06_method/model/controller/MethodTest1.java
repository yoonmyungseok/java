package com.kh.chap06_method.model.controller;

public class MethodTest1 {
	/*
	 * 경우의 수를 만들어서 메소드 테스트
	 * 1. 매개변수가 없고 반환값도 없는 메소드
	 * 2. 매개변수가 없고 반환값은 있는 메소드
	 * 3. 매개변수가 있고 반환값은 없는 메소드
	 * 4. 매개변수도 있고 반환값도 있는 메소드
	 */
	
	//1. 매개변수가 없고 반환값도 없는 메소드
	public void method1() {
		System.out.println("매개변수와 반환값이 둘 다 없는 메소드입니다.");
		//1부터 10까지의 합계를 구하여 출력하는 메소드
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		System.out.println("총 합계: "+sum);
		//return; //void 메소드의 경우에는 생략되어있다 (JVM이 자동으로 생성해줌)
	}
	
	//2. 매개변수가 없고 반환값은 있는 메소드
	public int method2() {
		System.out.println("매개변수가 없고 반환값은 있는 메소드입니다");
		//1에서부터 100까지의 숫자 중 랜덤값을 발생시켜 반환시켜주는 메소드
		//int random=(int) ((Math.random()*100)+1);
		//return random;
		return (int) ((Math.random()*100)+1);
	}
	
	//3. 매개변수가 있고 반환값은 없는 메소드
	public void method3(int num1, int num2) {
		System.out.println("매개변수가 있고 반환값이 없는 메소드입니다");
		//num1과 num2를 비교해서 결과를 출력해주는 메소드
		//최소값: xx
		//최대값: xx
		int min=0;	// 두 수중에서 작은 값을 넣을 용도의 변수
		int max=0;	// 두 수중에서 큰 값을 넣을 용도의 변수
		if(num1>num2) {
			min=num2;
			max=num1;
		}else {
			min=num1;
			max=num2;
		}
		System.out.println("최대값: "+max+"\n최소값: "+min);
	}
	//4. 매개변수가 있고 반환값도 있는 메소드
	public int method4(int a, int b) {
		System.out.println("매개 변수도 있고 반환값도 있는 메소드입니다");
		//두 매개변수를 곱한 결과값을 반환해주는 메소드
		System.out.println(a*b);
		return a*b;
	}
}
