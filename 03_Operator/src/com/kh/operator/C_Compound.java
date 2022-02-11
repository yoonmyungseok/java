package com.kh.operator;

public class C_Compound {
	/*
	 * 복합대입연산자
	 * 산술 연산자와 대입연산자를 함께 사용하는 연산자
	 * 
	 * 종류
	 * += -= *= /= %=
	 * 
	 * 사용 예시
	 * a+=3; -> a=a+3;
	 */
	public void method1() {
		int num=12;
		System.out.println("현재num: "+num); // 12
		//복합 대입연산자를 이용하여 num을 3증가 시키기=> 덧셈
		num=num+3;
		System.out.println("증가된 num: "+num); // 15
		num+=3; //num=num+3;
		System.out.println("또 증가된 num: "+num); // 18
		
		//num을 5감소시키기 ->뺄쎔
		num-=5; //num=num-5;
		System.out.println("감소된 num:" +num); // 13
		
		//num을 6배 증가시키기=>곱셈
		num*=6; //num=num*6;
		System.out.println("6배 증가시킨 num: "+num); // 78
		
		//num을 2배 감소시키기->나눗셈
		num/=2; //num=num/2;
		System.out.println("2배 감소시킨 num: "+num); //39
		
		//num을 4로 나누었을 떄의 나머지를 num에 대입
		num%=4; //num=num%4;
		System.out.println("4로 나누었을 때 나머지: "+num); //3
		
		// +=의 경우 문자열 접합도 가능
		String str="Hello";
		
		//HelloWorld
		//str=str+"World";
		str+= "World";
		System.out.println(str);
		
	}
}
