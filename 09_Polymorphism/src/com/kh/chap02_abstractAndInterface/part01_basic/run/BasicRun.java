package com.kh.chap02_abstractAndInterface.part01_basic.run;

import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Basketball;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Football;
import com.kh.chap02_abstractAndInterface.part01_basic.model.vo.Sports;

public class BasicRun {

	public static void main(String[] args) {
		/*
		 * Sports
		 * Basketball
		 * Football
		 */
		//Sports s=new Sports();
		//추상클래스는 객체 생성이 절대 불가하다
		//미완성된 클래스이기 때문
		
		Sports s;
		//단, 객체 생성만 안될 뿐, 참조형 변수로써 선언은 가능하다
		s=new Basketball();
		
		Sports s2=new Football();
		//추상클래스: 다형성을 적용해서 자식객체를 받아주는 용도로는 사용 가능하다
		
		Sports[] arr=new Sports[2];
		arr[0]=new Basketball();
		arr[1]=new Football();
		
		for(int i=0; i<arr.length;i++) {
			arr[i].rule();
		}
		/*
		 * 추상클래스 (미완성된 클래스) abstract class
		 * 추상메소드가 존재하는 순간 반드시 추상클래스로 정의(간주됨)
		 * (일반 필드+일반메소드+추상메소드)
		 * 단, 추상메소드가 없어도 클래스명 앞에 abstract를 붙이면 추상클래스로 만들 수 있다
		 * 객체생성이 불가능하다(단, 참조형 변수로써 자식객체를 담을때는 사용 가능)=>다형성 적용
		 * 
		 * 추상클래스가 필요한 때
		 * =>자식클래스들에게 일정한 규칙을 부여하고 싶을 때 쓰면 좋음
		 * =>클래스가 아직 구체적이지 않은 덜 구현된 상태인거 같을 때(개념적으로)
		 * =>현재 이 클래스에 대한 객체 생성을 애초에 막고싶을때 (기술적으로)
		 * 
		 * 추상메소드
		 * 미완성된 메소드로 몸통부 { }가 구현되어있지 않는 메소드
		 * 자식클래스에서 오버라이딩을 통해 완성되는 메소드(강제로 오버라이딩을 해야함)
		 * =>오버라이딩 안했을 경우 에러 발생
		 * =>메소드 사용의 통일성, 강제성을 확보시켜줌
		 * =>표준화된 틀을 제공할 목적으로도 쓰임
		 */
		
		
	}

}
