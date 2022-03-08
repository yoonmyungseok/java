package com.kh.chap02_set.part01_hashSet.run;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.kh.chap02_set.part01_hashSet.model.vo.Student;

public class SetRun {

	public static void main(String[] args) {
		
		HashSet<String> hs1=new HashSet<>();
		//적어도 이 시점부터는 HashSet 객체에 값을 넣을 수 있음
		//1. add(추가할 값)
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("반갑습니다"));
		hs1.add(new String("여러분"));
		hs1.add(new String("안녕하세요"));
		hs1.add(new String("여러분"));
		//hs1.add(1);
		//hs1.add(new Student());
		System.out.println(hs1);
		
		System.out.println("hs1의 크기: "+hs1.size());
		
		hs1.remove(new String("여러분"));
		
		System.out.println(hs1);
		
		System.out.println("------------------------------------------------");
		
		HashSet<Student> hs2=new HashSet<>();
		hs2.add(new Student("공유",20,100));
		hs2.add(new Student("홍길동",33,80));
		hs2.add(new Student("김영희",25,90));
		hs2.add(new Student("공유",20,100));
		System.out.println(hs2); //저장순서유지x 중복저장 o
		//=>오ㅐ? 동일 객체로 판단이 되지 않아서!
		//HashSet 객체가 중복을 판단하는 기준
		// 값이 추가될 때 마다 equals(), hashCode() 메소드로 값이 중복되는지 비교후
		//둘다 true 값이 나온다면 동일 객체로 판단
		/*
		 * HashSet에 객체를 담을 때 내부적으로 equals() 메소드를 활용해서 중복체크를 함
		 * + hashCode() 메소드를 이용해서 10진수값도 일치하는지 중복체크를 함
		 * =>equals() 결과가 true이고 hashCode() 값도 일치한다면 동일 객체로 판단
		 * equasl()는 주소값 비교용 메소드 / hashCode()는 주소값 기준으로 10진수값 생성
		 * 
		 * 지금부터는 아무리 주소값이 다르더라도 필드에 들어있는 값들이 모두 일치한하면 동일 객체로 판단되게끔 메소드들을 오버라이딩
		 * 
		 * 각 메소드의 원래 역할
		 * Object 클래스에 존재하는 equals() : 두 객체의 주소값을 가지고 동등비교해서 일치하면 true/아니면 false를 반환
		 * Object 클래스에 존재하는 hashCode() : 한 객체의 주소값을 기반으로 해시코드값을 만들어서 반환
		 * 
		 * 오버라이딩할 역할
		 * Student 클래스에 존재하는 equals(): 세 필드 값이 일치하면 true / 아니면 false 값을 반환하게끔 오버라이딩
		 * Student 클래스에 존재하는 hashCode() : 세 필드 값을 기반으로 해서 해시코드 값을 만들어서 반환
		 * 
		 * =>equals()와 hashCode()는 오버라이딩이 필수는 아님
		 * 단, Set 계열에 객체를 담고자 할때는 필수
		 */
		System.out.println("-------------------------------------------------------------------------------------------------");
		//Set=>무작위 객체가 저장되어있는 상태=>index 개념이 없음=>반복문 활용이 불가
		//그럼 담겨있는 객체에 순차적으로 접근을 하고자 할때?
		
		//1. 향상된 for문은 사용가능(for each문) => index 개념이 없는 반복문이라서
		for(Student s:hs2) {
			System.out.println(s);
		}
		System.out.println("-------------------------------------------------------------------------------------------------");
		//2. ArrayList에 담아준 후 ArrayList에서 반복문 실행
		//ArrayList<Student> list=new ArrayList<>();
		//list.addAll(hs2); // 리스트에 hs2에 담겨있던 내용물들을 모두 추가
		ArrayList<Student> list=new ArrayList<>();
		list.addAll(hs2);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-------------------------------------------------------------------------------------------------");
		//3. HashSet 클래스에서 제공하는 Iterator 반복자를 이용한 방법
		//hs2에 담겨있는 객체들을 Iterator로 옮겨담아서 반복돌리기
		Iterator<Student> it=hs2.iterator();
		//반복 돌릴떄의 주의사항: 현재 it에 더이상 뽑아낼 요소들이 있는지 검사를 해서 반복을 돌려야함
		while(it.hasNext()) { //현재 it에 더이상 빼올값이 남아있는지? 라고 물어보는 메소드(있으면 true/ 없으면 false)
			System.out.println(it.next());
		}
		//StringTokenizer와 비슷한 원리	
		// .iterator(): List, Set 계열에서도 쓸 수 있음 / Map 계열에서는 못 씀
		
	}
	

}
