package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public class Football extends Sports{
	
	@Override
	public void rule() {
		System.out.println("손이 아닌 발로 공을 차야한다");
	}
}
