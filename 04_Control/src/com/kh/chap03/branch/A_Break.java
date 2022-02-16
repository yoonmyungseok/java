package com.kh.chap03.branch;

import java.util.Scanner;

public class A_Break {
	public void method1() {
		//매번 반복적으로 새로이 발생되는 랜덤값(1~100) 출력
		//단, 그 랜덤값이 홀수일 경우에는 반복문을 빠져나가게끔
		while(true) {
			int random=(int) (Math.random()*100+1);
			//우선적으로 랜덤값을 출력하기 이전에 홀수인지 먼저 체크
			if((random%2)==1) { //홀수라면
				System.out.println("홀수: "+random);
				break;
				//break;//이구문이 실행된 시점으로 본다면 이미 반복이 끝났을 것
			}
			System.out.println("random: "+random);
		}
		//while의 반복이 끝났을 시점
		System.out.println("끝났지롱");
		//만약에 return으로 반복을 빠져나가게 된다면
		//이 시점에서 Unreachable code라는 오류 발생
		//=>Unreachable: 도달할 수 없는
	}
	public void method2() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("문자열 입력: ");
			String str=sc.nextLine();
			
			if(str.equals("exit")) {
				break;
			}else { // 문자열이 "exit"가 아닌경우
				//그 문자열의 길이를 구해서 출력
				//자바에서 제공하는 문자열의 길이를 알려주는 메소드
				//문자열.length(); 
				System.out.println(str+"의 길이: "+str.length());
			}
		}
		System.out.println("프로그램이 종료됩니다");
	}
	public void method3() {
		//매번 반복적으로 사용자에게 양수를 입력받아 1~사용자가 입력한 양수까지 출력
		//단, 정상적으로 양수를 입력했을 경우 잘 출력후 무한반복을 빠져나올것
		//아닐경우, 다시 입력하라고 출력할것
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.print("양수 입력: ");
			int num=sc.nextInt();
			//우선적으로 양수인지 체크
			if(num>0) {//잘 입력했을 경우 => 1~사용자가 입력한 수까지 출력
				for(int i=1; i<=num;i++) {
					System.out.print(i+" ");
				}
				break; // 현재 이 break가 포함된 while
			}else { //양수가 아닌 경우
				System.out.println("양수가 아닙니다. 다시 입력해주세요");
			}
		}
		
	}
}
