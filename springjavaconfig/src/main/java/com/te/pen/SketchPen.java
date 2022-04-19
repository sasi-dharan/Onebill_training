package com.te.pen;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Qualifier
@Component
public class SketchPen implements Pen {
    @Qualifier
	@Override
	public void write() {
		System.out.println("this is from sketch pen");
	}

}
