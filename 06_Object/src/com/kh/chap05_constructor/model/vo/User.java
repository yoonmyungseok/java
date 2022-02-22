package com.kh.chap05_constructor.model.vo;

public class User {
	//필드
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	//생성자
	public User() {
		//기본 생성자: 매개변수가 없는 생성자
		//=>단지 객체를 생성할 목적으로 작성한다(new 연산자를 이용하여 호출당할때 heap 영역에 할당하겠다)
		
		//기본생성자를 생략하는 경우=>오류가 나지 않음
		//JVM이 자동으로 기본생성자를 만들어줬기 때문에 항상 객체 생성이 가능했음
		//단, 매개변수가 있는 생성자가 추가적으로 작성되어있을 경우
		//기본생성자를 JVM이 자동으로 만들어주지 않기 때문에
		//이 경우에는 기본생성자를 반드시 작성해줘야한다
		//=>항상 기본생성자를 만들자
		//System.out.println("잘호출되나");
	}
	public User(String userId, String userPwd, String userName) {
		this.userId=userId;
		this.userPwd=userPwd;
		this.userName=userName;
	}
	public User(String userId, String userPwd, String userName, int age, char gender) {
		//모든 필드에 대해서 매개변수로 갖고있는 생성자: 필드가 5개면 매개변수도5개다
		//=>객체를 생성하고 그 순간 내가 원하는 값으로 초기화까지 시킬 목적
		//항상 만드는 습관이 필수는 아니나, 그래도 만드는게 편함
		/*
		 * this.userId=userId;
		 * this.userPwd=userPwd;
		 * this.userName=userName;
		 */
		this(userId,userPwd,userName);
		//위와 같이 중복되는 동일한 초기화하는 내용의 생성자가 이미 존재할 경우
		//this라는 생성자를 호출 가능
		//this 생성자: 같은 클래스 내의 다른 생성자를 호출하는 구문
		//단, 주의사항은 반드시 생성자 내부 가장 윗줄에 작성해야 한다
		this.age=age;
		this.gender=gender;
	}
	//메소드
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return "userId: "+userId+", userPwd: "+userPwd+", userName: "+userName+", age: "+age+", gender: "+gender;
	}
}
