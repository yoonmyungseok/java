package com.kh.chap02_string.controller;

import java.util.StringTokenizer;

public class C_StringTokenizerTest {
	public void method() {
		String str="Java,Oracle,JDBC,HTML,Server,Spring";
		//구분자를 제시해서 해당 문자열을 분리
		//방법1. 분리된 문자열들을 String[] 배열에 차곡차곡 담아서 관리
		//split이라는 문자열을 쪼개주는 메소드를 활용(String 클래스에서 제공)
		//[표현법] 문자열.split(String 구분자)
		String[] arr=str.split(",");
		for(String i:arr) {
			System.out.println(i);
		}
		
		StringTokenizer stn=new StringTokenizer(str,",");
		System.out.println("분리된 문자열의 갯수: "+stn.countTokens());
		/*
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		System.out.println(stn.nextToken());
		
		System.out.println("현재 담겨있는 토큰의 갯수: "+stn.countTokens());
		*/
		/*
		int end=stn.countTokens(); //토큰을 하나 뽑아낼 때 마다 countTokens() 결과가 -1 되기 때문에 미리 변수에 담아두고 반복을 시작해야함
		for(int i=0; i<end; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		//더이상 뽑아낼 토큰이 있나? 라는 조건을 제시하면 while문 사용 가능
		//StringTokenizer 클래스에서 제공하는 hasMoreTokens() 메소드
		//=>StringTokenizer 객체로부터 더이상 뽑아낼 토큰이 있는 경우에 true를 반환
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		
	}
	
}
