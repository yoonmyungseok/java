package com.kh.chap02_byte.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileByteDao {
	//프로그램 --> 외부매체(파일)
	//출력: 프로그램 내의 데이터를 파일로 내보내기(즉, 파일에 기록하겠다)
	public void fileSave() {
		FileOutputStream fout = null;
		try {
			//1. FileOutputStream 객체 생성 
			//해당 파일과 직접 연결되는 1byte 짜리 기반 스트림을 만들겠다.
			//객체 생성시 어느 파일과 연결할건지 파일명을 제시하되, 만약에 내가 존재하지 않는 파일명을 제시하면 알아서 파일이 생성되고 통로가 연결 지어짐
			//존재하는 파일이라면 그냥 바로 통로가 연결지어짐
			fout=new FileOutputStream("a_byte.txt",true); //옵션: 이어쓰기 옵션(true:이어쓰기 / false:덮어쓰기,'기본값')
			
			//2. 연결 통로로 데이터들 출력: write() 메소드 사용
			//1byte 범위: -128~127 (단, 파일에 기록될 때에는 해당 숫자의 고유한 문자가 기록됨)⇒ 아스키코드: 0~127(음수는 불가능)
			fout.write(97); // 'a'가 기록
			fout.write('b'); // 'b'가 기록(형변환)
			fout.write('김'); // 한글은 2byte이기 때문에 깨져서 저장(바이트 스트림으로는 한글을 내보내는데 적합하지 않음)
			
			//오버로딩된 형태로 byte 배열을 매개변수로 전달도 가능
			byte[] bArr= {99,100,101};
			fout.write(bArr); // 'c' 'd' 'e' 기록
			
			//bArr 배열의 1번 인덱스부터 2개의 값을 출력시키겠다
			fout.write(bArr,1,2); // 'd''e' 기록
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {//어떤 예외가 발생하던 간에, 예외가 발생하지 않던간에 반드시 실행하는 블럭
			//3. 스트림을 다 이용했으면 자원을 반납하기(=연결통로를 끊겠다) : 반드시 해줘야함
			//=>close() 메소드 호출
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <-- 외부매체(파일)
	//입력: 파일로부터 데이터를 가져오겠다
	public void fileRead() {
		//FileInputStream : 파일로부터 데이터를 1byte 단위로 입력받는 스트림
		//0. 나중에 자원반납할거에 대비해서 미리 선언 및 초기화만 해둔것
		FileInputStream fin=null;
		
		try {
			//1. FileInputStream 객체 생성 (연결 통로를 열겠다, 연결시키겠다)
			//FileOutputStream 때에는 없는 파일을 제시해도 잘 됨
			//FileInputStream 때에는 없는 파일을 제시하면 바로 오류가 뜸(있는 파일로만 작성)
			fin=new FileInputStream("a_byte.txt");
			
			//2. 통로로 데이터를 읽어오기: read() 메소드 사용
			//단, 1byte 단위로 하나씩 읽어옴
			//=>아스키코드표 참고
			/*
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());
			System.out.println(fin.read());// 파일로부터 모든 문자들을 다 읽어온 상태
			
			System.out.println(fin.read()); //다 읽어들이는 순간 -1이 반환
			*/
			/* 퐁당퐁당 출력
			while(fin.read()!=-1) {
				System.out.println(fin.read());
			}*/
			
			//해결 방법1.
			/*
			int value=0;
			while(true) {
				value=fin.read();
				if(value==-1) {
					break;
				}
				System.out.println(value);
			}
			*/
			//해결 방법2.
			int value=0;
			while((value=fin.read())!=-1) {
				System.out.println(value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. 다 쓴 스트림 자원 반납하기 (연결 끊어주기)
			//close() 메소드 사용
			try {
				fin.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
