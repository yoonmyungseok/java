package com.kh.variable;

public class C_Cast {
	/*
	 * 형변환: 값의 자료형을 바꾸는 개념
	 * 
	 * 컴퓨터 상에서 값 처리 규칙
	 * 1. =(대입연산자)를 기준으로 왼쪽과 오른쪽은 같은 자료형이어야 한다
	 * =>즉, 같은 자료형에 해당하는 값만 대입이 가능하다
	 * =>다른 자료형의 값을 대입하고자 한다면 "형변환"이 필수
	 * 
	 * 2. 같은 자료형 끼리만 연산이 가능하다
	 * =>즉, 다른 자료형끼리 연산을 수행하고 싶을 경우에는 "형변환"이 필수
	 * 
	 * 형변환의 종류
	 * 1. 자동 형변환
	 * =>자동으로 형변환이 진행되기 때문에 내가 직접 코드상으로 형변환 할 필요가 없다
	 * 작은 바이트의 자료형 값-> 큰 바이트의 자료형 변수에 담을 경우
	 * 
	 * 2. 강제 형변환
	 * =>자동 형변환이 진행되지 않은 경우, 내가 직접 강제로 형변환 해야하는 경우
	 * 큰 바이트의 자료형 값-> 작은 바이트의 자료형 변수에 담을 경우
	 * 강제형변환을 명시적형변환이라고도 부른다
	 * 
	 * [표현법]=> (바꿀자료형)자료형을바꾸고싶은값;
	 * => (바꿀자료형) : 형변환 연산자, Cast 연산자
	 */
	public void autoCasting() {
		// 자동형변환이 되는 case
		// 1. int (4byte) -> double (8byte)
		int i1=10;
		double d1=i1;
		System.out.println("d1: "+d1);
		/*
		 * 자동으로 형변환이 되었다
		 * 그런데 int는 정수, double은 실수이므로
		 * d1은 10 -> 10.0으로 형변환이 된다
		 */
		int i2=12;
		double d2=3.3;
		
		double result2= i2+d2;
		System.out.println("result2: "+result2);
		
		// 2. int (4byte) -> long (8byte)
		int i3=1000;
		long l3=i3;
		long l4=2000; // 값 뒤에 L을 붙이지 않아도 문제가 없는 이유는 자동형변환이 되기 때문
		
		System.out.println("l3: "+l3);
		System.out.println("l4: "+l4);
		
		// 특이 케이스 3. long (8byte) -> float (4byte)
		// 정수가 실수로 변환될 경우 큰 사이즈의 정수가 작은 사이즈의 실수로 자동형변환이 가능하다
		// 4byte float 형은 long 형보다 담을 수 있는 값의 범위가 크기 때문에 가능하다
		long l5=50000000;
		float f5=l5;
		
		System.out.println("f5: "+f5);
		
		// 특이 케이스 4. char (2byte) <-> int (4byte) 양방향 형변환 가능
		char ch=65;
		System.out.println("ch: "+ch);
		int num='A';
		System.out.println("num: "+num);
		System.out.println((int)'김');
		/*
		 * 참고) 아스키코드표
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념(0~127, 영문자 대소문자 알파벳, 숫자, 특수문자)
		 * 'A'=65 / 'a'=97
		 * 
		 * 참고) 유니코드표
		 * 각 문자별로 고유한 숫자값으로 대치되서 표현되는 개념
		 * 아스키코드표의 확장된 개념(0~65xxx, 영어, 숫자, 특수문자, 그 이외의 언어 등)
		 */
		int sum='A'+10;
		System.out.println("sum: "+sum); // 문자와 정수 사이에 산술연산이 가능하다
		System.out.println("sum: "+(char)sum); // 알파벳 별로 고유값을 확인 가능하다
		
		// 특이케이스 5. byte 끼리의 연산, short 끼리의 연산
		byte b1=1;
		byte b2=10;
		byte result=(byte)(b1+b2); //int 형의 결과를 강제로 byte형으로 변환
		// byte나 short로 연산시 무조건 int로 취급
	}
	//강제(명시적) 형변환 : 큰 크기의 자료형을 작은 크기의 자료형으로 형변환 할경우(무조건 형변환 연산자를 붙여야 할 경우)
	public void forceCasting() {
		// 강제형변환 해야하는 case
		// 1. double(8byte) -> float(4byte)
		float f1=4.0f; // 항상 f를 붙여줘야 함
		double d2=8.0;
		float f2=(float)d2;
		// 2. double(8yte) -> int(4byte)
		double d3=10.89;
		int i3=(int) d3;
		System.out.println("i3: "+i3);
		/*
		 * 강제 형변환 시 주의사항
		 * 데이터 손실이 일어날 수 있다. 강제 형변환은 신중히 해야한다
		 * =>소수점 아래 내용이 절삭되었다
		 */
		int iNum=10;
		double dNum=5.89;
		
		//int iSum=iNum+dNum;
		//iNum+dNum: iNum이 상대적으로 큰 사이즈인 double 형으로 자동형변환이 되고 dNum과 덧셈연산이 행해진 상태=>그래서 지금 double 형태이다
		
		// 해결 방법
		// 1. 연산 결과를 int 형에 맞춰서 강제 형변환 시키기
		int iSum= (int)(iNum+dNum);
		System.out.println("iSum: "+iSum);
		
		// 2. 덧셈 연산 전에 dNum을 int 형으로 강제형변환 후에 덧셈 연산을 수행
		// => 자동형변환은 작은 바이트가 큰 바이트로 변환되기 때문에
		// 원래대로라면 iNum이 double로 변환 후에 덧셈이 실행되는 순서
		// => 그런데 그 전에 일부로 dNum을 int 형으로 강제로 형변환시키고 나서 덧셈 연산을 수행
		int iSum2=iNum+(int)dNum;
		System.out.println("iSum2: "+iSum2);
		
		// 3. 결과값을 double 형 변수에 담기
		// => 이 경우, 데이터 손실이 없어서 정확한 값이 담긴다
		double dSum=iNum+dNum;
		System.out.println("dSum: "+dSum); //15.89
		
		/*
		 * 강제형변환을 주로 하는 경우
		 * Type mismatch: cannot convert from xxx to xxx 오류 발생시
		 */
		
	}
}
