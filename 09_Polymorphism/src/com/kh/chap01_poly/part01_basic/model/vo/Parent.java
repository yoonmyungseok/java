package com.kh.chap01_poly.part01_basic.model.vo;

public class Parent {
	private int x;
	private int y;

	public Parent() {
		super();
	}

	public Parent(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Parent [x=" + x + ", y=" + y + "]";
	}

	// 다형성 이용시 instanceof 연산자를 써야함
	public void printParent() {
		System.out.println("나 부모야");
	}

	// 다형성 이용시 instanceof 연산자를 쓸 필요가 없음
	public void print() {
		System.out.println("나 부모야");
	}
}
