package com.kh.chap01_list.part02_mvc.controller;

import java.util.ArrayList;

import com.kh.chap01_list.part02_mvc.model.vo.Music;

//Controller: 사용자의 요청을 받아서 처리해주는 클래스, 처리결과는 View로 돌려보냄=>MVC패턴에서 C에 해당됨
public class MusicController {
	private ArrayList<Music> list=new ArrayList<>();
	{
		//초기화 블록: 필드에 값을 대입해주는 용도
		list.add(new Music("Tears","소찬휘"));
		list.add(new Music("와","이정현"));
	}
	
	//새로운 곡 추가 요청이 들어왔을 때 실행될 메소드(곡 추가 기능 담당)
	public int insertMusic(String title, String artist) {
		int before=list.size();
		list.add(new Music(title, artist));
		int after=list.size();
		return after-before;
	}
	//곡 전체 조회 요청이 들어왔을 때 실행될 메소드(곡 전체 조회 기능 담당)
	public ArrayList<Music> selectAllMusic() {
		return list;
	}
	//특정 곡 검색 요청이 들어왔을 때 실행될 메소드(특정 곡 검색 기능 담당)
	public ArrayList<Music> searchMusic(String keyword){
		//검색기능=>반복은 다 돌려야함 무조건
		//반복 돌리다가 포함된게 있으면 검색결과만 들어있을 list 하나 만들어서 추가
		//1. 검색결과가 담길 ArrayList 객체를 하나 만들기
		ArrayList<Music> searched=new ArrayList<>();
		//2. 반복돌리면서 곡 제목에 keyword가 포함되어있나 검사=>포함되어있으면 1번에서 만든 list에 추가
		for(int i=0; i<list.size();i++) {
			if(list.get(i).getTitle().contains(keyword)) {
				searched.add(list.get(i));
			}
		}
		//3. 검색결과 리턴
		return searched;
	}
	//특정 곡 삭제 요청 시 실행될 메소드(특정 곡 삭제 기능 담당)
	public int deleteMusic(String title) {
		//1.리턴할 결과값을 담을 변수 셋팅
		int num=0;
		//2.반복문을 활용하여 getTitle()과 title을 동등비교해서 삭제=>이 때 삭제가 잘 된다면 리턴할 결과값에 ++처리
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) { //제목이 동일하다면 삭제
				//삭제=>remove(인덱스위치값)
				list.remove(i);
				//삭제 횟수 1증가
				num++;
			}
		}
		//3.정수 결과값 리턴
		return num; //0일수도 있고 양수값일수도 있음
	}
	//특정 곡 수정 요청시 실행될 메소드(특정 곡 수정 기능 담당)
	public int updateMusic(String title, String upTitle, String upArtist){
		//1. 반환할 결과값을 담을 변수 셋팅
		int result=0;
		//2. 반복
		//=>곡 제목이 일치하는지 동등비교(동등하다면 수정 진행, result++)
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getTitle().equals(title)) {
				//수정하는 코드 작성=>필드값을 수정(setter 메소드)
				list.get(i).setTitle(upTitle); //i 번째에 존재하는 Music 타입의 객체
				list.get(i).setArtist(upArtist);
				
				//result 값 1증가
				result++;
			}
		}
		//3.결과값 리턴
		return result;
	}
}
