package com.kh.chap06_method.model.controller;

public class OverloadingTest {
	/*
	 * 오버로딩의 잘 된 예시
	 * System.out.println: 매개변수의 갯수가 같더라도 종류가 다른 예시
	 * System.out.printf: 매개변수의 개수가 다른 예시
	 * "생성자" 
	 */
	public void test() {
		System.out.println(0); //매개변수가 int 형
		System.out.println('1'); //매개변수가 char형
		System.out.println(1.1); //매개변수가 double형
		System.out.println("하이"); //매개변수가 String형
		System.out.println(true); //매개변수가 boolean형
		//=>메소드의 매개변수의 개수가 아무리 같더라도 종류가 다르기 때문에 오버로딩의 대표적인 예라고 볼수 있음
	}
	public void test(int a) { //매개변수의 갯수가 다르면 오버로딩이 잘 됨
		
	}
	public void test(int a, String s) { //마찬가지로 매개변수의 갯수가 다르다
		
	}
	public void test(String s, int a) { //매개변수의 종류는 같음, 단, 순서가 다르기 때문에 오버로딩이 잘 됨
		
	}
	public void test(int a, int b) { //매개변수의 개수는 같음, 단 종류가 다름
		
	}
	//에러 발생
	//매개변수명만 다른상태(즉, 매개변수의 종류, 갯수, 순서가 같은 상태=>오버로딩이 안됨)
	//=>매개변수의 자료형의 개수와 순서가 어찌되었든간에 항상 달라야 오버로딩이 된다
	/*
	public void test(int c, int d) {
		
	}
	*/
	public void test(int a, int b, String s) { //매개변수의 개수가 달라서 오버로딩이 잘 됨
		
	}
	//에러 발생
	//반환형이 다름(오버로딩 x)
	//=>반환형 다르던간에, 매개변수명이다르던간에 오버로딩에는 영향을 주지 않고
	//=>매개변수의 종류, 개수, 순서가 어찌되었던간에 다르게 작성되야만 오버로딩이 잘된다
	/*
	public int test(int a, int b, String s) {
		return a+b;
	}
	*/
	
	//에러 발생
	//접근제한자가 다름(오버로딩x)
	//=>어찌되었든 간에 반환형, 매개변수 이름, 접근제한자가 아무리 다르더라도
	//=>매개변수의 종류, 순서, 개수가 다르지 않는 이상 오버로딩이 되지 않는다
	/*
	private void test(int a, int b, String s) {
		
	}
	*/
	
	
}
