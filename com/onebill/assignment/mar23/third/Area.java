package com.onebill.assignment.mar23.third;

public class Area extends Shape{

	@Override
	public void RectangleArea(int length, int breadth) {
		// TODO Auto-generated method stub
		System.out.println("The area of rectangle is: " + length * breadth);
	}

	@Override
	public void SquareArea(int side) {
		// TODO Auto-generated method stub
		System.out.println("The area of square is: "+ side*side );
	}

	@Override
	public void CircleArea(int radius) {
		// TODO Auto-generated method stub
		System.out.println("The area of circle is: "+ 3.14*(radius*radius));
		
	}

}
