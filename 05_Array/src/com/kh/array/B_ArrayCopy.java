package com.kh.array;

import java.util.Arrays;

public class B_ArrayCopy {
	/*
	 * 배열 복사
	 * 방법
	 * 1. 얕은 복사: 배열의 주소값만 복사
	 * 2. 깊은 복사: 동일한 새로운 배열을 하나 생성해서 실제 내부값들을 복사하는 개념
	 * 
	 * 
	 */
	public void method1() {
		//복사를 뜨기전에 전제조건: 원본이 있어야함
		//원본 배열
		int[] origin= {1,2,3,4,5};
		System.out.println("===== 원본배열 출력 =====");
		for(int i=0;i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		//복사본 배열
		int[] copy=origin;
		
		System.out.println("\n===== 복사본 배열 출력 =====");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		//여기 시점으로 봤을 때에는 복사가 아주 잘된것을 알 수 있다
		
		//copy 배열을 가지고 수정하기
		copy[2]=100;
		System.out.println("\n===== 복사본 배열 수정후 =====");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println("\n===== 복사본 배열 수정후의 원본 =====");
		for(int i=0;i<origin.length;i++) {
			System.out.print(origin[i]+" ");
		}
		//원본이 훼손됨=>주소값만 복사를 해서=>원본 배열도 같이 변경이되었음
		//얕은 복사: 배열의 주소값이 복사되어 원본과 복사본이 같이 상황(시늉만 낸것)
	}
	public void method2() {
		//복사의 전제 조건: 원본이 있어야함
		//1.for문을 이용하는 방법
		//새로운 배열을 생성한 후에 각 인덱스별로 내부 값을 일일이 대입시켜주는 방법
		
		//원본 배열
		int[] origin= {1,2,3,4,5};
		
		//복사본 배열
		int[] copy=new int[origin.length];
		
		for(int i=0;i<copy.length;i++) {
			copy[i]=origin[i];
		}
		System.out.println("==복사본 배열==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		
		//복사본 배열 수정
		copy[2]=100;
		System.out.println("\n==복사본 배열 수정 후==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println("\n==복사본 배열 수정 후의 원본 배열==");
		for(int i=0;i<copy.length;i++) {
			System.out.print(origin[i]+" ");
		}
		System.out.println("\n원본 배열의 해시코드: "+origin.hashCode());
		System.out.println("복사본 배열의 해시코드: "+copy.hashCode());
		//해시코드와 주소값이 각각 다르다=>원본이 훼손되지 않고 새로이 잘 복사가 되었다
	}
	public void method3() {
		//2. 새로운 배열을 생성한 후에 System이라는 클래스에서 arraycopy라는 메소드를 호출하여 복사

		//원본 배열
		int[] origin= {1,2,3,4,5};
		
		//복사본 배열
		int[] copy=new int[10]; // 0 0 0 0 0 0 0 0 0 0
		
		System.arraycopy(origin, 0, copy, 0, 5); //1 2 3 4 5 0 0 0 0 0
		//origin 배열의 0번째 인덱스에서부터 총 5개의 값을 copy 배열의 0번째 인덱스에서부터 차곡차곡 복사해서 넣겠다
		//[표현법]
		//System.arraycopy(원본배열명, 원본배열의복사를시작할인덱스,복사본배열명,복사본배열의복사값이들어갈시작인덱스,복사할갯수)
		//System.arraycopy(origin, 0, copy, 2, 5); //0 0 1 2 3 4 5 0 0 0 //origin 배열의 0번째 인덱스에서부터 총 5개의 값을 copy 배열의 2번째 인덱스에서부터 차곡차곡 복사해서 넣겠다
		//System.arraycopy(origin, 0, copy, 1, 3); //0 1 2 3 0 0 0 0 0 0 
		//System.arraycopy(origin, 2, copy, 9, 2);
		//java.lang.ArrayIndexOutOfBoundsException 오류 발생
		
		//System.arraycopy() 메소드 사용시 특징
		//1. 인덱스 범위를 벗어나면 오류가 발생=>메소드 호출 시 숫자 부분 주의해서 쓸 것
		//2. 복사를 하고 남은 부분은 JVM에 의해서 초기화가 되었던 0이라는 값이 계속 유지됨
		//3. 자유자재로 내가 원하는 자리에 원하는 만큼만 부분복사가 가능
		
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		System.out.println("\n원본 해시코드: "+origin.hashCode());
		System.out.println("복사본 해시코드: "+copy.hashCode());
		//다른 주소값을 갖고있다=> 다른곳을 참조하고있다
		//배열 수정시 서로 영향을 끼치지 않는다는것을 유추 가능
	}
	public void method4() {
		//3. Arrays 클래스에서 제공하는 copyOf 라는 메소드를 이용한 복사
		
		//원본 배열
		int[] origin= {1,2,3,4,5};
		
		//복사본 배열
		int[] copy=Arrays.copyOf(origin, 3);
		for(int i=0;i<copy.length;i++) {
			System.out.print(copy[i]+" ");
		}
		//[표현법]
		//자료형[] 복사본배열명=Arrays.copyOf(원본배열명, 복사본배열의크기);
		
		/*
		 * System.arraycopy 메소드호출
		 * 몇번 인덱스에서부터 몇개를 어느 위치의 인덱스부터 복사해서 붙여넣을건지 세세하게 지정 가능
		 * 
		 * Arrays.copyOf 메소드 호출
		 * 무조건 원본 배열의 0번 인덱스에서부터 복사가 진행된다(내가 제시한 갯수만큼)
		 * 또한 내가 제시한 갯수만큼 곧 복사본배열의 크기로 지정된다
		 */
	}
	public void method5() {
		//clone 메소드를 호출하여 복사
		
		//원본 배열
		int[] origin= {1,2,3,4,5};
		
		//[표현법]
		//자료형[] 복사본배열명=원본배열명.clone();
		int[] copy=origin.clone();
		//인덱스 직접지정X, 복사할갯수 지정X=>따로 옵션이 존재하지 않음=>즉, 원본배열과 완전 똑같이 복사
		
		//for문을 이용해서 출력=>[1,2,3,4,5] 형태로 출력
		/*
		System.out.print("[");
		for(int i=0;i<copy.length;i++) {
			//copy[i]를 연달아 출력(단, 쉼표 추가)
			if(i<(copy.length-1)) {
				System.out.print(copy[i]+",");
			}else {
				System.out.print(copy[i]);
			}
		}
		System.out.print("]");
		*/
		//Arrays 클래스에서 제공하는 배열을 한개의 문자열로 이어줘서 내보내주는 메소드
		//[표현법]
		//Arrays.toString(내가출력하고자하는배열명);
		System.out.println(Arrays.toString(copy)); // [1,2,3,4,5]
		//=>앞과 뒤에[ ], 값들 사이에는 ,를 찍어서 각 인덱스에 담긴 값들을 하나의 문자열로 이어서 만들어주는 메소드
		System.out.println("원본 해시코드: "+origin.hashCode());
		System.out.println("복사본 해시코드: "+copy.hashCode());
	}
}
