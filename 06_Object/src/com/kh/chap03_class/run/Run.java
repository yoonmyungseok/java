package com.kh.chap03_class.run;

import com.kh.chap03_class.model.vo.Book;
import com.kh.chap03_class.model.vo.Person;
import com.kh.chap03_class.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		//Person이라는 클래스로부터 객체 생성
		//Person 클래스 ==내가 만든 자료형(여러개의 자료형 변수들을 한개의 묶음으로 보관하겠다)
		//p 객체=Person 이라는 내가 만든 자료형에 해당되는 변수(참조형 변수==객체==인스턴스)
		Person p=new Person();
		
		System.out.println(p.information());
		p.setId("user01");
		p.setPwd("pass01");
		p.setName("홍길동");
		
		System.out.println(p.information());
		p.setAge(23);
		p.setGender('남');
		p.setPhone("010-1234-5678");
		p.setEmail("123@email.com");
		System.out.println(p.information());
		
		Product p1=new Product();
		p1.setpName("아이폰xs");
		//p1.setBrand("애플");
		p1.setPrice(1500000);
		System.out.println(p1.information());
		
		Product p2=new Product();
		p2.setpName("아이패드프로");
		p2.setPrice(1400000);
		p2.setBrand("apple");
		System.out.println(p2.information());
		
		//brand 필드에 "애플"로 초기화 해 두었을 때에는 setter로 굳이 값을 담아두지 않아도 된다
		
		Book b=new Book();
		b.setTitle("");
		b.setPublisher("");
		b.setAuthor("");
		b.setPrice(0);
		
		System.out.println(b.information());
	}
}
