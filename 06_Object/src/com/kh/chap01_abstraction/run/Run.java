package com.kh.chap01_abstraction.run;

import com.kh.chap01_abstraction.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		//변수만을 가지고 프로그래밍을 하게 된다면?
		
		String name1="홍길동";
		int age1=20;
		double height1=170.4;
		
		//클래스라는 개념을 가지고 프로그래밍을 할것
		//1. Student라는 클래스를 만들었음
		
		//2. 만들어진 Student라는 클래스를 통해서 객체(=참조형 변수) 생성
		//기본형 변수 => 자료형 변수명;
		//참조형 변수 => 자료형 변수명=new 자료형();
		Student student=new Student();
		
		//3. 필요한 값을 필드에 담기
		student.setName("홍길동");
		student.setAge(20);
		student.setHeight(170.4);
		//해당 student라는 객체의 각 필드에 직접적으로 접근해서 값을 대입
		
		//4. 값이 잘 담겼는지 출력
		System.out.println(student); //주소값이 출력됨
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getHeight());
		//해당 student라는 객체의 각 필드에 직접적으로 접근해서 값을 조회함
		
		//xxx님의 나이는 xx살이고, 키는 xxxcm입니다. 형식으로 출력하고싶다
		System.out.println(student.getName()+"님의 나이는 "+student.getAge()+"살이고, 키는 "+student.getHeight()+"cm입니다.");
		//=>여기까지 홍길동 학생을 나타내는 객체를 만들고 값을 대입해서 출력까지 해본것
		
		//한개만 더
		Student kim=new Student();
		kim.setName("김영희");
		kim.setAge(21);
		kim.setHeight(159.9);
		System.out.println(kim.getName()+"님의 나이는 "+kim.getAge()+"살이고, 키는 "+kim.getHeight()+"cm입니다.");
		/*
		 * 여태까지 객체지향 프로그래밍
		 * 1단계)추상화 => 고민하는 단계(이름, 나이, 키)
		 * 코딩으로 적용=> 변수->배열->클래스
		 * 학생을 표현할 수 있는 클래스(Student) 만들기: name, age, height
		 * "생성" (new를 이용=> heap 영역에 실제 학생 정보를 담을 공간 확보) 
		 * .을 통해서 필드에 직접 접근(값도 대입해보고, 값을 조회도 해보고)
		 * 
		 * 2단계)캡슐화
		 */
		//직접적으로 접근해서 값을 대입하거나 조회할 경우 보안적인 문제가 생길 수 있다
		//보안의 3요소: 기밀성, 무결성, 가용성
		//=>값을 직접적으로 접근해서 어떠한 행위가 일어난다면, 조회했을때에는 기밀성이, 값을 대입했을 경우에는 무결성이 깨질 수 있다
		//=>객체지향설게 원칙 중 하나가 정보 은닉: 정보를 숨겨주는 단계가 "캡슐화"(.으로 직접접근이 불가능하게 막겠다)
		
		/*
		 * 이 시점 기준으로는 캡슐화가 된 상태
		 * 
		 * 캡슐화가 된 상태에서 .을 통해 필드에 그대로 접근한다면?
		 * The field 클래스명.필드명 is not visible 오류 발생=>해당 클래스에 있는 해당 필드를 찾을 수 없다(해당 필드를 우리가 이미 private으로 숨겨놨기 때문)
		 */
	}

}
