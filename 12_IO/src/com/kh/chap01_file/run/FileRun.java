package com.kh.chap01_file.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {
		//간단하게 파일 만드는 과정 및 메소드들 사용하는거 연습
		//java.io.File 클래스를 가지고 작업
		
		//1. 별도의 경로 지정없이 파일명만 제시해서 파일 생성
		//=>현재 작업하고 있는 프로젝트 폴더 내에 파일이 생성(상대경로)
		/*
		try {
			File f=new File("test.txt");
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		*/
		//2. 경로 지정을 한 파일명을 제시해서 생성
		//=>존재하는 경로로 지정해야함(시작점이 정해져있기 때문에 절대경로)
		/*
		try {
			File f=new File("D:/aaa/test.txt");
			f.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		*/
		//3. 폴더도 만들고 거기에 파일을 생성
		/*
		try {
			File f=new File("D:/bbb");
			f.mkdir();
			File f4=new File("D:/bbb/text.txt");
			f4.createNewFile();
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
		*/
		//4. 별도의 경로 지정없이 폴더를 생성 후 거기에 파일 생성
		try {
			File folder=new File("test");
			folder.mkdir();
			File file=new File("test/person.txt");
			file.createNewFile();
			//File 클래스에서 제공하는 메소드들
			System.out.println("파일이 맞습니까? : "+folder.isFile()); //false
			System.out.println("파일이 맞습니까? : "+file.isFile()); //true
			System.out.println("파일명: "+file.getName());
			System.out.println("상위폴더: "+file.getParent());
			System.out.println("파일용량: "+file.length());
			System.out.println("절대경로: "+file.getAbsolutePath());
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
