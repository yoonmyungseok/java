package com.kh.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int num=sc.nextInt();
		sc.nextLine();
		if(num>0) {
			System.out.println("양수다");
		}else {
			System.out.println("양수가 아니다");
		}
	}
	public void practice2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int num=sc.nextInt();
		sc.nextLine();
		if(num>0) {
			System.out.println("양수다");
		}else if(num==0) {
			System.out.println("0이다");
		}else {
			System.out.println("음수다");
		}
	}
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int num=sc.nextInt();
		sc.nextLine();
		if(num%2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
	}
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("인원 수: ");
		int people=sc.nextInt();
		sc.nextLine();
		System.out.print("사탕 개수: ");
		int candy=sc.nextInt();
		sc.nextLine();
		
		System.out.println("1인당 사탕 개수: "+(candy/people));
		System.out.println("남는 사탕 개수: "+(candy%people));
	}
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름: ");
		String name=sc.nextLine();
		System.out.print("학년(숫자만): ");
		int grade=sc.nextInt();
		sc.nextLine();
		System.out.print("반(숫자만): ");
		int ban=sc.nextInt();
		sc.nextLine();
		System.out.print("번호(숫자만): ");
		int num=sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F): ");
		char mf=sc.nextLine().charAt(0);
		String sex="";
		if(mf=='M') {
			sex="남학생";
		}else if(mf=='F') {
			sex="여학생";
		}
		System.out.print("성적(소수점 아래 둘째 자리까지): ");
		float jumsu=sc.nextFloat();
		sc.nextLine();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.",grade,ban,num,name,sex,jumsu);
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		System.out.print("나이: ");
		int age=sc.nextInt();
		sc.nextLine();
		if(age<=13) {
			System.out.println("어린이");
		}else if(age<=19) {
			System.out.println("청소년");
		}else {
			System.out.println("성인");
		}
	}
	public void practice7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("국어: ");
		int guk=sc.nextInt();
		sc.nextLine();
		System.out.print("영어: ");
		int eng=sc.nextInt();
		sc.nextLine();
		System.out.print("수학: ");
		int math=sc.nextInt();
		sc.nextLine();
		
		int sum=guk+eng+math;
		float avg=sum/3;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
		if(guk>=40&&eng>=40&&math>=40&&avg>=60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}
	public void practice8() {
		Scanner sc=new Scanner(System.in);
		System.out.print("주민번호를 입력하세요(-포함): ");
		String ssn=sc.nextLine();
		char sex=ssn.charAt(7);
		switch(sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default: 
			System.out.println("잘못 입력했습니다");
		}
	}
	public void practice9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수1: ");
		int num1=sc.nextInt();
		sc.nextLine();
		System.out.print("정수2: ");
		int num2=sc.nextInt();
		sc.nextLine();
		System.out.print("입력: ");
		int a=sc.nextInt();
		sc.nextLine();
		if(a<=num1||a>num2) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public void practice10() {
		Scanner sc=new Scanner(System.in);
		System.out.print("입력1: ");
		int a1=sc.nextInt();
		sc.nextLine();
		System.out.print("입력2: ");
		int a2=sc.nextInt();
		sc.nextLine();
		System.out.print("입력3: ");
		int a3=sc.nextInt();
		sc.nextLine();
		
		if(a1==a2&&a2==a3) {
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
