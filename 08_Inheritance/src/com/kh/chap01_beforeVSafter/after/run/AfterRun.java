package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class AfterRun {

	public static void main(String[] args) {
		//상속이 잘 이루어졌나 테스트
		Desktop d=new Desktop("삼성","d-01","짱짱데스크탑",2000000,true);
		System.out.println(d.information());
		
		SmartPhone s=new SmartPhone();
		s.setBrand("애플");
		s.setpCode("s-01");
		s.setpName("아이폰");
		s.setPrice(1000000);
		s.setMobileAgency("SKT");
		System.out.println(s.information());
		
		Tv t=new Tv("엘지","t-01","고오급벽걸이티비",5000000,60);
		System.out.println(t.getBrand());
		System.out.println(t.getpCode());
		System.out.println(t.getpName());
		System.out.println(t.getPrice());
		System.out.println(t.getInch());
		System.out.println(t.information());
		
		//실행하고자하는 메소드가 자식클래스에 없다면 자동으로 부모클래스에 있는 메소드가 실행됨
		//실행하고자하는 메소드가 자식클래스에 있다면 자식클래스의 메소드가 실행됨
		//=>동적바인딩: 자식클래스에 있는 오버라이딩된 메소드가 실행 우선권을 가진다
		
		
		
	}

}
