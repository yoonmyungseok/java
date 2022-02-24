package com.kh.chap02_inherit.run;

import com.kh.chap02_inherit.model.vo.Airplane;
import com.kh.chap02_inherit.model.vo.Car;
import com.kh.chap02_inherit.model.vo.Ship;

public class Run {

	public static void main(String[] args) {
		Car c=new Car("벤틀리",12.5,"세단",4);
		Ship s=new Ship("새우잡이배",3,"어선",1);
		Airplane a=new Airplane("보잉707",0.02,"여객기",16,5);
		
		System.out.println(c.toString());
		System.out.println(s.toString());
		System.out.println(a.toString());
		
		c.howToMove(); //바퀴를 굴려서 움직인다
		s.howToMove(); //프로펠러를 돌려가면서 움직인다
		a.howToMove(); //바퀴를 굴려 달리다가 날개를 휘저으면서 움직인다
	}

}
