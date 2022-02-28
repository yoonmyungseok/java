package com.kh.chap02_string.controller;

import java.util.Arrays;
import java.util.Scanner;

public class B_StringMethodTest {
	public void method() {
		String str1="Hell World";

		char ch=str1.charAt(3);
		System.out.println("ch: "+ch);
		
		String str2="!!!";
		System.out.println(str1.concat(str2));
		System.out.println(str1+str2);
		System.out.println("str1의 길이: "+str1.length());
		System.out.println("str1의 부분문자열: "+str1.substring(6));
		System.out.println("str1의 부분문자열: "+str1.substring(0,6));
		String str3=str1.replace('l','c');
		System.out.println("str3: "+str3);
		
		String str4="    JA    VA    ";
		System.out.println(str4.trim());
		
		System.out.println(str4.replace(" ",""));
		
		System.out.println("upper: "+str1.toUpperCase());
		System.out.println("lower: "+str1.toLowerCase());
		
		/*
		 * 사용자로부터 종료를 원하면 y를 입력해라 유도
		 * 
		 */
		
		System.out.println("----------------------------------");
		Scanner sc=new Scanner(System.in);
		System.out.print("종료하시겠습니까? (y/n) : ");
		System.out.println();
		/*
		방법1)
		char answer=sc.nextLine().charAt(0); //'y' / 'Y'
		if(answer=='y'||answer=='Y') {
			System.out.println("종료합니다");
		}else {
			System.out.println("종료하지않습니다");
		}
		*/
		//방법2)
		/*
		char answer=sc.nextLine().toUpperCase().charAt(0);
		//메소드를 연이어서 호출 => 메소드체이닝
		if(answer=='Y') {
			System.out.println("종료합니다");
		}else {
			System.out.println("종료하지않습니다");
		}
		*/
		System.out.println("----------------------------------");
		
		//문자열=>char[]
		//str1 문자열 기준으로 문자 하나하나를 추출해서 문자 배열에 담겠다
		char[] arr=new char[str1.length()];
		for(int i=0;i<arr.length;i++) {
			arr[i]=str1.charAt(i);
		}
		System.out.println(Arrays.toString(arr));
		
		char[] arr2=str1.toCharArray();
		System.out.println(Arrays.toString(arr2));
		
		//char[]=>문자열
		char[] arr3= {'a','p','p','l','e'};
		String result="";
		for(int i=0;i<arr3.length;i++) {
			result+=arr3[i];
		}
		System.out.println("result : "+result);
		
		System.out.println(String.valueOf(arr3));
	}
}
