package com.kh.array;

public class C_DimensionalArray {
	//2차원 배열: 1차원 배열 여러개를 하나로 묶은것이 2차원 배열
	public void method1() {
		//1차원 배열 선언
		//int[] arr1;
		//int arr2[];
		/*
		 * 1. 2차원 배열 선언
		 * [표현법]=>3가지
		 * 자료형 배열명[][];
		 * 자료형[] 배열명[];
		 * 자료형[][] 배열명;
		 */
		int arr1[][];
		int[] arr2[];
		int[][] arr3;
		
		/*
		 * 2. 2차원 배열 할당(메모리 공간을 확보=배열의 크기를 지정)
		 * [표현법]
		 * 배열명=new 자료형[행크기][열크기];
		 * 
		 */
		arr3=new int[2][3];
		
		//2차원 배열 선언과 동시에 할당
		int[][] arr=new int[3][5];
		//이시점에서부터 우리는 2차원 배열을 사용할 수 있다
		System.out.println(arr); //주소값
		System.out.println(arr[0]); //1차원배열의 주소값
		System.out.println(arr[0][0]); //0
	}
}
