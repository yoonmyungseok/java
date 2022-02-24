package com.kh.chap03_override.run;

import com.kh.chap03_override.model.vo.Book;

public class OverrideRun {

	public static void main(String[] args) {
		Book bk=new Book("자바의 정석","김자바",23000);
		System.out.println(bk.toString());
		System.out.println(bk);
		
		/*
		 * Object 클래스에서 제공하는 toString() 메소드의 역할
		 * =>주소값 찍어주기(해당참조형변수의풀클래스명@해당객체의주소값의16진수형태)
		 */
		
	}

}
