package com.kh.variable;

import java.util.Scanner;

public class B_KeyboardInput {
	public void inputTest1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("당신의 이름은 무엇입니까?: "); //이름 입력 받기
		/*
		 * 사용자가 입력한 값을 문자열로 받아오는 메소드: next(), nextLine()
		 * 사용자의 이름을 입력받아서 변수에 동시에 담고싶다!
		 * String name=sc.next();
		 * next(): 사용자가 Enter키를 누를 때까지 대기한다.(next 계열의 모든 메소드의 공통적 특징)
		 * 		   사용자가 입력한 값 중에서 공백이 있을 경우 공백 이전까지만 입력받는다
		 * 
		 */
		
		String name=sc.nextLine(); //nextLine() 메소드 호출
		/*
		 * nextLine(): 사용자가 입력한 값 중에서 Enter키를 누르기 전까지 공백에 무관하게 그 줄에 담긴 모든 문자열을 입력받는다
		 * 			   특히 사용자가 입력한 값 중에서 공백이 포함될 여지가 있을 경우 유용(ex: 주소)
		 */
		
		System.out.print("당신의 나이는 몇 살입니까?: "); //나이 입력 받기
		//사용자가 입력한 값을 int 형 정수로 받아들이는 메소드: nextInt()
		int age=sc.nextInt();
		//주의사항: nextInt() 메소드 호출 후 반드시 nextLine() 메소드를 한 번 실행해야 한다
		
		sc.nextLine(); // 버퍼 공간에 남아있던 엔터를 비워서 엔터를 친 효과를 내는 것
		/* 
		* nextInt() 후 nextLine()이 실행되게 작성되어 있을 경우
		* 버퍼(임시 저장소) 공간에 남아있는 엔터값(\n, 개행문자) 사용자가 자동으로 입력했다고 간주하여
		* 곧바로 메모리로 저장된다(즉, 변수에 담긴다)
		*/
		
		//키 입력받기
		
		//사용자가 입력한 값을 double 타입 형태로 받아들이는 메소드 : nextDouble()
		System.out.print("당신의 키는 몇 cm 입니까?: ");
		double height = sc.nextDouble();
		sc.nextLine(); // 버퍼에 남아있는 엔터값을 비워주기 위해 실행
		
		//여태까지 입력받을 때마다 입력받은 값을 name, age, height 라는 이름의 변수에 보관
		System.out.println("키: "+height+"cm, "+"나이: "+age+"살, "+"이름: "+name+"님 안녕하세요~!");
		
		/*
		 * Scanner 클래스 내의 입력 받는 메소드의 종류들
		 * 1. next(): 문자열을 뽑을 때(단, 공백 전까지)
		 * 2. nextLine(): 문자열을 뽑을 때(공백을 포함해서)
		 * 3. nextInt(): int 타입의 정수값을 뽑을 때
		 * 4. nextByte(): byte 타입의 정수값을 뽑을 때
		 * 5. nextShort(): short 타입의 정수값을 뽑을 때
		 * 6. nextLong(): long 타입의 정수값을 뽑을 때
		 * 7. nextDouble(): double 타입의 실수값을 뽑을 때
		 * 8. nextFloat(): float 타입의 실수값을 뽑을 때
		 * 
		 * => 어떤 타입의 값을 받을지 잘 파악해서 상황에 맞는 메소드를 호출해서 쓰면된다
		 */
	} 
	public void inputTest2() {
		Scanner sc=new Scanner(System.in);
		/*
		 * 문자열을 뽑을 때 => next(), nextLine()
		 * 문자를 뽑을 때 => nextChar()는 존재하지 않음
		 */
		
		// 사용자로부터 인적사항(이름, 나이, 성별, 키)을 키보드로 입력받아 출력하는 프로그램
		// 성별 입력 유도: 남자(Male) / 여자(Female)

		System.out.print("이름: ");
		String name=sc.nextLine();

		System.out.print("나이: ");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("성별(M/F): ");
		char gender=sc.nextLine().charAt(0); // 먼저 문자열을 입력 받은 후 그 문자열의 0번 째 글자만 추출
		//
		/*
		 * 어찌 되었든 간에 문자열은 여러 개의 문자들의 모임이기 때문에
		 * 일단 문자열을 입력받고나서 첫 번째 문자 하나만 뽑아내겠다
		 * 
		 * "apple" 문자열 => 인덱스(index) 개념
		 * 첫 번째 글자:a => 0번째 글자
		 * 두 번째 글자:p => 1번째 글자
		 * 세 번째 글자:p => 2번째 글자
		 * 네 번째 글자:l => 3번째 글자
		 * 다섯 번째 글자:e => 4번째 글자
		 * 
		 * 문자열로 부터 해당 위치(index)의 문자 하나만 뽑아내주는 메소드
		 * => 해당문자열.charAt(내가 뽑고자하는 위치값) 메소드 ex)
		 * 
		 * 1. 일단 키보드로 입력 받는다=> next() 또는 nextLine()
		 * 2. 입력받은 문자열로 부터 charAt 메소드를 실행
		 * => 한 단계로(한 줄로) 표현해보기
		 * sc.nextLine().charAt(0)
		 * 
		 */
		System.out.print("키: ");
		double height=sc.nextDouble();
		sc.nextLine();
		
		//출력해보기
		System.out.println(name+" 님의 개인정보");
		System.out.println("성별: "+gender);
		System.out.println("나이: "+age);
		System.out.println("키: "+height);
	}
	public void inputTest3() {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("이름: ");
		String name=sc.nextLine();
		
		System.out.print("나이: ");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.print("주소: ");
		String address=sc.nextLine();
		
		System.out.println(address+"에 사는"+age+" 살 "+name+"님 환영합니다.");
	}
}
