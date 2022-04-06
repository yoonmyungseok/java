package com.kh.chap03_map.part01_hashMap.run;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import com.kh.chap03_map.part01_hashMap.model.vo.Snack;

public class MapRun {

	public static void main(String[] args) {
		HashMap<String, Snack> hm = new HashMap<>();
		//계층 구조를 보면 List나 Set 계열은 Collection 인터페이스를 구현한 클래스들
		//=>데이터를 추가할 때 add 메소드를 사용함
		//단, Map은 부모가 애초에 Collection이 아님
		//=>데이터를 추가할 때 put 메소드 사용(key+value 세트로 추가)
		
		//1. put(K key, V value) : map 공간에 key+value 세트로 추가해주는 메소드
		hm.put("꼬깔콘", new Snack("새우마요맛",200));
		hm.put("꼬북칩", new Snack("초코츄러스맛",400));
		hm.put("스윙칩", new Snack("그냥...양파맛?",300));
		hm.put("새우깡", new Snack("짭쪼름맛",500));
		System.out.println(hm); 
		//저장 순서 유지X, 
		
		hm.put("포테이토칩", new Snack("그냥..양파맛?",300));
		System.out.println(hm);
		//value값이 중복되더라도 key값이 중복되지만 않으면 잘 저장됨
		hm.put("새우깡", new Snack("매운새우맛",600));
		//key 값이 중복된 상태
		System.out.println(hm);
		
		//2. get(Object Key) : V : 해당 키값의 value를 돌려주는 메소드
		System.out.println(hm.get("꼬북칩"));
		System.out.println(hm.get("새우깡"));
		
		//3. size() : HashMap 객체에 들어있는 자료의 갯수를 반환해주는 메소드
		System.out.println("size: "+hm.size());
		
		//4. replace(K key, V value) : HashMap 객체에 해당 Key 값을 찾아서 새로 전달된 value로 바꿔치기 해주는 메소드
		hm.replace("꼬북칩", new Snack("인절미맛",350));
		System.out.println(hm);
		
		//5. remove(Object key) : HashMap으로부터 key값에 해당되는 key+value를 세트로 지워주는 역할
		hm.remove("새우깡");
		System.out.println(hm);
		System.out.println("size: "+hm.size());
		System.out.println("-------------------------------------------------------------");
		
		//순차적으로 HashMap에 있는 데이터들에 접근하고자 할때?
		//1. 향상된 for문=> 변수선언부 어떻게 작성? => 사용 불가
		//2. ArrayList로 옮기는 방법=> 부모가 다른 다른계열이기 때문에 옮기는거 불가
		//3. iterator() : Map 계열에서는 사용불가
		//=>Map 계열에서 제공하는 메소드 2가지 (Map을 Set으로 바꿔줌)
		//Map을 Set으로 바꿔주는 메소드
		//1. keySet() : HashMap에 있던 key들만 Set으로 옮겨주는 역할
		Set<String> keySet=hm.keySet();
		
		//적어도 이 시점에서는 Set에 key 값들이 다 담긴 상태=>1,2,3번 방법으로 반복 가능
		// iterator() 방법으로 돌려보기
		Iterator<String> itKey=keySet.iterator();
		while(itKey.hasNext()) {
			String key=itKey.next();
			Snack s=hm.get(key);
			System.out.println("key: "+key+", value: "+s);
		}
		
		//2. entrySet() : HashMap에 있던 key+value 모두 Set으로 옮겨주는 역할 (Entry 집합형태)
		Set<Entry<String, Snack>> entrySet=hm.entrySet();
		
		// iterator()
		Iterator<Entry<String,Snack>>itEntry=entrySet.iterator();
		while(itEntry.hasNext()) {
			Entry<String, Snack> entry=itEntry.next();
			
			System.out.println("key: "+entry.getKey()+", value: "+entry.getValue());
		}
	}

}
