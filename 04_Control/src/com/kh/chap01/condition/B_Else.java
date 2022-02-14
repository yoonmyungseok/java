package com.kh.chap01.condition;

import java.util.Scanner;

public class B_Else {
	/*
	 * if-else 문
	 * [표현법]
	 * 
	 * if(조건식){
	 * 		조건식이 true일 경우 실행할 내용
	 * }else{
	 * 		조건식이 false일 경우 실행할 내용
	 * }
	 * => 조건식의 결과가 true일 경우 if 영역에 있는 코드를 실행하고 false일 경우 else 영역에 있는 코드를 실행한다
	 */
	public void method1() {
		//단독 if문의 method2 참고!
		//사용자가 입력한 정수값이 짝수인지, 홀수인지를 판별해서 각각 "짝수다","홀수다"를 출력
		//if-else 버전
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		if((num%2==0)) {//짝수일 경우
			System.out.println("짝수다");
		}else {//홀수일 경우
			System.out.println("홀수다");
		}
		//중첩 if문: if 영역 안에 또 if문이 있을 경우
		//=>삼항연산자의 중첩 활용 참고!
	}
	public void method2() {
		//사용자가 입력한 양수값이 짝수인지, 홀수인지를 판별해서 각각 "짝수다","홀수다"를 출력
		Scanner sc=new Scanner(System.in);
		System.out.print("양수 입력: ");
		int num=sc.nextInt();
		
		//우선적으로 양수인지 아닌지 먼저 판별
		//그 이후에 짝수인지 홀수인지 판별
		
		if(num>0) {//양수일 경우
			if((num%2)==0) {//짝수일 경우
				System.out.println("짝수다");
			}else { //짝수가 아닐 경우 or 홀수일 경우
				System.out.println("홀수다");
			}
		}else {//양수가아닐경우
			System.out.println("입력한 값이 양수가 아닙니다");
		}
	}
	public void method3() {
		//사용자로부터 이름을 입력받아 유효한 이름이라면 본인입니다. 어서오세요 라는 문구 출력
		//아니라면 본인이 아닙니다 돌아가주세요 문구 출력
		//=>문자열의 동등비교
		Scanner sc=new Scanner(System.in);
		System.out.print("입장하기 위해서 이름을 입력하세요: ");
		String name=sc.nextLine();
		
		// 유요한 이름=> "홍길동"
		/*if(name=="홍길동") {
			System.out.println("본인입니다. 어서오세요");
		}else {
			System.out.println("본인이 아닙니다. 돌아가주세요");
		}
		 * 기본자료형(boolean, byte, short, int, long, float, double, char)
		 * 들 끼리는 동등 비교시 == 또는 !=를 가지고 잘 비교됨
		 * 
		 * String (참조 자료형)을 동등비교하고자 할 때 ==으로 잘 비교가 되지 않음
		 * 왜? => 주소값이 비교되기 때문에
		 * 
		 * 문자열끼리의 동등비교시 이용할 수 있는 메소드
		 * equals()
		 * =>만일 두 문자열의 내용이 동일하다면 true를 반환 동일하지 않다면 false를 반환
		 * [표현법]
		 * 비교하고자하는문자열1.equals(비교하고자하는문자열2);
		 */
		if(name.equals("홍길동")) {
			System.out.println("본인입니다. 어서오세요");
		}else {
			System.out.println("본인이 아닙니다. 돌아가주세요");
		}
	}
	/*
	 * if-else if문
	 * 동일한 비교대상을 가지고 여러 개의 조건을 제시해 두고자 할 경우 쓰임
	 * [표현법]
	 * if(조건식1){
	 * 	실행할 코드1;
	 * }
	 * else if(조건식2){
	 * 	실행할 코드2;
	 * }
	 * else if(조건식3){
	 * 	실행할 코드3;
	 * }
	 * ...
	 * else{
	 * 	앞의 조건들이 모두 false일 경우 반드시 실행해야 할 내용이 있을 경우 실행한다
	 * }
	 */
	public void method4() {
		//양수, 0, 음수
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력: ");
		int num=sc.nextInt();
		
		if(num>0){//1.양수일 경우=> num>0
			System.out.println("양수다");
		}else if(num==0) { //2. 0일 경우 => num==0
			System.out.println("0이다");
		}else { // 3.양수도 아니고, 0도 아닐경우 =>굳이 조건 비교할 필요가 없음
			System.out.println("음수다");
		}
		
	}
	public void method5() {
		/*
		 * 사용자로부터 키보드로 점수를 입력받기
		 * 90점 이상인 경우: "A등급"
		 * 80점 이상 90점 미만인 경우: "B등급"
		 * 70점 이상 80점 미만인 경우: "C등급"
		 * 70점 미만인 경우: "D등급"
		 */
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		int score=sc.nextInt(); //점수
		sc.nextLine();
		
		char grade=' '; //등급
		//char 자료형의 값의 경우에는 보통 공백 한칸으로 초기화 한다
		//우선적으로 0~100사이인지를 먼저 체크
		//if(score<0 || score>100) 0~100 사이가 아닐 경우 
		if(score>=0 && score<=100) {// 0~100 사이일 경우
		//4가지 경우의 수에 따라서 등급을 판별
			if(score>=90) {//90점 이상 =>A등급
				grade='A';
			}
			else if(score>=80) {//80점 이상 =>B등급
				grade='B';
			}
			else if(score>=70) {//70점 이상 =>C등급
				grade='C';
			}
			else { //A도아니고 B도아니고 C도 아닐 경우=>D등급
				grade='D';
			}
			//이 시점에서 점수에 따른 grade 변수에 담긴 값이 판별 완료
			System.out.printf("당신의 점수는 %d점이고, 등급은 %c등급입니다",score,grade);
		}else { //0~100 사이가 아닐 경우
			System.out.println("잘못 입력했습니다");
		}
	}
	public void method6() {
		//나이=>어린이, 청소년, 성인
		Scanner sc=new Scanner(System.in);
		System.out.print("나이를 입력하세요: ");
		int age=sc.nextInt();
		sc.nextLine();
		//우선적으로 양수인지를 먼저 판단
		if(age>0) {//양수라면 유효한 나이대
			//age 값이 13이하인 경우: 어린이
			String person="";
			if(age<=13) {
				//System.out.println("어린이 입니다");
				person="어린이";
			}
			else if(age<=19) {//age 값이 13초과 19이하인 경우: 청소년
				//이미 앞에서 age<=13 조건이 false임이 이미 밝혀진 시점이기 때문에
				//age>13라는 조건을 굳이 작성하지 않아도 된다
				//System.out.println("청소년 입니다");
				person="청소년";
			}
			else { //age값이 19초과인 경우: 성인 => 어린이도 아니고 그리고 청소년도 아닐 경우
				//System.out.println("성인 입니다");
				person="성인";
			}
			System.out.println("당신의 나이는 "+age+"살이고, 당신은 "+person+"입니다");
		}else {//양수가 아니라면 유효한 나이대가 아님
			System.out.println("잘못 입력했습니다");
		}
	}
}
