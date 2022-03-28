package com.onebill.thread;

import com.onebill.corejava.Exercise;

public class Main extends Thread {
int max;

public Main(int max) {
	this.max= max;
}

@Override
public void run() {
	while(max>0) {
		if (max%2==0) {
			System.out.println(max);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}	
			}
			max--;
		}
	}
	

public static void  main(String[] args) {
	Main exercise=new Main(10);
	exercise.start();
	Main exercise2=new Main(20);
	exercise2.start();
	 
}
}
