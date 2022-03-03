package com.kh.chap03_char.model.dao;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCharDao {
	//프로그램 --> 외부매체 (파일)
	//출력
	public void fileSave() {
		//FileWriter : 파일로 데이터를 2byte 단위로 출력해주는 스트림
		
		//0. 나중에 자원 반납할거에 대비해서 미리 선언 및 null로 초기화
		FileWriter fw=null;
		try {
			//1. FileWriter 스트림 객체 생성
			//출력스트림의 경우는 파일이 없어도 제시 가능(알아서 파일을 만들어 주고나서 통로가 연결됨)
			fw=new FileWriter("b_char.txt");
			
			//2. 2byte 단위로 데이터를 파일로 출력시키기(한글 가능함) : write() 메소드 사용
			fw.write('A');
			fw.write('김');
			fw.write('\n');
			fw.write("와... IO 재밌다..ㅎㅎㅎ"); //문자 하나씩 쪼개서 이동
			
			//오버로딩된 다른 형태
			//char[] 배열로 넘기기
			char[] cArr= {'k','i','w','i'};
			fw.write(cArr);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. 다 쓴 스트림 자원 반납 : close() 메소드 사용
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	//프로그램 <-- 외부매체(파일)
	//입력
	public void fileRead() {
		//FileReader : 파일로부터 데이터를 2byte 단위로 입력받는 스트림
		
		//0. 나중에 자원 반납할거에 대비해서 미리 선언 및 null로 초기화
		FileReader fr=null;
		
		try {
			//1. FileReader 객체 생성
			//=>입력의 경우는 항상 존재하는 파일명을 작성해야함
			fr=new FileReader("b_char.txt");
			
			//2. 파일로부터 읽어들이기 : read() 메소드 사용
			/*
			System.out.println(fr.read());
			System.out.println(fr.read());
			System.out.println(fr.read());
			*/
			//개행문자는 아스키코드로 10 (LF: Line Feed)
			//read() 메소드는 더이상 불러올 값이 없을 경우 -1을 반환
			
			//반복문 활용
			int value=0;
			while((value=fr.read())!=-1) {
				System.out.println((char)value);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. 스트림 자원 반납 : close() 메소드 사용
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
