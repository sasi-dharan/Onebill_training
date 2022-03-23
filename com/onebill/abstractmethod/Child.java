package com.onebill.abstractmethod;

public class Child extends Parent{
	public Child(int x) {
		super(x);
	}
	@Override
	void m1(){
		System.out.println("this is an implementation");
	}

}
