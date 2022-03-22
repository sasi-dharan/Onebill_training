package com.onebill.corejava;
import java.util.*;
public class UserInput {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int x= scan.nextInt();
	int y= scan.nextInt();
	Scanner sc = new Scanner(System.in);
	String name= sc.nextLine();
	System.out.println("the result is" + (x+y)  +name);
}
}
