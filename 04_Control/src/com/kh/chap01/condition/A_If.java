package com.kh.chap01.condition;

import java.util.Scanner;

public class A_If {
	/*
	 *단독 if문
	 *조건을 단독적으로 한개만 제시할 경우
	 *[표현법]
	 *if(조건식){
	 *	해당 조건식의 결과가 true일 경우에 실행할 코드
	 *}
	 *=>조건식의 결과가 참(true)일 경우 중괄호 블럭 안에 있는 코드가 실행됨
	 *=>조건식의 결과가 거짓(false)일 경우 중괄호 블럭 안의 코드를 무시하고 넘어감
	 */
	public void method1() {
		//삼항연산자에서 양수, 0, 음수
		//사용자로부터 정수값을 입력받은 후 "양수다","0이다","음수다" 문구 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		//(조건식) ? true일 경우: false일 경우
		//단독 if문 사용
		
		// 경우의 수1. 양수일 경우(num>0)
		if(num>0) {
			System.out.println("양수다");
		}
		// 경우의 수2. 0일 경우(num==0)
		if(num==0) {
			System.out.println("0이다");
		}
		// 경우의 수3. 음수일 경우(num<0)
		if(num<0) {
			System.out.println("음수다");
		}
	}
	public void method2() {
		//사용자가 입력한 정수값이 짝수인지, 홀수인지 판별해서 각각 "짝수다", "홀수다"를 출력
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		//경우의 수 1. 짝수일 경우((num%2)==0)
		if((num%2)==0) {
			System.out.println("짝수다");
		}
		//경우의 수 2. 홀수일 경우((num%2)==1)
		if((num%2)==1) {
			System.out.println("홀수다");
		}
	}
	//실습 문제
	public void method3() {
		//사용자가 입력한 나이값을 가지고 13세 이하면 "어린이입니다" 
		//13세초과~19세 이하까지 "청소년입니다" 19세 초과면 "성인입니다"
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		String str= (age<=13) ? "어린이 입니다." : ((age>13&&age<=19) ?  "청소년입니다" : "성인입니다");
		System.out.println(str);
	}
	public void method4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		if(age<=13) {
			System.out.println("어린이 입니다");
			}
		if(age>13&&age<=19) {
			System.out.println("청소년 입니다");
		}
		if(age>19) {
			System.out.println("성인입니다");
		}
	}
	public void method5() {
		//사용자에게 입력받은 주민등록번호를 가지고 남자/여자 인지 판별 후 "남자입니다","여자입니다" 출력
		
		//1. 사용자에게 주민등록번호 입력받기
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호 입력(-포함): ");
		// 주민번호: yymmdd-xxxxxxx 
		String personId=sc.nextLine();
			
		//2. 입력받은 주민번호로 부터 성별에 해당되는 문자를 추출해서 변수에 담기(charAt메소드)
		// 220211-X000000
		// X: 성별에 해당 
		char gender=personId.charAt(7);
		// 3. 성별에 해당되는 해당되는 문자를 경우의 수로 나누기
		//=> 1또는 3일 경우에는 남자
		if((gender=='1')||(gender=='3')) {
			System.out.println("남자입니다.");
		}
		if((gender=='2')||(gender=='4')) {
			System.out.println("여자입니다");
		}
		//그 이외의 숫자인 경우=> "잘못된 주민번호 입니다"
		// '1'도 아니고 그리고 '2'도 아니고 그리고 '3'도 아니고 그리고 '4'도 아닐경우
		// gender!=1&&gender!=2&&gender!=3&&gender!=4
		if((gender!='1')&&(gender!='2')&&(gender!='3')&&(gender!='4')) {
			System.out.println("잘못된 주민번호 입니다");
		}
	}
}
