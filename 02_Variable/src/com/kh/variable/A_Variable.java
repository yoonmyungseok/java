package com.kh.variable;

public class A_Variable {
	
	public void printA() {
		
		System.out.println("===== 변수 사용 전 =====");
		System.out.println("시급: 9160원");
		System.out.println("근무시간: 6시간");
		System.out.println("근무일수: 15일");
		System.out.println("홍길동: "+9160 * 6 * 15+" 원");
		
		System.out.println("===== 변수 사용 후 =====");
		
		int pay=9200;
		int time=6;
		int day=15;
		System.out.println("시급: "+pay+"원");
		System.out.println("근무시간: "+time+"시간");
		System.out.println("근무일수: "+day+"일");
		System.out.println("홍길동: "+pay*time*day+"원");	
	}
	public void declareVariable() {
		boolean isTrue=true;
		
		byte bNum=1;
		short sNum=2;
		int iNum=4;
		long lNum=8L;
		
		float fNum=4.0f;
		double dNum=8.0d;
		
		char ch='A';
		
		String str="Hello";
		
		System.out.println("===== 자료형 출력 =====");
		System.out.println("isTrue: "+isTrue);
		System.out.println("bNum: "+bNum);
		System.out.println("sNum: "+sNum);
		System.out.println("iNum: "+iNum);
		System.out.println("lNum: "+lNum);
		System.out.println("fNum: "+fNum);
		System.out.println("dNum: "+dNum);
		System.out.println("ch: "+ch);
		System.out.println("str: "+str);
	}
	public void initVariable() {
		boolean isTrue=3+5<1;
		byte bNum=1;
		short sNum=2;
		int iNum=4;
		long lNum=8L;
		
		float fNum=4.0f;
		double dNum=8.0d;
		
		char ch='김';
		
		String str="자바 공부중";
		
		
		System.out.println("===== 자료형 출력 =====");
		System.out.println("isTrue: "+isTrue);
		System.out.println("bNum: "+bNum);
		System.out.println("sNum: "+sNum);
		System.out.println("iNum: "+iNum);
		System.out.println("lNum: "+lNum);
		System.out.println("fNum: "+fNum);
		System.out.println("dNum: "+dNum);
		System.out.println("ch: "+ch);
		System.out.println("str: "+str);
	}
	public void constant() {
		int age=20;
		System.out.println("age: "+age);
		age=25;
		System.out.println("변경된 age: "+age);
		final int AGE =20;
		System.out.println("상수 AGE: "+AGE);

	}
}
