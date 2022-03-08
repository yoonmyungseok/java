package com.kh.chap03_map.part02_properties.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesRun2 {

	public static void main(String[] args) {
		//파일로부터 읽어들이기=>무작정 읽어들이는게 아니라 Properties 객체를 만들어서 거기서 호출해야 알아서 잘 담기는 구조
		Properties prop=new Properties(); //비어있는 상태
		Properties prop2=new Properties(); //비어있는 상태
		
		System.out.println(prop);
		
		try {
			prop.load(new FileInputStream("test.properties")); //읽어들이는 메소드 : load(InputStream is)
			
			prop2.loadFromXML(new FileInputStream("test.xml")); //xml 형식으로 읽어들이는 메소드: loadFromXML(InputStream is)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(prop);
		System.out.println(prop2);
		
		//해당 key에 해당되는 value값 뽑아보기(일반 Map 계열의 get 메소드와 같은 역할)
		//getProperty(String key): String value
		System.out.println(prop.getProperty("Map"));
		/*
		 *  .properties 파일을 사용하는 경우는
		 *  해당 프로그램이 기본적으로 가져야할 정보들을 .properties 확장자 문서로
		 *  저장해두면 key-value 모두 문자열이기 때문에 개발자 뿐만 아니라 일반 관리자 또한 다루기 쉽다
		 *  
		 *  .xml 파일을 사용하는 경우는
		 *  DB 쿼리문처럼 긴 value를 담을 때 쓴다
		 *  .xml 파일같은 경우는 호환성이 좋아서 다른 프로그래밍 언어간의 호환이 가능하다
		 */
	}

}
