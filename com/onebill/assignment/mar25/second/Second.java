package com.onebill.assignment.mar25.second;

public class Second {
//public static void main(String[] args) {
//	int n1=0;
//	int n2=1;
//	int n3,count= 10, i;
//	 
//	System.out.println(n1);
//	System.out.println(n2);
//	
//	for ( i =0; i < count; i++) {
//		n3= n1+n2;
//		System.out.println(n3);
//		n1=n2;
//		n2=n3;
//	}
//}
	static int n1=0, n2= 1, n3=0;
	static void fibonoci(int count) {
		if(count>0) {
			n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			fibonoci(count-1);
		}
	}
	
public static void main(String[] args) {
	//int count=10;
	
	System.out.println(n1);
	System.out.println(n2);
    fibonoci(8);
}
}
