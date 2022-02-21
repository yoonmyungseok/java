package com.kh.chap04_field.model.vo;

// 클래스변수(static 변수)와 상수필드(static final)에 대해 정리
public class FieldTest3 {
	//접근제한자 [예약어] 자료형 필드명;
	public static String sta="static 변수";
	//생성시점: 프로그램 시작과 동시에 메모리의 static 영역에 할당된다(굳이 객체를 생성 안하더라도 할당)
	//소멸시점: 프로그램 종료시 소멸됨
	
	//static은 "공유"의 개념이 강함
	//=>프로그램 시작과 동시에 메모리 영역에 빌트인으로 박스를 만들어 두고 공유해서 두고두고 쓰자
	
	public String str="그냥 멤버변수";
	//static은 메소드에도 붙일 수 있다
	public static void test() {
		System.out.println("안녕");
	}
	/*
	 * 상수 필드
	 * [표현법]
	 * public static final 자료형 필드명=값;
	 * 
	 * 한번 지정된 값을 고정해서 사용하기 때문에 무조건 처음에 초기화를 같이 해줘야 한다
	 * 예약어의 순서는 상관 없다. final static도 가능
	 * 모두 대문자로 작성 
	 * 
	 * static: 공유의 개념
	 * final: 한번 지정된 값을 변경 불가능한 개념
	 * 
	 * => 값이 변경되서는 안되는 고정적인 값을 저장할 때 쓰임(프로그램 시작과 동시에 메모리 영역에 할당, 값도 변경안됨)
	 * 공유하면 사용할 목적이 더 강함
	 */
	public static final int NUM=1;
}
