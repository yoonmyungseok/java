package com.kh.chap03_class.model.vo;

//클래스에서 사용 가능한 접근 제한자: public,default (생략 가능)
/*
 * default 접근 제한자의 경우는 다른 패키지에 존재할 경우 가져다 쓸 수 없음
 * 단, 같은 패키지 안에 존재할 경우 가져다 쓸 수 있음
 */
public class Product {
	private String pName;
	private int price;
	private String brand="애플"; //선언과 동시에 초기화
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String information() {
		return "상품명: "+pName+", 가격: "+price+", 브랜드: "+brand;
	}
}
