package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if-else 문
	 * [표현법]
	 * 
	 * if(조건식){
	 * 		조건식이 true일 경우 실행할 내용
	 * }else{
	 * 		조건식이 false일 경우 실행할 내용
	 * }
	 * => 조건식의 결과가 true일 경우 if 영역에 있는 코드를 실행하고 false일 경우 else 영역에 있는 코드를 실행한다
	 */
	public void method1() {
		//단독 if문의 method2 참고!
		//사용자가 입력한 정수값이 짝수인지, 홀수인지를 판별해서 각각 "짝수다","홀수다"를 출력
		//if-else 버전
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		if((num%2==0)) {//짝수일 경우
			System.out.println("짝수다");
		}else {//홀수일 경우
			System.out.println("홀수다");
		}
		//중첩 if문: if 영역 안에 또 if문이 있을 경우
		//=>삼항연산자의 중첩 활용 참고!
	}
	public void method2() {
		//사용자가 입력한 양수값이 짝수인지, 홀수인지를 판별해서 각각 "짝수다","홀수다"를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("양수 입력: ");
		int num=sc.nextInt();
		
		//우선적으로 양수인지 아닌지 먼저 판별
		//그 이후에 짝수인지 홀수인지 판별
		
		if(num>0) {//양수일 경우
			if((num%2)==0) {//짝수일 경우
				System.out.println("짝수다");
			}else { //짝수가 아닐 경우 or 홀수일 경우
				System.out.println("홀수다");
			}
		}else {//양수가아닐경우
			System.out.println("입력한 값이 양수가 아닙니다");
		}
	}
}
