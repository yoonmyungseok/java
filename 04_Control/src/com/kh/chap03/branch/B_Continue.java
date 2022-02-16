package com.kh.chap03.branch;

import java.util.Scanner;

public class B_Continue {
	public void method1() {
		//1부터 10까지의 숫자 중 홀수만을 출력
		//1 3 5 7 9
		
		//방법1. i값을 매번 2씩 증가시키면서 출력
		for(int i=1; i<=10; i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		/*방법2. i값을 매번 1씩 증가시키되 바로 출력하는것이 아니라
		 * 		 조건검사를 통해서 홀수일 경우에만 출력하게끔
		 */
		for(int i=1; i<=10; i++) {
			if(i%2==1) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		//방법3. 반복문 안에서 continue를 이용한 방법
		for(int i=1;i<=10;i++) {
			if(i%2==0) {//i가 짝수일 경우
				continue;//뒷쪽에 있는 코드들은 건너뛰고 다음 증감식으로 넘어가겠다
			}
			System.out.print(i+" ");
		}
	}
	public void method2() {
		//1부터 100까지의 총 합계
		//단,6의 배수값은 빼고 계산
		int sum=0;
		for(int i=1; i<=100;i++) {
			if(i%6==0) {
				continue;
			}
			sum+=i;
		}
		System.out.println("sum: "+sum);
	}
	public void method3() {
		//2단~9단까지 출력하긴 하되
		//단, 4의 배수단만 건너뛰고 출력하시오
		for(int i=2;i<=9;i++) {
			//방법1. 4의 배수인지 체크하는 방법
			/*
			if(i%4==0) {
				continue;
			}
			*/
			//방법2. 4의 배수가 아닌지 체크하는 방법
			if(i%4!=0) {
				System.out.println("-----"+i+"단-----");
				
				for(int j=1;j<=9;j++) {
					System.out.println(i+" * "+j+" = "+i*j);
				}
			}	
		}
	}
	//반복문 실습문제 12번- 계산기 부분+연산자 입력시 "exit"일 경우 빠져나가기
	public void method4() {
		/*
		 * 정수 두개, 연산자를 입력받아서 계산
		 * 단, 나눗셈일 경우 또는 모듈러 연산일 경우 0으로 나눌려고 할경우에는 '다시 입력해주세요' 출력
		 * 단, 없는 산술연산자 종류일 경우에는 '없는 연산자입니다' 출력
		 */
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("연산자(+, -, *, /, %): ");
			String operator=sc.nextLine();
			if(operator.equals(operator)) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			System.out.print("정수1: ");
			int num1=sc.nextInt();
			sc.nextLine();
			System.out.print("정수2: ");
			int num2=sc.nextInt();
			sc.nextLine();
			
			switch(operator) {
			case "+": System.out.println(num1+" + "+num2+" = "+(num1+num2)); break;
			case "-": System.out.println(num1+" - "+num2+" = "+(num1-num2)); break;
			case "*": System.out.println(num1+" * "+num2+" = "+(num1*num2)); break;
			case "/": 
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다");
					continue;
				}
				System.out.println(num1+" / "+num2+" = "+(num1/num2)); break;
			case "%": 
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다");
					continue;
				}
				System.out.println(num1+" % "+num2+" = "+(num1%num2)); break;
			default : System.out.println("없는 연산자입니다. 다시 입력해주세요");
			}
		}
	}
}
