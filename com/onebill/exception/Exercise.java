package com.onebill.exception;
import java.util.Scanner;
public class Exercise {
	public static void main(String[] args) {
		try {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the num ");
		int number1= scan.nextInt();
		System.out.println("enter the num ");
		int number2= scan.nextInt();
		int res=0;
		res= number1/number2;
		
		int[] a;
		a= new int[res];
		a[4]=20;
		System.out.println(a[4]);
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("enter valid index");
//		}catch(ArithmeticException e) {
//			System.out.println("enter valid denominator");
//		}
		}catch(ArrayIndexOutOfBoundsException| ArithmeticException e) {
			if (e instanceof ArrayIndexOutOfBoundsException) {
				System.out.println("enter valid index");
			}if (e instanceof ArithmeticException) {
				System.out.println("enter valid denominator");
			}
		}
		
		
		
		
		System.out.println("ends");
	}

}
