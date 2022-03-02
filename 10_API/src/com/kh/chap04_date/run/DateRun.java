package com.kh.chap04_date.run;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateRun {

	public static void main(String[] args) {
		//기본생성자를 통해 Date 객체 생성
		Date today=new Date();
		System.out.println("기본생성자: "+today);
		
		//내가 원하는 날짜(2020년 6월 19일)
		//방법1. 매개변수 생성자를 이용해서 원하는 날짜 지정
		//Date date1=new Date(2020,6,19); //The constructor Date(int, int, int) is deprecated: 언젠가는 안쓰게된다고 경고(사용이 권장되지는 않음) 오류 아님
		//System.out.println("매개변수 생성자: "+date1);
		//내부적으로 내가 전달한 년도+1900 => 세팅하고자하는 년도-1900
		//내부적으로 내가 전달한 월수+1 => 세팅하고자하는 월수-1
		//Date date1=new Date(2020-1900,6-1,19);
		Date date1=new Date(2020-1900,6-1,19,19,15,30);
		System.out.println("매개변수 생성자: "+date1);
		
		//방법2. 추가적으로 내가 원하는 날짜를 원하는 형식으로 지정해서 출력
		//”2020년 06월 19일 19시 15분 30초” 형식으로 찍어보고 싶다
		//=> java.text.SimpleDateFormat 클래스를 같이 사용한다
		
		//1. 형식을 지정하면서 SimpleDateFormat 객체 생성(매개변수 생성자로)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
		
		//2. SimpleDateFormat 클래스에서 제공하는 format() 메소드를 호출
		String formatDate=sdf.format(date1);
		System.out.println(formatDate);
	}

}
