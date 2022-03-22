package com.onebill.corejava;

public class Method {
static int mynum(int x, int y) {
	int z= x+y;
	return z;
}
static double mynum(double x, double y) {
	double z= x+y;
	return z;
}


	public static void main(String[] args) {
	int mydata= mynum(1,2);
	double mydata1= mynum(1.1,2.2);
	System.out.println(mydata);
	System.out.println(mydata1);

	}

}
