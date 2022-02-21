package com.kh.chap02_encapsulation.model.vo;

public class Student {
	//필드
	/*
	 * 필드=멤버변수=인스턴스변수
	 * 
	 * 접근제한자 [예약어] 자료형 필드명;
	 */
	private String name;
	private int age;
	private double height;
	//생성자
	
	
	//메소드
	/*
	 * 보통은 이 자리에 getter/setter 메소드를 작성
	 * 
	 * 
	 * 접근제한자 반환형 메소드명(매개변수=>생략가능){
	 * 		실행코드;
	 * }
	 * setter 메소드 틀
	 * public void set필드명(해당필드의자료형 해당필드명){
	 * 		this.필드명=매개변수명;
	 * }
	 * 
	 * getter 메소드 틀
	 * public 해당필드의자료형 get필드명(){
	 * 		return 필드명;
	 * }
	 */
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	//여기까지가 캡슐화
	
	//각 객체별로 출력구문을 똑같이 작성했음
	//=>한 큐에 현재 필드에 담겨있는 모든 값들을 하나의 문자열로 합쳐서 내보내주는 메소드
	public String information() {
		// return name, age, height; // 
		return name+"님의 나이는 "+age+"살이고, 키는 "+height+"cm입니다.";
	}
}
