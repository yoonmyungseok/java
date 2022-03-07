package com.kh.chap04_assist.part02_object.model.dao;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.kh.chap04_assist.part02_object.model.vo.Phone;

public class ObjectsDao {
	//Phone[] arr=new Phone[3];
	
	//Phone 객체만 담을 수 있는 ArrayList 객체 생성
	ArrayList<Phone> phoneList=new ArrayList<>(3);
	
	public ObjectsDao() {
		//arr[0]=new Phone("아이폰",1000000);
		//arr[1]=new Phone("갤럭시",1300000);
		//arr[2]=new Phone("플립폰",1500000);
		phoneList.add(new Phone("아이폰",1000000));
		phoneList.add(new Phone("갤럭시",1300000));
		phoneList.add(new Phone("플립폰",1500000));
	}
	//출력
	public void fileSave(String fileName) {
		
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(fileName))){
			//for(int i=0;i<arr.length;i++) {
			//	oos.writeObject(arr[i]);
			//}
			for(int i=0;i<phoneList.size();i++) {
				oos.writeObject(phoneList.get(i));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public void fileRead() {
		try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test3.txt"))){
			/*
			while(true) {
				System.out.println(ois.readObject());
				//readObject() 메소드는 Object 형식으로 반환해줌
				//toString() 메소드를 이미 오버라이딩 했기 때문에 동적바인딩에 의해서 형변환을 굳이 안해도 자식메소드가 호출될것임
			}
			*/
			//for(int i=0;i<arr.length;i++) {
			//	System.out.println(ois.readObject());
			//}
			//EOFException : End Of File , IOException의 자식
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(EOFException e) {
			System.out.println("파일을 다 읽었습니다");
		}catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
