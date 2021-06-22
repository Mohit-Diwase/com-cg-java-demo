package com.cg.demo.multi;

public class ThreadDemo2 extends Thread {
	

	public static void main(String[] args) {
		
		Thread obj = new Thread(new ThreadDemo());
		
		obj.start();
		System.out.println("m " + obj.isAlive());
		
	}
	public void run() {
		
		ThreadDemo2 obj1 = new ThreadDemo2();
		
		System.out.println("r " + obj1.isAlive());
	}

}
