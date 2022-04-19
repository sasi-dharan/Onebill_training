package com.te.pen;

import org.springframework.stereotype.Component;

@Component
public class InkPen implements Pen{

	@Override
	public void write() {
		System.out.println("this is from inkpen");
		
	}

}
