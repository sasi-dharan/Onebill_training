package com.onebill.thisSuper;

public class Child extends Parent{
int z;
int c;
int d;
int e;


public Child(int a, int b, int z) {
	super(a, b);
	this.z = z;
	System.out.println("3 parameters");
}
public Child(int a, int b, int z, int c) {
	this(a,b,z);
	this.c=c;
	System.out.println("4 parameters");
}
public Child(int a, int b, int z,int c,int d) {
	this(a,b,z,c);
	this.d=d;
	System.out.println("5 parameters");
}
	
public Child(int a, int b, int z, int c, int d, int e) {
	this(a,b,z,c,d);
	this.e = e;
	System.out.println("6 parameters");
	
}
}



