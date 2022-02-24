package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {
	/*
	 * Tv든 SmartPhone이든 Desktop이든 간에 "상품"이라는 공통적인 특징을 뽑아낼 수 있음
	 * 그러면 "상품"이라면 당연히 가져야하는 속성들이 있기 마련
	 * =>brand, pCode, pName, price
	 * 
	 * 세 클래스 모두 공통적으로 기술했던 요소들만 추출해서 단 한번 정의하겠다
	 * =>그 클래스를 "부모클래스"라고 부른다(=슈퍼클래스=상위클래스)
	 */
	
	private String brand;
	private String pCode;
	private String pName;
	private int price;
	
	public Product() {	
	}
	
	public Product(String brand, String pCode, String pName, int price) {
		this.brand = brand;
		this.pCode = pCode;
		this.pName = pName;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getpCode() {
		return pCode;
	}
	public void setpCode(String pCode) {
		this.pCode = pCode;
	}
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
	
	public String information() {
		return brand + ", " + pCode + ", " + pName + ", " + price;
	}
	
	
}
