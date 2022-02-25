package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;

//다형성을 적용시켰을 때
public class ElectronicController2 {
	//용산 전자상가에 새로 차린 가게
	private Electronic[] elec=new Electronic[3];
	
	//물건이 납품 될때마다 창고에 물건 하나하나씩 채워넣기
	public void insert(Electronic any, int index) {
		elec[index]=any;
	}
	
	//고객이 원하는 물건을 꺼내주기(창고로부터)=>물건 하나 꺼내주기
	public Electronic select(int index) {
		return elec[index];
	}
	
	//고객이 원하는 물건이 전부 다 일때=>창고 째로 넘겨주자
	public Electronic[] select() {
		return elec;
	}
	/*
	 * 메소드
	 * 입력값->수행할 내용->결과값
	 * 
	 * 입력값:int, String, double, char, boolean, byte, float, long, 객체, 배열, ...
	 * 출력값:void, int, String, double, char, boolean, byte, float, long, 객체, 배열, ...
	 */
	
	
}

