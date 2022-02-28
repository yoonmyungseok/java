package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public class Mother extends Person implements Basic{
	private String babyBirth; //아기의 탄생 여부: 출산, 입양, 없음

	
	public Mother() {
		super();
	}
	
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public void setBabyBirth(String babyBirth) {
		this.babyBirth=babyBirth;
	}
	public String getBabyBirth() {
		return babyBirth;
	}
	//오버라이딩이 강제? X
	@Override
	public String toString() {
		return "Mother [babyBirth=" + babyBirth + ", toString()=" + super.toString() + "]";
	}
	//오버라이딩이 강제=> 애초에 미완성된 상태로 상속받았으니까
	@Override
	public void eat() { //엄마가 밥을 먹는다면?
		//몸무게를 기존의 몸무게에 10 증가
		//super.weight=super.weight+10;
		super.setWeight(super.getWeight()+10);
		//수정할 몸무게=기존몸무게+10;
		
		//건강도를 기존의 건강도에 10감소
		super.setHealth(super.getHealth()-10);
		//수정할 건강도=기존건강도-10;
	}

	@Override
	public void sleep() { //엄마가 잠을 잔다면?
		//건강도 10증가
		super.setHealth(super.getHealth()+10);
		
	}
	
}
