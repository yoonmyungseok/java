package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Basketball extends Sports{
	//미완성된 클래스인 추상클래스를 상속받게되면
	//부모클래스에 있는 추상메소드를 강제로 오버라이딩을 통해서 완성시켜줘야함
	@Override
	public void rule() {
		System.out.println("손으로 공을 던져서 링에 넣는다");
	}
}
