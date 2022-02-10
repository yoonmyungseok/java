package com.kh.variable;

public class D_Printf {
	/*
	 * 출력문 종류
	 * System.out.println(출력하고자하는값); => 값을 출력 후에 줄바꿈 해준다
	 * System.out.print(출력하고자하는값); => 단순히 값을 출력만 해줌(줄바꿈x)
	 * 
	 * 새롭게 배울 출력문 printf
	 * [ 표현법 ] 
	 * System.out.printf("출력하고자하는형식", 출력하고자하는값);
	 * =>f는 format(형식)을 의미한다
	 * =>형식에 맞춰서 값들이 출력되고 줄바꿈은 일어나지 않음
	 * =>문자열 안에 그 값들이 들어갈 자리를 다음과 같은 형식으로 잡아줘야 한다
	 * 
	 * 형식
	 * %d : 정수가 들어갈 자리
	 * %f : 실수가 들어갈 자리
	 * %c : 문자가 들어갈 자리
	 * %s : 문자열이 들어갈 자리
	 * 
	 */
	public void printfTest() {
		// 정수 테스트 (%d)
		int iNum1=10;
		int iNum2=20;
		
		// iNum1: xx, iNum2: xx 이런 형식으로 출력
		// 1. println 사용
		System.out.println("iNum1: "+iNum1+", iNum2: "+iNum2);
		
		// 2.printf 사용
		System.out.printf("iNum1: %d, iNum2: %d \n", iNum1,iNum2);
		// 정수값이므로 %d라는 형식으로 자리를 잡아준다
		// 단, 줄바꿈 기능이 없기 때문에 개행문자 \n을 추가하여 줄바꿈을 해줘야 한다
		
		//10+20=30을 출력해보자
		// 1. println 사용
		System.out.println(iNum1+"+"+iNum2+"="+iNum1+iNum2);
		
		// 2. printf 사용
		System.out.printf("%d+%d=%d \n",iNum1,iNum2,iNum1+iNum2);
		
		// 함께 사용할 수 있는 옵션
		System.out.printf("%5d \n", iNum1); // %5d: 5칸의 공간 중 오른쪽 정렬
		System.out.printf("%-5d \n", iNum2); // %-5d: 5칸의 공간 중 왼쪽 정렬(음수)
		System.out.printf("%5d \n",100);
		
		// 실수 테스트(%f)
		double dNum=4.2185435;
		
		// dNum: xxx형식
		System.out.printf("dNum: %f \n",dNum); 
		// %f: 소수점 아래 7번째 줄에서 반올림이 되어 소수점 아래 6번째 까지만 출력된다
		
		System.out.printf("dNum: %.1f \n",dNum);
		// %.1f: 소수점 아래 2번째 줄에서 반올림이 되어 소수점 아래 1번째 까지만 출력된다
		// .자릿수로 제어 가능
		
		// 문자와 문자열 테스트(%c, %s_
		char ch='a';
		String str="Hello";
		System.out.printf("%c\t%s \n",ch,str);
		// \t : Tab 키를 한번 누른 효과
		// \n : Enter 키를 한번 누른 효과
		
		// 옵션
		System.out.printf("%C %S",ch,str); // %C, %S: 영어 알파벳일 경우 대문자로 출력
		
		/*
		 * printf: 포맷 단 한번 제시로 간편하게 출력 가능하다
		 * 단, 지정한 포맷의 개수와 종류, 뒤에 오는 변수의 개수와 종류가 정확히 맞아 떨어져야한다
		 */
		
	}
}
