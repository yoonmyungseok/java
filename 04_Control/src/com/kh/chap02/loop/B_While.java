package com.kh.chap02.loop;

import java.util.Scanner;

public class B_While {
	public void method1() {
		/*for(int i=0; i<5;i++) {
			System.out.println("안녕하세요");
		*/
		//while문으로 변경
		int i=0;
		while(i<5) { // for문의 조건식 부분
			System.out.println("안녕하세요");
			i++;
		}
		//이 시점 기준으로 i의 값은?
		System.out.println("i: "+i);
		while(i>=1) {
			System.out.println("i: "+i);
			i--;
		}
		System.out.println(i);
	}
	public void method2() {
		//1에서부터 10까지의 총 합계
		int i=1;
		int sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
		System.out.println("sum: "+sum);
	}
	public void method3() {
		//1부터 랜덤값(1~100)까지의 총 합계
		int random = (int) (Math.random()*100+1);
		int sum=0;
		int i=1;
		while(i<=random) {
			sum+=i;
			i++;
		}
		System.out.println("sum: "+sum);
	}
	public void method4() {
		Scanner sc=new Scanner(System.in);
		
		while(true) { //for(;;){
			System.out.print("아무 문자열이나 입력하세요: ");
			String str=sc.nextLine();
			if(str.equals("exit")) {
				return;
			}
		}
	}
	public void method5() {
		int i=0;
		
		do {
			System.out.println("하이");
		}while(i==0);
	}
	
	public void method6() {
		//1 2 3 4 5
		
		//1. for
		for(int i=1;i<=5;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		//2. while
		int i=1;
		while(i<=5) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		
		//3. do-while
		int j=1;
		do {
			System.out.print(j+" ");
			j++;
		}while(j<=5);
	}
}
