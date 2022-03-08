package com.kh.chap03_map.part01_hashMap.model.vo;

public class Snack {
	private String flaver;
	private int calory;
	public Snack() {
		super();
	}
	public Snack(String flaver, int calory) {
		super();
		this.flaver = flaver;
		this.calory = calory;
	}
	public String getFlaver() {
		return flaver;
	}
	public void setFlaver(String flaver) {
		this.flaver = flaver;
	}
	public int getCalory() {
		return calory;
	}
	public void setCalory(int calory) {
		this.calory = calory;
	}
	@Override
	public String toString() {
		return "Snack [flaver=" + flaver + ", calory=" + calory + "]";
	}
	
	
}
