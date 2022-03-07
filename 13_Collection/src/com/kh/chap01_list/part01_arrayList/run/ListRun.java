package com.kh.chap01_list.part01_arrayList.run;

import java.util.ArrayList;
import java.util.List;

import com.kh.chap01_list.part01_arrayList.model.vo.Music;

public class ListRun {

	public static void main(String[] args) {
		//ArrayList를 쓰겠다=>ArrayList 객체를 생성
		//ArrayList list=new ArrayList(); //내부적으로 크기 10짜리 배열이 생성됨
		//ArrayList list=new ArrayList(3); 
		//제네릭 설정을 추가해서 ArryList 객체 생성
		ArrayList<Music> list=new ArrayList<>();
		System.out.println(list); //[] : 안에 아무것도 없는 상태
		
		//ArrayList에서 제공하는 메소드들: 추가, 삭제, 뽑아오기, ...
		list.add(new Music("Tears","소찬휘")); //0번째 인덱스에 저장
		list.add(new Music("와","이정현")); //1번째 인덱스에 저장
		list.add(new Music("바다의왕자","박명수")); //2번째 인덱스에 저장
		//list.add("끝"); //3번째 인덱스에 저장
		//순서가 유지되면서 값이 추가됨(각 index에 담겨있음)
		//크기에 제약이 없음
		//다양한 타입의 값 추가를 지원
		System.out.println(list);
		list.add(1, new Music("강남스타일","싸이"));
		//중간에 값 추가시 알아서 기존의 값들을 뒤로 땡겨주는 작업이 내부적으로 진행됨
		System.out.println(list);
		list.set(1, new Music("강북멋쟁이","정형돈"));
		System.out.println(list);
		list.remove(2);
		//중간에 값 삭제 시 알아서 기존의 값들을 앞으로 땡겨주는 작업이 내부적으로 진행됨
		System.out.println(list);
		System.out.println("리스트에 담긴 데이터 수: "+list.size());
		System.out.println("리스트의 마지막 인덱스: "+(list.size()-1));
		
		//제네릭 설정 전
		//Music m=(Music) list.get(0);
		//System.out.println(m);
		//System.out.println(list.get(0));
		//System.out.println(((Music)list.get(0)).getTitle());
		
		//제네릭 설정 후
		Music m=list.get(0);
		System.out.println(m);
		System.out.println(m.getTitle());
		System.out.println(list.get(1).getTitle());
		//현재 자료형의 통일이 이뤄지지 않았기 때문에 최상위 부모인 Object를 통해서 형변환을 해야한다
		System.out.println("--------------------------------------------------------------------------------------");
		
		//반복문을 사용하여 0~번 마지막 인덱스까지 데이터 출력
		//for(int i=0; i<list.size();i++) {
		//	System.out.println(list.get(i));
		//}
		for(Music music:list) {
			System.out.println(music);
		}
		System.out.println("--------------------------------------------------------------------------------------");
		//for(Object o: list) {
		//	System.out.println(o);
		//}
		
		
		//List sub=list.subList(0, 2);
		List<Music> sub=list.subList(0, 2);
		System.out.println(sub);
		System.out.println("--------------------------------------------------------------------------------------");
		
		list.addAll(sub);
		System.out.println(list);
		System.out.println("--------------------------------------------------------------------------------------");
		
		System.out.println("리스트가 비어있나요?: "+list.isEmpty()); //false => 값이 담겨있음
		
		System.out.println("리스트 비움");
		list.clear();
		System.out.println(list); // []
		System.out.println("리스트가 비어있나요: "+list.isEmpty()); //true -> 값이 없음
		
	}

}
