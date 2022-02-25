package com.kh.chap01_poly.part02_electronic.run;

import com.kh.chap01_poly.part02_electronic.controller.ElectronicController1;
import com.kh.chap01_poly.part02_electronic.controller.ElectronicController2;
import com.kh.chap01_poly.part02_electronic.model.vo.Desktop;
import com.kh.chap01_poly.part02_electronic.model.vo.Electronic;
import com.kh.chap01_poly.part02_electronic.model.vo.NoteBook;
import com.kh.chap01_poly.part02_electronic.model.vo.Tablet;

public class ElectronicRun {

	public static void main(String[] args) {
		//1. 다형성을 적용하기 전(ElectronicController1)
		//납품 업체
		ElectronicController1 ec=new ElectronicController1();
		//Desktop d=new Desktop("삼성","데스크탑",2000000,"Geforce 3080");
		//ec.insert(d);
		ec.insert(new Desktop("삼성","데스크탑",2000000,"Geforce 3080"));
		ec.insert(new NoteBook("LG","노트북",1500000,4));
		ec.insert(new Tablet("애플","아이패드",1400000,false));
		//=>각각 데스크탑, 노트북, 태블릿 한대씩을 납품한 상태
		
		//손님
		//가게에 있는 제품들을 조회해 볼 것
		Desktop d=ec.selectDesktop();
		NoteBook n=ec.selectNoteBook();
		Tablet t=ec.selectTablet();
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
		//=>매번 타입이 다르기 때문에 한번에 배송을 받을수가 없음(부분배송)
		
		
		//2. 다형성을 적용했을 경우(ElectronicController2)
		ElectronicController2 ec2=new ElectronicController2();
		
		//납품 업체
		ec2.insert(new Desktop("삼성","데스크탑",1000000,"Geforce 1060"),0);
		ec2.insert(new NoteBook("엘지","그램",1200000,4), 1);
		ec2.insert(new Tablet("애플","아이패드",1400000,true), 2);
		
		//고객
		System.out.println("====== 다형성 적용 후 =======");
		System.out.println(ec2.select(0));
		
		//창고째로 다 샀을 때
		Electronic[] elec=ec2.select();
		System.out.println("elec: "+elec);
		for(int i=0;i<elec.length;i++) {
			System.out.println(elec[i]);
		}
		
		/*
		 * 다형성을 사용하는 이유
		 * 1. 부모타입의 객체배열로 다양한 자식들을 묶어서 한번에 받아줄 수 있음
		 * =>즉, 부모타입 하나만으로 다양한 자식 객체들을 다룰 수 있음
		 * 2. 메소드의 매개변수나 반환형에 다형성을 적용하게 된다면 메소드의 개수가 확 줄어든다(코드가 간결해진다)
		 */
	}

}
