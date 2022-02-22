package com.kh.chap03_class.model.vo;

public class Book {
	/*
	 * 도서명: title
	 * 출판사명: publisher
	 * 저자명: author
	 * 가격: price
	 * 할인율: discountRate (0.1일 경우 10프로 할인)
	 */
	
	//필드
	private String title;
	private String publisher;
	private String author;
	private int price;
	private double discountRate=0.1;
	
	//생성자
	public Book() {
		
	}
	
	public Book(String title, String publisher, String author, int price, double discountRate) {
		this();
		this.price = price;
		this.discountRate = discountRate;
	}
	
	//메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	
	public String information() {
		return "도서명: "+title+", 출판사명: "+publisher+", 저자명: "+author+", 가격: "+price+", 할인율: "+discountRate*100+"%";
	}
}
