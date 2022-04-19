package com.te.pen;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BallPen implements Pen{

	@Override
	public void write() {
		System.out.println("this is from ballpen");
		
	}

}
