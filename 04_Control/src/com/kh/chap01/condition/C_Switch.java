package com.kh.chap01.condition;

import java.util.Scanner;

public class C_Switch {
	/*
	 * switch문
	 * 내가 표현하고 싶은 경우의 수가 여러개일 경우 사용 가능
	 * 단, ==(동등 비교 연산자)이 포함된 조건인 경우에만 사용이 가능하다
	 * 
	 * switch문과 if문의 차이점
	 * if(조건식) 
	 * => 조건식을 복잡하게 기술 가능함(사용 가능한 연산자의 가짓수가 많음)
	 * => 조건식에서 숫자의 범위를 표현 가능함
	 * 
	 * switch 조건식x 
	 * => 확실한 값의 조건만 기술 가능(동등비교 수행)
	 * 
	 * [표현법]
	 * switch(앞으로동등비교를할대상자){
	 * 	case 값1 : 실행할코드1; // 만약에 앞으로동등비교를할대상자==값1 경우에는 실행할 코드1을 실행하겠다
	 * 	break; //실행할코드1을 실행하고 switch 중괄호 영역을 빠져나간다
	 * 
	 * 	case 값2 : 실행할코드2; // 만약에 앞으로동등비교를할대상자==값2 경우에는 실행할 코드2를 실행하겠다
	 * 	break; //실행할코드2를 실행하고 switch 중괄호 영역을 빠져나간다
	 * 	...
	 * 	case 값n : 실행할코드n;
	 * 	break;
	 * 
	 * 	default : 실행할코드;
	 * 	//case 값1~값n번까지 동등비교를 하고 하나도 일치하지 않을 때
	 * 	//실행=>if문 계열에서 조건을 제시하지 않는 else 구문과 같은 역할
	 * 	//break;는 쓰지 않는다
	 * }
	 */
	public void method1() {
		/*
		 * 1~3사이의 숫자를 입력받아 
		 * 1인 경우: "빨간불입니다"
		 * 2인 경우: "파란불입니다"
		 * 3인 경우: "초록불입니다"
		 * 잘못입력한경우: "잘못입력했습니다"
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("1~3사이의 정수 입력: ");
		int num=sc.nextInt();
		sc.nextLine();
		
		//if문 버전
		/*if(num==1) {
			System.out.println("빨간불입니다");
		}else if(num==2) {
			System.out.println("파란불입니다");
		}else if(num==3) {
			System.out.println("초록불입니다");
		}else {
			System.out.println("잘못입력했습니다");
		}
		*/
		//switch문으로 변경=>동등비교를 할 경우
		/*switch(num) {
		case 1: //num==1이 수행
			System.out.println("빨간불입니다"); 
			break;
		case 2: //num==2가 수행
			System.out.println("파란불입니다"); 
			break;
		case 3: //num==3가 수행
			System.out.println("초록불입니다"); 
			break;
		default : 
			System.out.println("잘못입력했습니다"); 
		}
		*/
		String result="";
		switch(num) {
		case 1:
			result="빨간불";
			break;
		case 2:
			result="파란불";
			break;
		case 3:
			result="초록불";
			break;
		default :
			System.out.println("잘못입력했습니다");
			return;
			//return 문은 현재 실행중인 메소드 자체를 빠져나가겠다.
			//== 현재 실행중인 메소드를 호출한 태초마을로 돌아가겠다
		}
		System.out.printf("%s입니다", result);
	}
	public void method2() {
		//사용자에게 구매할 과일명(사과, 바나나, 복숭아)을 입력받아 각 과일의 가격을 출력
		Scanner sc=new Scanner(System.in);
		System.out.println("----- Welcome 과일가게 -----");
		System.out.print("구매할 과일명 입력(사과, 바나나, 복숭아): ");
		String fruit=sc.nextLine(); //과일명
		int price=0; //가격을 담는 변수
		
		//경우에 따라 각 과일의 가격을 책정=>switch문을 이용
		switch(fruit) {
		case "사과" :
			price=1000;
			break;
		case "바나나" :
			price=2000;
			break;
		case "복숭아" :
			price=5000;
			break;
		default :
			System.out.println("저희 가게에서 판매하는 과일이 아닙니다");
			return;
		}
		System.out.printf("%s의 가격은 %d원입니다",fruit,price);
	}
	public void method3() {
		//주민번호 입력받아서 남자인지 여자인지 체크
		//=> 주민번호: 문자열로 취급, 7번째 글자가 성별을 나타냄
		//switch문 버전
		Scanner sc=new Scanner(System.in);
		
		System.out.print("주민번호 입력: ");
		String personId=sc.nextLine();
		
		char gender=personId.charAt(7);
		String result="";
		switch(gender) {
		case '1' :
		case '3' :
			result="남자";
			break;
		case '2' :
		case '4' :
			result="여자";
			break;	
		default :
			System.out.println("잘못된 주민번호를 입력했습니다");
		}
		//한번에 출력
		System.out.println(result+" 입니다");
	}
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1월~12월 사이의 월 입력: ");
		int month=sc.nextInt();
		sc.nextLine();
		switch(month) {
		
		case 12:
		case 2:
		case 1:
			System.out.println("겨울입니다");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다");
			break;
		default:
			System.out.println("반드시 1~12사이의 숫자를 입력해야 합니다");
		}
	}
}
