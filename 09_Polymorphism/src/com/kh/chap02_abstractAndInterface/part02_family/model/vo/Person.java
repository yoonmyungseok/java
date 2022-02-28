package com.kh.chap02_abstractAndInterface.part02_family.model.vo;

public abstract class Person {
	private String name;
	private double weight;
	private int health; 
	
	public Person() {
		
	}
	public Person(String name, double weight, int health) {
		this.name=name;
		this.weight=weight;
		this.health=health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", weight=" + weight + ", health=" + health + "]";
	}
	//메소드로 사람의 행위를 정의: 먹는 행위, 잠을 자는 행위 => 추상 메소드
	//public abstract void eat();
	//public abstract void sleep();
	//Basic에 만들어둔 eat, sleep 메소드를 활용해볼것
	
	
}
