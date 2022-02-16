package com.kh.chap02.loop;

import java.util.Scanner;

public class A_For {
	/*
	 *for문
	 *반복적으로 코드를 실행시켜주는 역할
	 *단, 내가 반복할 횟수를 알고 있을 때 사용한다
	 *괄호 안에 반복을 지정하는 부분이 초기식, 조건식, 증감식
	 *
	 *[표현법]
	 *for(초기식; 조건식; 증감식){
	 *	반복적으로실행할코드;
	 *}
	 *
	 *=> 소괄호 () 안에는 몇번 반복을 돌릴껀지 지정
	 *=> 중괄호 {} 안에는 반복으로 뭘 돌릴껀지 지정
	 *
	 *초기식: 반복문이 실행될 때 "초기에 단 한번만 실행되는 구문"
	 *(반복문 안에서 사용할 변수를 선언 및 초기화)
	 *조건식: 반복문이 실행될 때 "해당 반복이 수행될 조건을 지정하는 구문"
	 *(초기식에서 지정한 변수를 가지고 주로 조건을 지정)
	 *=>조건식의 결과가 true: 반복실행
	 *=>조건식의 결과가 false: 반복을 종료 후 반복문을 빠져나옴
	 *증감식: 반복문을 제어하는 변수값을 "증감시키는 구문"
	 *(보통 초기식에서 지정한 변수를 가지고 증감식을 작성)
	 *
	 *for 문을 만나는 순간
	 *초기식->조건식(조건검사)->true일 경우 중괄호 안을 실행 -> 증감식
	 *		->조건식(조건검사)->true일 경우 중괄호 안을 실행 -> 증감식
	 *		->조건식(조건검사)->true ...					 -> 증감식
	 *		->조건식(조건검사)->false일 경우 중괄호 안을 실행X, for문 밖을 빠져나감
	 *
	 *=> 매번 조건식의 조건검사를 통해서 조건이 true일 경우에만 반복시키겠다
	 */
	public void method1() {
		//"안녕하세요"라는 문구를 5번 연속해서 출력하고 싶다
		/*
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		System.out.println("안녕하세요");
		*/
		//for문을 이용한 버전
		for(int i=0; i<5; i++) {
			System.out.println("안녕하세요");
		}
		/*
		 * for문을 이용하는 이유: 반복적인 구문을 작성할 때 실수를 줄이기 위해서 
		 * 						  반복이 많이 늘어나면 번거로우니까
		 * 
		 */
		/*
		 * for(초기식;조건식;증감식) {
		 * 반복코드;
		 * }
		*/
		
		
	}
	public void method2() {
		//제일 단순하게 반복되는 횟수를 지정하는 표현법
		//초기식;조건식;증감식
		//int i=0; i<반복시키고자하는횟수; i++
		
		//예시
		//int i=0; i<5; i++ =>0,1,2,3,4 (5회)
		//int i=0; i<7; i++ =>0,1,2,3,4,5,6 (7회)
		for(int i=0;i<10;i++) { //=>10번 반복될 것이다
			//System.out.println("고정된 문자열");
			System.out.println((i+1)+"번째 출력문");
		}
	}
	public void method3() {
		for(int i=0;i<10;i++) {
			//System.out.print((i+1)+" ");
			System.out.printf("%d ", i+1);
		}
	}
	public void method4() {
		//1에서부터 10까지 모든 수를 더하고싶다
		//누적 합 구하기
		//필수=>변수(한바퀴 돌때마다 변수에 누적해서 기록)
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum=sum+i;
			//1+2+3+4+5+6+7+8+9+10+
			//System.out.print(i+"+");
			System.out.print(i);
			//i가 마지막 숫자가 되기 전까지는 " + "를 이어서 출력
			//i가 마지막 숫자가 되는 순간 " = "을 출력
			//=>선택적으로 결정(조건문)
			if(i==10) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
		}
		//이 시점에서 
		//1+2+3+4+5+6+7+8+9+10=
		//이 구문이 완성됨=>단, 줄바꿈된 상태는 아님
		System.out.println(sum);	
		System.out.println("sum: "+sum);
	}
	public void method5() {
		//사용자로부터 양수 한개를 입력받아서
		//1부터 그 숫자까지 누적합을 구하고 싶다
		Scanner sc=new Scanner(System.in);
		System.out.print("양수 입력: ");
		int num=sc.nextInt();
		//0,-1=>양수X
		//우선적으로 양수인지 아닌지 먼저 판별
		if(num>0) { //양수일 경우
			int sum=0;
			for(int i=1;i<=num;i++) {
				sum+=i;
			}
			System.out.println("총 합계: "+sum);
		}else {//양수가 아닐 경우
			System.out.println("잘못 입력했습니다");
		}
	}
	public void method6() {
		//1에서부터 매번 달라지는 랜덤값(1~10사이의 랜덤한 정수) 까지의 총 합계를 구해보고싶다
		//난수: 매번 임의로 발생되는 랜덤값
		/*
		 * Math클래스
		 * 수학 계산과 관련된 모든 상수, 메소드를 포함하고있는 클래스
		 * 자바에서 이미 제공을 하고있음
		 * 
		 * Math클래스의 특징
		 * 모든 변수랑 모든 메소드 앞에 static이 붙어있음
		 * =>메소드 호출할 때 new를 이용해서 대변할 이름을 만들 필요없이 바로 클래스명.메소드명() 호출하면 된다
		 * 
		 * Math클래스 안에 정의되어 있는 random()메소드
		 * =>매번 다른 랜덤값을 리턴해준다
		 * 0.0~0.999999999999.. 사이의 랜덤값 발생
		 * 0.0 <=랜덤값<1.0
		 * 
		 * [표현법]
		 * Math.random();
		 */
		//1.random으로 난수 발생
		
		
		
		//2.발생된 난수의 범위를 조정(1~10사이)
		int random=(int)(Math.random()*10+1);
		//0.0~0.99999999999...=>10을 각각 곱함
		//0.0~0.99999999999...=>각각 1을 더함
		//1.0~10.9999999999...=>강제형변환
		//1~10
		
		//공식화
		//(Math.random()*몇개의 랜덤값)+시작수
		//예시)만약 11~20사이의 숫자 중 랜덤값을 뽑고싶다!
		//(Math.random()*10)+11
		System.out.println(random);
		//3.for문
		int sum=0;
		for(int i=1;i<=random;i++) {
			sum+=i;
		}
		//4.출력
		System.out.printf("1부터 %d까지의 총 합은 %d입니다", random,sum);
	}
	public void method7() {
		for(int i=1;i<=9;i++) {
			System.out.println("1 3 5 7 9");
		}
		
	}
	
	public void method8() {
		// 구구단 2단
		/*
		 * 2*1=2
		 * 2*2=4
		 * ...
		 * 2*9=18
		 * 
		 */
		System.out.println("----- 2단 -----");
		for(int i=1;i<=9;i++) {
			System.out.println("2 * "+i+" = "+(2*i));
		}
	}
	public void method9() {
		//사용자로부터 단수를 입력받아서 해당 단 출력
		System.out.println("----- 구구단 생성기 -----");
		Scanner sc=new Scanner(System.in);
		System.out.print("2 ~ 9 사이의 단수 입력: ");
		int num=sc.nextInt();
		
		//2~9사이의 범위가 맞는지 체크
		if(num>=2&&num<=9) { //진행
			for(int i=1;i<=9;i++) {
				System.out.println(num+" * "+i+" = "+(num*i));
			}
		}else {
			System.out.println("잘못 입력했습니다.");
		}
	}
	public void method10() {
		//2단에서부터 9단까지 모두 다 출력
		//9단 먼저 찍고 확장
		for(int i=2;i<=9;i++) {
			System.out.println("-----"+i+"단-----");
			for(int j=1;j<=9;j++) {
				System.out.println(i+" * "+j+" = "+(j*i));
			}
		}
		//총 반복 횟수: 겉의 for문*안쪽 for문
		//=>72
	}
	public void method11() {
		//1 2 3 4 5
		//1 2 3 4 5
		//1 2 3 4 5
		for(int i=0; i<3;i++) {
			for(int j=1;j<6;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	public void method12() {
		//*****
		//*****
		//*****
		//*****
		/*
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		for(int i=1;i<=20;i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.println();
			}
		}
	}
	public void method13() {
		//1***
		//*2**
		//**3*
		//***4
		
		//크게 4바귀 작게 4바퀴
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void method14() {
		//문자열을 입력받아
		//0번째 글자, 1번째 글자, 2번재 글자를 추출하는 프로그램
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String str=sc.nextLine();
		
		for(int i=0;i<3;i++) {
			System.out.println((i+1)+" 번째 문자: "+str.charAt(i));
		}
	}
	
	
	public void method16() {
		/*
		 * 사용자로부터 두 개의 정수값을 입력받은 후에
		 * 그 사이의 숫자를 모두 출력하는 프로그램
		 * 
		 * 정수1 입력: 3
		 * 정수2 입력: 8
		 * 3 4 5 6 7 8
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1 입력: ");
		int num1=sc.nextInt();
		sc.nextLine();
		System.out.print("정수2 입력: ");
		int num2=sc.nextInt();
		sc.nextLine();
		if(num1<num2) {
			for(int i=num1;i<=num2;i++) {
				System.out.print(i+" ");
			}
		}else if(num1>num2) {
			for(int i=num1;i>=num2;i--) {
				System.out.print(i+" ");
			}
		}else {
			System.out.println("정수1과 정수2의 값이 동일합니다");
		}
		
	}
	
}

