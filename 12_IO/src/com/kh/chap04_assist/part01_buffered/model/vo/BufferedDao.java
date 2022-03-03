package com.kh.chap04_assist.part01_buffered.model.vo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedDao {
	//BufferedReader / BufferedWriter
	
	//프로그램 --> 외부 매체(파일)
	//출력(BufferedWriter 이용)
	public void fileSave() {
		//0. 객체 선언 및 null로 초기화
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			//1. 기반스트림 객체 생성
			fw=new FileWriter("c_buffer.txt");
			
			//2. 보조스트림 객체 생성
			bw=new BufferedWriter(fw);
			
			//3. 파일로 데이터 내보내기 : BufferedWriter에 있는 write() 메소드 사용
			bw.write("안녕하세요");
			//bw.write("\n");
			bw.newLine(); //자동으로 개행을 넣어주는 메소드
			bw.write("반값습니다.\n");
			bw.write("저리가세요");
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			//3. 다 쓴 스트림 자원 반납: 자원 반납의 순서는 객체 생성의 역순
			try {
				bw.close();
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//프로그램 <--외부 매체 (파일)
	//입력(BufferedReader 이용)
	public void fileRead() {
		//0. 자원 반납을 위한 선언 및 초기화
		/*
		BufferedReader br=null;
		try {
			//1. 보조스트림객체를 생성( 매개변수로 기반도 생성)
			br=new BufferedReader(new FileReader("c_buffer.txt"));
			
			//2. 데이터를 파일로부터 읽어들여오기 : readLine() 메소드
			
			//System.out.println(br.readLine());
			//System.out.println(br.readLine());
			//System.out.println(br.readLine());
			
			String str=null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				//3. 자원 반납
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		*/
		
		//try ~ with ~ resource 구문(JDK7 버전부터 사용 가능)
		try(BufferedReader br=new BufferedReader(new FileReader("c_buffer.txt"))){
			//입력받는 구문만 잘 작성하면됨
			String str=null;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
