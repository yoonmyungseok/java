package com.kh.chap02_set.part01_hashSet.model.vo;

import java.util.Objects;

public class Student {
	private String name;
	private int age;
	private int score;
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
	}
	/*
	@Override
	public boolean equals(Object obj) {
		//Student객체.equals(비교할Student객체);
		Student other=(Student)obj;
		//this.name과 other.name이 일치하는지
		//this.age와 other.age가 일치하는지
		//this.score와 other.score가 일치하는지
		if((this.name).equals(other.name)&&this.age==other.age&&this.score==other.score) {
			return true;
		}else {
			return false;
		}
	}
	//hashCode() 메소드 재정의: 필드값들을 가지고 문자열 하나로 만든다음에 hashCode 생성
	@Override
	public int hashCode() {
		//"공유20100"
		return (name+age+score).hashCode();
	}
	*/
	@Override
	public int hashCode() {
		return Objects.hash(age, name, score);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && Objects.equals(name, other.name) && score == other.score;
	}
	
	
}
