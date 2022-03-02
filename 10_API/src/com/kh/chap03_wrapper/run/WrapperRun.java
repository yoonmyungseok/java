package com.kh.chap03_wrapper.run;

public class WrapperRun {
	public static void main(String[] args) {
		int num1=10;
		int num2=15;
		
		//num1과 num2가 동일한지 출력문을 통해서 알아보고 싶다면?
		System.out.println(num1==num2);
		//System.out.println(num1.equals(num2));
		//System.out.println(num1.hashCode());
		//=>일반 기본 자료형에서 객체 자료형의 메소드들을 가져다 쓰고 싶을 때 Wrapper 클래스로 변환해서 사용한다
		//기본 자료형=>Wrapper 자료형(Boxing)
		Integer i1=num1; //10
		Integer i2=num2; //15
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(num1<num2); // true=>대소비교(일반타입인 경우)
		System.out.println(i1.compareTo(i2)); // -1 =>대소비교(참조타입일 경우)

		//Wrapper 자료형=>기본 자료형(Unboxing)
		int num3=i1;
		int num4=i2;
		
		System.out.println(num3==num4);
		System.out.println(num3>num4);
		System.out.println("======================================================");
		
		// 기본 자료형<-->String
		String str1="10";
		String str2="15.3";
		
		System.out.println(str1+str2); // 1015.3
		
		//1. String --> 기본자료형 : 파싱한다
		//[표현법]
		//해당Wrapper클래스명.parseXXX(변환할문자열);
		int i=Integer.parseInt(str1); // "10" --> 10
		double d=Double.parseDouble(str2); // "15.3" --> 15.3
		
		System.out.println(i+d); // 25.3
		
		//2. 기본자료형 --> String
		//[표현법]
		//String.valueOf(변환할기본자료형값): String
		String strI=String.valueOf(i);
		String strD=String.valueOf(d);
		
		System.out.println(strI+strD); // "1015.3"
	}
}
