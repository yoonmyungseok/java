package com.kh.operator;

import java.util.Scanner;

public class F_Logical {
	/*
	 * 논리연산자
	 * 두 개의 논리값을 연산하는 연산자 (이항연산자)
	 * [표현법]
	 * 논리값 (논리연산자) 논리값 => 결과값도 논리값
	 * 
	 * 종류
	 * && : AND 연산자 -> 논리값 && 논리값 => 왼쪽, 오른쪽의 논리값이 둘다 true여야 결과가 true
	 * || : OR 연산자 -> 논리값 || 논리값 => 왼쪽, 오른쪽의 논리값 중 하나라도 true이라면 결과가 true
	 * 
	 * 경우의 수
	 * 1. true && true == true
	 * 2. true && false == false
	 * 3. false && ture == false
	 * 4. false && flase == false
	 * 5. true || true == true
	 * 6. true || false == true
	 * 7. false || true == true
	 * 8. false || false == false
	 * 
	 * 
	 */
	public void method1() {
		//비교연산자+논리연산자
		//사용자가 입력한 정수값이 양수"이면서(이고, 그리고)" 짝수인지 확인하기
		
		//Scanner
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수값 한개 입력: ");
		int num=sc.nextInt();
		
		// 판별한 결과를 담을 boolean 형태의 변수를 하나 만들기
		boolean result= (num>0)&&((num%2)==0);
		// &&의 의미 : 그리고, ~이면서, ~이고
		System.out.println("사용자가 입력한 값이 양수이면서 짝수입니까?: "+result);
	}
	public void method2() {
		//사용자가 입력한 정수값이 1이상 100이하의 수인지 확인하기
		//=> 1이상 그리고 100이하
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수값 한개 입력: ");
		int num=sc.nextInt();
		// 1<=num<=100 이렇게 수학처럼 한번에 범위를 묶어서 표현이 불가
		// 정수값이 1보다 크거나 같고 그리고 정수값이 100보다 작거나 같을 경우
		// 1<=num&&num<=100
		boolean result=(1<=num)&&(num<=100);
		System.out.println("사용자가 입력한 값이 1이상 100이하입니까?: "+result);
	}
	public void method3() {
		//사용자가 입력한 값이 'y' 이거나(또는) 'Y' 인지 확인하기
		Scanner sc=new Scanner(System.in);
		
		System.out.print("계속하시려면 y 또는 Y를 입력하세요: ");
		char ch=sc.nextLine().charAt(0);
		
		boolean result=(ch=='y')||(ch=='Y');
		// || 의 의미: 또는, ~이거나
		System.out.println("사용자가 입력한 값이 y 또는 Y 입니까?: "+result);
		
	}
	public void method4() {
		/*
		 * && : 둘다 true 여아 true
		 * || : 둘중에 하나라도 true이면 true
		 * 
		 */
		int num1=10;
		boolean result1=false&&(num1>0); //result1=false
		//Dead code : 필요없는 코드->비교연산 시 뒤의 구문이 실행되지 않는다(단순한 경고)
		//굳이 fasle &&까지 봤을 때 결과는 어차피 false 일텐데 이 코드를 작성한 이유가 뭔지 물어보는것
		
		System.out.println("result1: "+result1);
		
		boolean result2=true||(num1>0); // result2=true
		//Dead code
		//굳이 ture || 까지 봤을때 어차피 결과는 true여서 뒤가 Dead code가 되는것
		
		
	}
}
