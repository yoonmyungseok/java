package com.kh.exception.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B_CheckedException {
	public void method1() throws IOException{
		/*
		try {
			method2();
		}catch(IOException e) {
			System.out.println("예외 발생함");
		}
		*/
		method2();
		
	}
	//throws 구문 추가
	public void method2() throws IOException{
		//Checked Exception 상황을 연출하기 위해
		//Scanner와 같이 키보드로 값을 입력받을 수 있는 객체를 하나 생성
		//java.io.BufferedReader 클래스로부터 객체 생성(단, 문자열로만 입력이 가능)
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("아무 문자열이나 입력하세요: ");
		//String str=br.readLine(); //한줄 단위로 사용자가 입력한 문자열을 입력받겠다
		//이 메소드를 호출했을 때 IOException이 발생할수도 있음을 애초에 컴파일 에러로 알려준것(빨간 밑줄)
		/*
		try {
			String str=br.readLine();
			System.out.println("문자열의 길이: "+str.length());
		}catch(IOException e) {
			System.out.println("예외 발생함");
		}
		*/
		String str=br.readLine();
		System.out.println("문자열의 길이: "+str.length());
		//br.readLine() 메소드 정의 부분을 보면 이미 throws로 나한테 예외처리하게끔 떠넘겨준것
	}
	/*
	 * Runtime Exception (Unchecked Exception): 예외 발생 시점(해당 코드가 실행되다가 오류나면)
	 * Checked Exception : 예외 발생 시점(언젠가 실행되다가=> 육안상 컴파일 에러)
	 */
}
