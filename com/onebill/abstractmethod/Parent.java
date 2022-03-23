package com.onebill.abstractmethod;

public abstract class Parent {
	int x;
	static int y;
	public Parent(int x) {
		this.x=x;
	}
	abstract void m1();
	void m2() {
		System.out.println("this is a method "+ x);
	}
}
