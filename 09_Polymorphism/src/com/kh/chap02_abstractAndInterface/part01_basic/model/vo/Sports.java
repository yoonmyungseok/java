package com.kh.chap02_abstractAndInterface.part01_basic.model.vo;

public abstract class Sports {
	private int people;
	
	public Sports() {
		
	}
	
	public Sports(int people) {
		this.people=people;
	}
	public void setPeople(int people) {
		this.people=people;
	}
	@Override
	public String toString() {
		return "people: "+people;
	}
	
	public int getPeople() {
		return people;
	}

	public abstract void rule();
	/*
	 * 몸통부가 존재하지 않는 미완성 메소드==추상메소드
	 * 몸통부가 없는 미완성 메소드를 정의하고자 한다면 abstract 라는 예약어를 써야 한다
	 * [표현법]
	 * public abstract 반환형 메소드명(매개변수=>생략가능);
	 * 
	 * 주의사항
	 * 만약에 내가 지금 작성하고 있는 클래스의 메소드들 중에서
	 * abstract라는 키워드가 붙은 추상메소드가 하나라도 포함되는 순간
	 * 그 클래스도 추상클래스가 되어버린다
	 * =>클래스명 앞에도 abstract를 붙여야함
	 */
}
