package com.kh.chap02_string.controller;

public class A_StringPoolTest {
	public void method1() {
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println(str1==str2); // 주소값 비교=>false
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2)); // 실제 문자열 비교 => true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	public void method2() {
		String str1="hello";
		String str2="hello";
		
		System.out.println(str1==str2); //true
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1.equals(str2));
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
	
	//불변클래스
	public void method3() {
		String str="hello";
		System.out.println(System.identityHashCode(str));
		
		str="bye";
		System.out.println(System.identityHashCode(str));
		str="hello";
		System.out.println(System.identityHashCode(str));
		
	}
}
