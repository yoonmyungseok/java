package com.kh.chap04_field.model.vo;

//필드에서 사용 가능한 접근 제한자 4가지
public class FieldTest2 {
	/*
	 * (+) public: 어디서든 (같은 패키지, 다른 패키지 모두) 접근 가능하도록 하고싶다
	 * (#) protected: 같은 패키지면 무조건 접근 가능, 단, 상황에 따라서 다른 패키지여도 접근 가능한 경우가 있다
	 * 				  '상속 구조일 경우'에는 다른 패키지여도 접근 가능하다
	 * (~) default: 오로지 같은 패키지일 경우에만 무조건 접근 가능, 생략 시 자동으로 default로 잡힌다
	 * (-) private: 오직 해당 클래스 내에서만 사용이 가능하다
	 * 
	 * => 위에서 아래로 내려갈수록 접근할 수 있는 범위가 좁아진다. 제한이 더 커진다. 자유도가 낮아진다
	 * => +, #, ~, - : 클래스 다이어그램에서의 표기이다.
	 */
	
	public String pub="public";
	protected String pro="protected";
	String df="default";
	private String pri="private";
	
}
