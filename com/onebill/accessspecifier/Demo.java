package com.onebill.accessspecifier;

public class Demo {
	public int a=10;// everywhere
	private int b= 20;//accessed with in a class
	int c=30;//with package
	protected int d=40;//outside package if extended
	
	
	public void  m1(){
		System.out.println("print its public");
	}

	private void  m2(){
		System.out.println("print its private");
	}

    void  m3(){
		System.out.println("print its default");
	}

	protected void  m4(){
		System.out.println("print its protected");
	}
	

}
