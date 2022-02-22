package com.kh.chap05_constructor.run;

import com.kh.chap05_constructor.model.vo.User;

public class ConstructorRun {

	public static void main(String[] args) {
		//기본생성자 호출 테스트
		//기본생성자를 호출하는 구문=>new로 객체를 생성하는 구문
		//클래스명 객체명=new 클래스명();
		User u1=new User();
		
		System.out.println(u1.information());
		u1.setUserId("user01");
		u1.setUserPwd("pass01");
		u1.setUserName("홍길동");
		u1.setAge(20);
		u1.setGender('남');
		System.out.println(u1.information());
		
		User u2=new User("user02","pass02","이연지");
		System.out.println(u2.information());
		//userId, userPwd, userName 세가지 필드는 객체 생성과 동시에
		//내가 원하는 값으로 채워짐
		//단, 내가 매개변수로 제시하지 않은 필드에 대해서는 기본값이 그대로 담겨있음
		
		//그럼 setter 메소드가 필요한가??
		//중간에 일부 필드값만 한두개 바뀌는 상황이 생긴다면 setter를 쓰는것이 더 좋음
		u2.setAge(15);
		u2.setGender('여');
		System.out.println(u2.information());
		
		User u3=new User("user03","pass03","태권도",20,'남');
		System.out.println(u3.information());
	}

}
