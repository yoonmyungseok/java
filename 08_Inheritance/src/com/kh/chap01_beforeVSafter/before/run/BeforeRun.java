package com.kh.chap01_beforeVSafter.before.run;

import com.kh.chap01_beforeVSafter.before.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.before.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.before.model.vo.Tv;

public class BeforeRun {

	public static void main(String[] args) {
		//Destop 객체
		//brand, pCode, pName, price, allInOne
		Desktop d=new Desktop("삼성","d-01","짱짱데스크탑",2000000,true);
		
		//Tv 객체
		//brand, pCode, pName, price, inch
		Tv t=new Tv("LG","t-01","어쩔티비",3000000,60);
		
		//SmartPhone 객체
		//brand, pCode, pName, price, mobileAgency
		SmartPhone s=new SmartPhone("애플","a-01","아이폰",1500000,"SKT");
		
		//출력
//		System.out.println(d);
//		System.out.println(t);
//		System.out.println(s);
		//각각의 주소값만 출력
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		/*
		 * 매 클래스마다 중복된 코드들이 존재하는 상황
		 * =>코드를 일일이 기술하는 과정에서 실수가 일어날 수 있음
		 * =>수정과 같은 유지보수 시 매번 일일이 찾아서 수정해야하는 번거로움이 발생
		 * 
		 * 상속이라는 개념을 적용시켜서
		 * 매 클래스마다 중복된 필드, 메소드들을 단 한번 또 하나의 클래스로 묶어서(=>부모) 정의해둔 후에
		 * 해당 클래스를 가져다 쓰는(=>자식) 방식으로 진행
		 * 
		 * 상속
		 * 매 클래스마다 중복된 필드, 메소드들을 하나의 클래스(부모)로 정의해둔 후에 
		 * 다른 클래스(자식)에서 해당 부모 클래스의 내용들을 가져다 쓰는 개념
		 */
	}

}
