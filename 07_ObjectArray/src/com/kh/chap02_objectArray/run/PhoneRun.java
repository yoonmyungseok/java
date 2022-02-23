package com.kh.chap02_objectArray.run;

import java.util.Scanner;

import com.kh.chap02_objectArray.model.vo.Phone;

public class PhoneRun {

	public static void main(String[] args) {
		System.out.println("----- 서울 휴대폰 -----");
		//휴대폰 몇개 쌓아두고 팔건지 => 최대 보관할 수 있는 재고의 수: 100대
		Phone[] ph=new Phone[100];
		
		//휴대폰을 만들어서 배열에 담는 한큐에 해결하는 과정을 나타냄
		ph[0]=new Phone("갤럭시s","10","삼성",1200000); 
		ph[1]=new Phone("아이폰","11","애플",1500000); 
		ph[2]=new Phone("갤럭시z플립","1","삼성",1600000);
		ph[3]=new Phone("미노트","10","샤오미",550000);
		ph[4]=new Phone("아이폰","7","애플",1300000);
		ph[5]=new Phone("갤럭시노트","10","삼성",1500000);
		ph[6]=new Phone("아이폰","XS","애플",1500000);
		
		//내가 보유한 휴대폰은 7대 / 100대 까지 보관 가능
		
		System.out.println("구매 가능한 휴대폰 목록");
		
		for(int i=0;i<ph.length;i++) {
			//휴대폰명이 null이 아닐 경우에만 목록이 조회되도록 조치
			//ph[i]에 들어있는것이 null일 경우에는 break;를 걸겠다
			if(ph[i]!=null) { 
				System.out.println(ph[i].information());
			}else {
				break;
			}
		}
		System.out.println("---------------------------------");
		System.out.print("구매하고 싶은 기기명을 입력하세요: ");
		
		Scanner sc=new Scanner(System.in);
		String searchName=sc.nextLine();
		System.out.print("시리즈도 입력하세요: ");
		String searchSeries=sc.nextLine();
		
		//카운트용 변수 세팅
		int count=0;
		
		//몇 번째 방의 휴대폰을 골랐는지 잠시 담아둘 변수 세팅
		int idx=0;
		
		for(int i=0;i<ph.length;i++) {
			
			//있는 기기명을 입력한 경우 그리고 시리즈도 있는 경우
			if(ph[i].getName().equals(searchName)&&ph[i].getSeries().equals(searchSeries)) {
				System.out.println("기기 정보");
				System.out.println(ph[i].information());
				count++;
				idx=i;
				break;
			}
		}
		//이 시점에서 count 값이 1일 경우: 찾았을 때 count 값이 0일 경우: 못 찾았을 때
		if(count==0) {
			System.out.println("현재 찾으시는 물건의 재고가 없어요ㅜㅠ");
		}else {
			System.out.print("정말 구매 하시겠습니까?(y/n): ");
			char answer=sc.nextLine().charAt(0);
			if(answer=='y') {
				System.out.println("지불할 가격은 "+ph[idx].getPrice()+"원 입니다.");
				//현재 그 휴대폰의 정보를 지워주면됨=>해당 그 배열 방의 값에 null을 넣어 연결고리를 끊자
				ph[idx]=null;
			}else {
				System.out.println("안녕히가세요");
			}
		}
		
	}
}
