package com.kh.chap03_map.part02_properties.run;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class PropertiesRun {

	public static void main(String[] args) {
		//Properties : Map 계열 => key, value 세트로 저장됨 단, Properties만의 특징이라고 한다면 key, value 모두 String으로 제한되어있다
		Properties prop=new Properties();
		
		//String이 아닌 값을 넣게 될 경우
		//Map 계열이기 때문에 put 메소드로 key+value 세트로 넣을 수 있긴함
		prop.put("새우깡", new Snack("짠맛",500));
		
		System.out.println(prop);
		System.out.println(prop.get("새우깡"));
		
		//단, 주로 Properties를 사용하는 경우는 Properties에 담겨있는
		//key+value를 파일들로 기록한다거나, 파일에 기록되어있는 key+value를 가져오고자 하기 위함이라서
		//주로 <String, String>으로 쓴다
		
		//파일로 기록 : output(storeXXX 메소드)
		//파일로부터 가져올때: input(loadXXX 메소드)
		
		Properties prop2 =new Properties();
		//Properties 자체에서 제공하는 메소드 put이랑 같은 역할=> setProperty(String key, String value)
		prop2.setProperty("List", "ArrayList");
		prop2.setProperty("Set", "HashSet");
		prop2.setProperty("Map", "HashMap");
		prop2.setProperty("Map", "Properties");
		//키 값이 동일할 경우 put과 마찬가지로 덮어씌워짐
		
		System.out.println(prop2); //저장 순서 유지X, key값 중복 x
		
		
		try {
			//파일로 내보내기
			//1. store(OutputStream os, String comments): Properties에 담긴 key-value 세트들을 파일로 출력
			prop2.store(new FileOutputStream("test.properties"), "Properties Text");
			//2. storeToXML(OutputStream os, String comments): Properties에 담긴 key-value 세트들을 .xml 이라는 확장자 형식으로 출력
			prop2.storeToXML(new FileOutputStream("test.xml"), "xml test");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
