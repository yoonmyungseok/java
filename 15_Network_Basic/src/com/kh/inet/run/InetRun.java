package com.kh.inet.run;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetRun {

	public static void main(String[] args) {
		/*
		 * 네트워크(Network)
		 * 여러대의 컴퓨터들이 연결되어있는 통신망을 일컫는 용어(그물망)
		 * 네트워크를 통해 서로간의 데이터를 교환 가능하다
		 * 
		 * 컴퓨터에서의 주소 체계
		 * IP주소: 네트워크 상에 각 컴퓨터들을 식별해줄 수 있는 번호(주소)=>중복되지 않는 컴퓨터를 식별하는 주민번호의 개념(중복이 될 경우는 충돌이 일어남)
		 * Port 번호: 같은 컴퓨터 안에서 작동하는 프로그램을 찾을 때 각각의 프로그램을 식별해주는 내부 주소(포트번호 또한 중복이 일어나면 안됨)
		 * =>IP주소와 Port번호는 고정값이 아니라 변동이 가능한 유동적인 값이다.
		 * (단, 값을 바꿀 때 IP주소, Port번호는 중복이 일어나지 않는 값으로 바꿔줘야 함. IP주소 중복의 기준: 같은 네트워크 상 / Port번호 중복의 기준: 같은 컴퓨터 상 )
		 * 
		 * 서버와 클라이언트
		 * 서버: 클라이언트(고객)에게 서비스를 제공해주는 PC 또는 프로그램. 즉, 클라이언트의 요청을 처리해서 응답해주는 웨이터
		 * 클라이언트: 서버에 요청하는 PC 또는 프로그램. 즉, 서비스를 제공받는 고객
		 * =>서버에 요청하기 위해서는 그 요청하고자 하는 서버의 IP 주소, 포트번호를 알아야함
		 */
		
		//InetAddress 클래스: 네트워크 정보를 확인할 수 있는 클래스 (IP 주소 관련)
		try {
			InetAddress localhost=InetAddress.getLocalHost();
			//localhost: 지역호스트=>내 PC를 지칭
			//getLocalHost(): 내 PC에 대한 정보를 반환해주는 메소드 
			System.out.println(localhost); // PC명/IP주소
			
			System.out.println("내 PC명: "+localhost.getHostName()); //PC명을 반환
			System.out.println("내 IP주소: "+localhost.getHostAddress()); //IP주소를 반환
			System.out.println("----------------------------------------");
			
			//내가 알고 있는 웹사이트의 도메인 주소를 통해서 그 서버와 관련된 정보를 얻기
			//도메인주소: 사용자가 웹사이트에 접속할 때 매번 IP 주소를 외우기 어렵기 때문에 외우기 쉬운 구조로 사용자에게 제공해주는 주소
			//=>네이버:www.naver.com
			InetAddress googlehost=InetAddress.getByName("www.google.com");
			System.out.println(googlehost);
			System.out.println("구글 서버명: "+googlehost.getHostName());
			System.out.println("구글 IP 주소: "+googlehost.getHostAddress());
			//getByName() 메소드: 도메인 주소라는 고유한 주소를 통해서 해당 서버의 정보를 얻어내서 반환시켜주는 메소드
			
			System.out.println("----------------------------------------");
			//도메인을 통해서 그 서버 관련한 것들을 배열로 받을 수 있음
			InetAddress[] naverHost=InetAddress.getAllByName("www.naver.com");
			
			System.out.println("네이버 호스트 갯수: "+naverHost.length);
			for(InetAddress n : naverHost) {
				System.out.println("네이버 서버명: "+n.getHostName());
				System.out.println("네이버의 IP주소: "+n.getHostAddress());
			}
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		/*
		 * 현재 구동중인 서버가 있다면 클라이언트는 그 서버로 "요청"을 보낼 수 있음
		 * =>요청에 대한 처리 결과를 서버가 클라이언트에게 "응답"해줄 것
		 * 
		 * 요청과 응답에 의해서 웹 프로그램(웹사이트==웹 애플리케이션)이 돌아감 ("통신"한다라고 표현)
		 * 웹에서의 통신 방식: HTTP 프로토콜 방식(HTTP라는 규칙에 의해서 내부적으로 통신이 이루어진다)
		 * 참고)HTTPS: 보안 절차가 추가된 HTTP 규칙 버전
		 */
	}

}
