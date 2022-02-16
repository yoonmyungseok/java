package com.kh.array;

public class A_Array {
	public void method1() {
		//배열을 왜 써야 할까?
		//변수만을 가지고 프로그래밍을 해보자
		//0,1,2,3,4 기록
		/*
		int a1=0;
		int a2=1;
		int a3=2;
		int a4=3;
		int a5=4;
		//출력하려면 일일이 출력문을 5번 작성해야함
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		//변수에 있는 값을 반복문으로 출력이 가능한가?=>불가능
		
		for(int i=1;i<=5;i++) {
			System.out.println(ai);
		}
		
		//변수에 있는 값을 반복문으로 합을 구할수 있는가?
		
		int sum=0;
		 
		
		for(int i=1;i<=5;i++) {
			sum=sum+ai;
		}
		
		//총합계=>반복문 이용이 불가하기 때문에 일일이 더해줘야 한다=>반복문 사용 불가
		sum=a1+a2+a3+a4+a5;
		*/
		
		//배열로 프로그래밍 하기
		//0,1,2,3,4 기록
		
		//int arr[];
		
		int[] arr=new int[5];
		/*
		arr[0]=0;
		arr[1]=1;
		arr[2]=2;
		arr[3]=3;
		arr[4]=4;
		*/
		for(int i=0;i<5;i++) {
			arr[i]=i;
		}
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr); // 알수없는값=>주소값
	}
}
