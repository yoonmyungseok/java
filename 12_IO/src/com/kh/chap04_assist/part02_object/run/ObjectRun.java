package com.kh.chap04_assist.part02_object.run;

import java.util.Scanner;

import com.kh.chap04_assist.part02_object.model.dao.ObjectDao;
import com.kh.chap04_assist.part02_object.model.dao.ObjectsDao;

public class ObjectRun {

	public static void main(String[] args) {
		ObjectDao od = new ObjectDao();
		/*
		//사용자가 원하는 파일명으로 먼저 입력받고 넘겨주기
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 파일명을 입력하세요: ");
		String fileName=sc.nextLine();
		
		od.fileSave(fileName);
		//객체 단위로 기록되어 있어서 깨져 보이지만 잘 저장된것
		*/
		//od.fileRead();
		
		ObjectsDao ods=new ObjectsDao();
		/*
		Scanner sc=new Scanner(System.in);
		System.out.print("원하는 파일명을 입력하세요: ");
		String fileName=sc.nextLine();
		osd.fileSave(fileName);
		*/
		ods.fileRead();
		
	}

}
