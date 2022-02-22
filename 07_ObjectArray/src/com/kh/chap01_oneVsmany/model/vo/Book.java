package com.kh.chap01_oneVsmany.model.vo;

public class Book {
	//필드
	//도서명, 저자명, 가격, 출판사명
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	//생성자
	//기본생성자
	public Book() {
		
	}

	//모든 필드에 대해서 매개변수로 갖는 생성자 => 객체 생성과 동시에 모든 필드의 값을 내가 원하는 값으로 초기화하기 위함
	public Book(String title, String author, int price, String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	//메소드부
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
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

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public String information() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publisher=" + publisher + "]";
	}
}
