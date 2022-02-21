package com.kh.chap04_field.run;

import com.kh.chap04_field.model.vo.FieldTest1;
import com.kh.chap04_field.model.vo.FieldTest2;
import com.kh.chap04_field.model.vo.FieldTest3;

public class FieldRun {

	public static void main(String[] args) {
		//------------- 1. FieldTest1 클래스 ---------------
		FieldTest1 f1=new FieldTest1();
		//객체 생성시 global이라는 멤버변수 할당하고 거기에 들어있는 값은 0
		
		f1.test(10); //test라는 메소드를 호출 시 num이라는 매개변수가 할당되었을 것
		
		//test라는 메소드가 종료되는 시점에서 num 매개변수, local 지역변수가 소멸되어서 사용 불가
		//System.out.println(local);
		//System.out.println(num);
		
		f1=null; //참조하는 연결고리가 끊어진다
		//이 시점 이후부터는 f1의 주소를 알 수 없음(언젠가 GC에 의해 정리될것)
		//=>코드상 이 시점부터는 f1과 관련된 필드, 메소드들을 접근해서 사용 불가능하다
		//=>이 시점 이후에 global이라는 멤버변수가 소멸된다
		
		//------------- 2. FieldTest2 클래스 ----------------
		FieldTest2 f2=new FieldTest2();
		System.out.println(f2.pub); // public =>어디서든 직접 접근이 가능
		
		//System.out.println(f2.pro); // protected => 같은 패키지일 경우에는 직접접근이 가능, 다른패키지일 경우에는 직접 접근이 불가하다
		
		//System.out.println(f2.df); // default => 같은 패키지일 경우에만 직접접근이 가능
		
		//System.out.println(f2.pri); // private => 해당 클래스 내에서만 접근 가능(이 특징을 살려서 캡슐화)
		
		//------------- 3. FieldTest3 클래스 ----------------
		System.out.println(FieldTest3.sta);
		/*
		FieldTest3 f3=new FieldTest3();
		System.out.println(f3.sta);
		*/
		//System.out.println(FieldTest3.str);
		
		FieldTest3.test();
		
		//static의 가장 대표적인 예 => Math
		//FieldTest3.NUM=100; //static final 필드는 변경 못함
		System.out.println(FieldTest3.NUM);
		
		FieldTest3.sta="값을 변경해볼까";
		System.out.println(FieldTest3.sta);
		
		System.out.println(Math.PI);
	}

}
