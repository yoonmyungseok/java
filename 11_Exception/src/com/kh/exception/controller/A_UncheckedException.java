package com.kh.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A_UncheckedException {
	//Scanner 객체를 매번 메소드마다 생성하는게 아니라 전연변수로 생성해두고 다 가져다 쓰겠다.
	Scanner sc=new Scanner(System.in);
	public void method1() {
		//사용자로부터 두 개의 정수값을 입력받아서 나눗셈 연산 결과를 출력
		System.out.print("첫 번째 정수: ");
		int num1=sc.nextInt();
		sc.nextLine();
		
		System.out.print("두 번째 정수: ");
		int num2=sc.nextInt();
		sc.nextLine();
		
		//해결방법1. 조건문으로 처리(애초에 예외 자체가 발생되지 않게끔 if문으로 조건검사 후 계산 진행)=>예외처리가 아님
		/*
		if(num2!=0) { //나눗셈 진행
			System.out.println("나눗셈 연산 결과: "+(num1/num2));
		}else { //num2가 0이면
			System.out.println("0으로 나눌 수 없음");
		}
		System.out.println("프로그램 종료");
		*/
		//해결방법2. 예외처리 구문으로 해결(예외가 발생했을 경우를 대비해서 실행할 내용을 미리 정의해두는것)
		try {
			System.out.println("나눗셈 연산 결과: "+(num1/num2));
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
			e.printStackTrace(); //오류를 추적하는 메소드로 현재 예외가 발생한 정보를 볼 수 있다
		}
		System.out.println("프로그램 종료");
	}
	public void method2() {
		System.out.print("정수 입력(0 제외): ");
		try {
			int num=sc.nextInt(); //정수 이외의 값을 입력하면 InputMismatchException가 발생
			sc.nextLine();
			System.out.println("나눗셈 결과: "+(10/num)); // num이 0일 경우 ArithmeticException이 발생함
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력해야함");
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없음");
		}//다중 catch 블럭: 예외가 여러개 발생할 가능성이 있는 경우, 그 경우의 수만큼 catch 블럭을 작성 가능
		System.out.println("프로그램 종료");
	}
	public void method3() {
		//ArrayIndexOutOfBoundsException : 배열의 부적절한 인덱스로 접근할 때 발생하는 예외
		//NegativeArraySizeException: 배열의 크기를 음수로 지정할 경우 발생하는 예외
		System.out.print("배열의 크기: ");
		int size=sc.nextInt();
		sc.nextLine();
		
		//배열을 할당하기 전 애초에 if문으로 오류가 나지 않게 막겠다
		/*
		if(size>0) {
			int[] arr=new int[size];
		}
		else {
			System.out.println("배열의 크기는 양수여야 한다");
		}
		*/
		/*
		try {
			int[] arr=new int[size];
			System.out.println("100번 인덱스값: "+arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("부적절한 인덱스로 접근했습니다");
		}
		*/
		//다형성을 접목하여 예외처리
		/*
		try {
			int[] arr=new int[size];
			System.out.println("100번째 인덱스값: "+arr[100]);
		}catch(RuntimeException e) {
			System.out.println("배열의 크기를 음수로 입력했거나 부적절한 인덱스로 접근했음");
		}
		*/
		try {
			int[] arr=new int[size];
			System.out.println("100번째 인덱스값: "+arr[100]);
		}catch(NegativeArraySizeException e) {
			System.out.println("배열의 크기로 음수를 제시할 수 없습니다");
		}catch(RuntimeException e) {
			System.out.println("배열의 크기를 음수로 입력했거나 부적절한 인덱스로 접근했음");
		}
		
		//다중 catch 블럭의 경우 순서가 중요하다
		//=>상대적으로 범위가 작은 자식타입의 예외클래스에 해당하는 catch 블럭을 먼저 기술해야 한다
		//=>범위가 큰 부모클래스 먼저 기술한다면 자식클래스에 해당하는 catch블럭에서 Unreachable 오류가 발생한다
		System.out.println("프로그램 종료");
	}
}
