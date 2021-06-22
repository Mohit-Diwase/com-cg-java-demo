package com.cg.demo.multi;

public class ThreadDemo implements Runnable {
	
	public static void main(String[] args) {
		
		Thread obj = new Thread(new ThreadDemo());
		
		obj.start();
		System.out.println("m " + obj.isAlive());
		
	}
	public void run() {
		
		Thread obj1 = Thread.currentThread();
		
		System.out.println("r " + obj1.isAlive());
	}

}
