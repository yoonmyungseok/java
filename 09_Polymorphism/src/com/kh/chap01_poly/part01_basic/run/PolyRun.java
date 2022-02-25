package com.kh.chap01_poly.part01_basic.run;

import com.kh.chap01_poly.part01_basic.model.vo.Child1;
import com.kh.chap01_poly.part01_basic.model.vo.Child2;
import com.kh.chap01_poly.part01_basic.model.vo.Parent;

public class PolyRun {

	public static void main(String[] args) {
		//명심할 사항: 대입 연산자를 기준으로 왼쪽과 오른쪽의 자료형은 같아야 한다
		//1. 부모 타입의 참조형 변수(레퍼런스 변수)로 부모 객체를 다루는 경우
		System.out.println("1. 부모 타입의 참조형 변수로 부모 객체를 다루는 경우");
		Parent p1=new Parent();
		p1.printParent();
		//p1.printChild1(); //아무리 상속관계여도 부모에서 자식에 있는 메소드를 호출 불가하다
		//참고: 자식에서 부모에 있는 메소드는 호출 가능했다
		//=>p1이라는 참조형 변수로 Parent 클래스에 있는 것만 접근 가능
		
		//2. 자식 타입의 참조형 변수(레퍼런스 변수)로 자식 객체를 다루는 경우
		System.out.println("2. 자식 타입의 참조형 변수로 자식 객체를 다루는 경우");
		Child1 c1=new Child1();
		c1.printChild1();
		c1.printParent();
		//=>c1이라는 참조형 변수로 Parent 클래스에 있는 것+ Child1 클래스에 있는 것들을 다 접근 가능
		
		//3. 부모 타입의 참조형 변수(레퍼런스 변수)로 자식 객체를 다루는 경우(다형성이 적용된 개념)
		System.out.println("3. 부모 타입의 참조형 변수로 자식 객체를 다루는 경우");
		Parent p2=new Child1();
		//대입 연산자를 기준으로 양쪽의 자료형이 다름에도 불구하고 오류 발생x
		//형변환때를 잠깐 생각해보면 대입 연산자 기준으로 왼쪽이 더 크다면 자동형변환이 일어남
		//=>Child1 타입의 객체가 new 연산자에 의해 생성되고 나서 Parent 형으로 자동형변환이 일어나서 주소값이 잘 담긴것을 유추 가능
		//=>"상속"이라는 구조가 전제로 클래스간의 형변환이 가능하다
		p2.printParent();
		((Child1)p2).printChild1();
		//=>p2라는 참조형 변수로 Parent 클래스에 있는 것들을 접근가능
		//=>단, p2를 Child1 형으로 강제 형변환을 하게 된다면 Child1 클래스에 있는 것들도 접근 가능
		
		/*
		 * 클래스 간에 형변환이 가능하다(단, 상속 구조일 경우에만 가능)
		 * 
		 * 1. UpCasting: 자식 타입=>부모 타입으로 형변환 (자동형변환, 형변환연산자 생략 가능)
		 * 
		 * 2. DownCasting: 부모 타입=>자식 타입으로 형변환(강제형변환, 형변환연산자 생략 불가능)
		 */
		
		//다형성을 쓰는 이유: 객체배열을 편리하게 쓰기 위해서
		
		//Child1 객체 2개, Child2 객체 2개가 필요한 상황이라고 가정
		Child1[] arr1=new Child1[2];
		arr1[0]=new Child1(1,2,3);
		arr1[1]=new Child1(2,3,4);
		
		Child2[] arr2=new Child2[2];
		arr2[0]=new Child2(3,4,5);
		arr2[1]=new Child2(4,5,6);
		//배열의 특징: 한가지 자료형의 여러 값들을 묶어서 보관
		//원래 배열은 한 가지 자료형만 담을 수 있기 때문에 Child1, Child2에 해당되는 배열을 각각 한 개씩 만들어줘야 했다면
		//"다형성" 개념을 적용하여 부모타입의 객체배열 하나로 다양한 그 자식 객체들을 한 번에 담아서 보관하겠다
		System.out.println("===== 다형성을 접목한 객체 배열 ======");
		
		//부모타입의 객체 배열 한 개 생성(원래대로라면 Parent 타입만 4개 들어갈 수 있음)
		Parent[] arr=new Parent[4];
		
		//자식이 부모로 자동형변환 된다 라는 점을 이용하여 자식객체를 부모객체만 넣을 수 있는 배열에 담는다면?
		arr[0]=/*(Parent)*/new Child1(5,6,7);
		arr[1]=/*(Parent)*/new Child1(6,7,8);
		arr[2]=/*(Parent)*/new Child2(7,8,9);
		arr[3]=/*(Parent)*/new Child2(8,9,10);
		//=>다형성의 성질을 이용해서 값을 한번에 묶어서 보관한 상태

		arr[0].printParent();
		arr[1].printParent();
		arr[2].printParent();
		arr[3].printParent();
		
		//부모타입을 자식타입으로 강제형변환해서 우리가 원하는 자식의 기능을 사용
		((Child1)arr[0]).printChild1();
		((Child1)arr[1]).printChild1();
		((Child2)arr[2]).printChild2();
		((Child2)arr[3]).printChild2();
		//=>부모타입 배열에 담을 때에는 그냥 담으면 되고, 꺼내서 처리를 하고싶을 때에는 강제형변환으로 원상복구 시켜준다음에 하면됨
		
		//((Child2)arr[0]).printChild2();
		//ClassCastException: 클래스 간에 형변환이 잘못 되었을 경우 발생하는 에러
		//Child1 형태를 Parent로 바꾼 상태=>Child2로 바꾸다 보니까 해당 오류가 발생(자식간은 상속관계가 아니므로)
		
		System.out.println("===== 반복문을 이용해서 해보기 =====");
		for(int i=0;i<arr.length;i++) {
			//각 인덱스 별로 실제로 참조하고 있는 자식 클래스로 다운캐스팅을 한다음에 메소드를 호출해야함
			//instanceof 연산자: 현재 객체가 실제로 어떤 자식 클래스를 참조하고있는지 확인하고자 할 때 사용
			//[표현법]
			//객체명 instanceof 검사하고싶은클래스명
			//=>맞다면 true, 아니면 false
			
			/*
			 * Quiz
			 * 부모객체 instanceof 부모클래스 ==true
			 * 자식객체 instanceof 부모클래스 ==true(부모님꺼는 내꺼)
			 * 부모객체 instanceof 자식클래스 ==false
			 * 자식객체 instanceof 자식클래스 ==true
			 */
			
			//반복문 쓰고싶을때 방법1)
			/*
			if(arr[i] instanceof Child1) { //arr[i]이 원래는 Child1 형태였다면
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
			*/
			
			//반복문 쓰고싶을때 방법2)
			arr[i].print();
			//단, 메소드를 잘 활용해서 오버라이딩을 하게 되면 굳이 메소드 호출 전 다운캐스팅을 안해도 됨
			//동적바인딩의 디테일한 정의: 실질적으로 참조하고 있는 자식클래스의 오버라이딩된 메소드를 찾아가서 알아서 실행을 한다
		}
		/*
		 * 객체지향프로그래밍, OOP(Object Oriented Programming)
		 * OOP의 3대 요소
		 * 1. 캡슐화: 정보은닉(필드에는 private, 간접접근 getter/setter)
		 * 2. 상속: 공통적인 내용물을 뽑아서 부모클래스로 한번 정의해두고 자식클래스에서 가져다가 쓰는 기능
		 * 3. 다형성: 상속된 관계에서 객체간의 형(Class)변환 (업캐스팅, 다운캐스팅)
		 */
	}

}
