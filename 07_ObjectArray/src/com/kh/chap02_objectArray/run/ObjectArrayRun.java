package com.kh.chap02_objectArray.run;

import java.util.ArrayList;

import com.kh.chap02_objectArray.model.vo.Phone;

public class ObjectArrayRun {

	public static void main(String[] args) {
		//1. 객체배열 만들기=>Phone 형태의 객체만 담겠다
		//선언과 동시에 할당
		//자료형[] 배열명=new 자료형[크기];
		//Phone[] arr=new Phone[3];
		//배열을 사용할 준비가 완료되었다
		ArrayList<Phone> list=new ArrayList<>(3);
		//Phone만 담을 수 있는 ArrayList 객체
		/*
		System.out.println(arr); //주소값
		System.out.println(arr.length); //3
		System.out.println(arr[0]);
		*/
		
		Phone p1=new Phone();
		//arr[0]=p1;
		list.add(p1);
		System.out.println(p1);
		//System.out.println(arr[0]);
		System.out.println(list.get(0));
		//p1=null;
		//System.out.println(arr[0]);
		
		//arr[0]이 의미하는 것: phone 객체 1개
		/*
		arr[0].setName("갤럭시");
		arr[0].setBrand("삼성");
		arr[0].setPrice(1000000);
		*/
		list.get(0).setName("갤럭시");
		list.get(0).setBrand("삼성");
		list.get(0).setPrice(1000000);
		
		//System.out.println(arr[0].information());
		System.out.println(list.get(0).information());
		
		//arr[1]=new Phone("아이폰","11pro","애플",1000000);
		list.add(1, new Phone("아이폰","11pro","애플",1000000));
		System.out.println(list.get(1));
		System.out.println(list.get(1).information());
		//System.out.println(arr[1]);
		//System.out.println(arr[1].information());
		/*
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		*/
		for(Phone p:list) {
			System.out.println(p);
		}
		//arr[2]=new Phone();
		list.add(new Phone());
		/*
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		*/
		for(Phone p:list) {
			System.out.println(p.information());
		}
	}

}
