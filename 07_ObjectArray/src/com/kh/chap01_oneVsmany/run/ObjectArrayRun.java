package com.kh.chap01_oneVsmany.run;

import java.util.Scanner;

import com.kh.chap01_oneVsmany.model.vo.Book;

//객체 배열을 이용한 버전
public class ObjectArrayRun {

	public static void main(String[] args) {
		//배열을 쓸 준비=>선언하고, 할당까지 마친 상태
		//선언 및 할당
		//자료형[] 배열명=new 자료형[크기];
		Book[] books=new Book[3];  // [0]=null,[1]=null,[2]=null
		Scanner sc=new Scanner(System.in);
		
		//3개의 전체 도서 정보를 입력받은 후에 각 인덱스에 해당 객체를 생성해서 담겠다
		for(int i=0; i<books.length;i++) {
			System.out.print("제목: ");
			String title=sc.nextLine();
			System.out.print("저자: ");
			String author=sc.nextLine();
			System.out.print("가격: ");
			int price=sc.nextInt();
			sc.nextLine();
			System.out.print("출판사: ");
			String publisher=sc.nextLine();
			
			books[i]=new Book(title,author,price,publisher);
		}
		//책 추가 기능이 완료된 시점
		
		//출력
		for(int i=0;i<books.length;i++) {
			System.out.println(books[i].information());
		}
		//전체 책 조회 기능이 완료된 시점
		
		//검색
		System.out.print("책제목: ");
		String searchTitle=sc.nextLine();
		for(int i=0;i<books.length;i++) {
			if(searchTitle.equals(books[i].getTitle())) {
				System.out.println(books[i].getPrice());
			}
		}

	}

}
