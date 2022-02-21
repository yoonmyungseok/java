package com.kh.chap02_encapsulation.run;

import com.kh.chap02_encapsulation.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//1단계. 학생 정보를 담을 학생 객체 생성
		Student hong=new Student(); //객체 생성==인스턴스화 
		//이 시점까지는 name=null, age=0, height=0.0 (JVM에 의해)
		
		//2단계. 값 대입
		/*
		 *hong.name="홍길동";
		 *hong.age=20;
		 *hong.height=177.3; 
		 */
		//위와 같이 대입할 경우에는 직접 접근이 불가해져서 is not visible 이라는 오류가 발생
		//직접 접근을 막았다면 간접적으로나마 접근할 수 있도록 getter/setter 메소드를 만들었음
		//=>값의 대입도, 값의 출력도 메소드 호출을 통해 하겠다
		
		//값을 대입하는 용도의 setter 메소드를 호출해보자
		hong.setName("홍길동");
		hong.setAge(20);
		hong.setHeight(177.3);
		
		//3단계. 잘 담겨있나 조회
		System.out.println(hong.getName());
		System.out.println(hong.getAge());
		System.out.println(hong.getHeight());
		//=>정보 은닉을 위해 한번 우회해서 가겠다
		
		//System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm입니다.\n",hong.getName(),hong.getAge(),hong.getHeight());
		
		//김영희 학생이라는 객체를 만들어보기
		//객체명:kim(나이 21살, 키169.4)
		Student kim=new Student();
		kim.setName("김영희");
		kim.setAge(21);
		kim.setHeight(169.4);
		//System.out.printf("%s님의 나이는 %d살이고, 키는 %.1fcm입니다.\n", kim.getName(),kim.getAge(),kim.getHeight());
		
		System.out.println(hong.information());
		System.out.println(kim.information());
	}
}
