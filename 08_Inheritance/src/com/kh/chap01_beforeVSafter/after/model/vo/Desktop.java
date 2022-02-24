package com.kh.chap01_beforeVSafter.after.model.vo;

public class Desktop extends Product{ //클래스 선언부: 어디에서 공통된 것들을 가져올건지 언급해줘야함
	private boolean allInOne;
	
	public Desktop() {
	}

	public Desktop(String brand, String pCode, String pName, int price,boolean allInOne) {
		
		//brand, pCode, pName, price, allInOne이라는 필드에 값을 다 대입해주는 생성자
		//super. 은 해당 부모클래스의 객체의 주소를 담고 있다(즉, 부모에 접근 가능하다)
		//단, private일 경우에는 직접접근 불가
		
		//해결방법1. private을 protected로 바꾸기(부적합)
		/*
		super.brand=brand;
		super.pCode=pCode;
		super.pName=pName;
		super.price=price;
		
		*/
		
		//해결방법2. 부모 클래스에 있는 public 접근제한자인 setter 메소드를 활용
		/*
		super.setBrand(brand);
		super.setpCode(pCode);
		super.setpName(pName);
		super.setPrice(price);
		*/
		
		//해결방법3. 부모생성자를 호출(매개변수 생성자)
		//=>단, 반드시 첫 줄에 기술해야 한다(this 생성자 때처럼)
		super(brand, pCode, pName, price);
		this.allInOne = allInOne;
	}

	public boolean getAllInOne() {
		return getAllInOne();
	}
	public void setAllInOne(boolean allInOne) {
		this.allInOne=allInOne;
	}


	//오버라이딩: 부모클래스에 있는 같은 메소드를 내 입맛대로 정의해서 새롭게 쓰는것
	public String information() {
		return super.information()+", "+allInOne;
		//부모로부터 
		//필드에 직접접근 하고싶다면 super.필드명
		//메소드를 호출하고 싶다면 super.메소드명()
		//생성자를 호출하고 싶다면 super()
	}
	
	

}
