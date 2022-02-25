package com.kh.chap01_poly.part02_electronic.controller;

import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

//다형성을 적용시키기 전
public class ElectronicController1 {
	//용산 전자상가에 새로 차린 가게
	private Desktop desk;
	private NoteBook note;
	private Tablet tab;
	
	//데스크탑 재고가 들어올 경우 데스크탑을 생성해주는 메소드
	public void insert(Desktop desk) {
		//Desktop d=new Desktop("삼성","데스크탑",1200000,"Geforce 3080");
		//desk=new Desktop("삼성","데스크탑",1200000,"Geforce 3080");
		this.desk=desk;
	}
	
	//노트북 재고가 들어올 경우 노트북을 생성해주는 메소드
	public void insert(NoteBook note) { //오버로딩: 아무리 메소드명이 같아도 매개변수가 달라서 공존 가능
		this.note=note;
	}
	
	//태블릿 재고가 들어올 경우 태블릿을 생성해주는 메소드
	public void insert(Tablet tab) {
		this.tab=tab;
	}
	
	//반환형이 애초에 달라서 오버로딩이 불가(메소드명을 따로 지어줘야 함)
	//각각의 물건을 실제로 보여주려고 리턴시켜주는 메소드들
	public Desktop selectDesktop() {
		return desk;
	}
	public NoteBook selectNoteBook() {
		return note;
	}
	public Tablet selectTablet() {
		return tab;
	}
}
