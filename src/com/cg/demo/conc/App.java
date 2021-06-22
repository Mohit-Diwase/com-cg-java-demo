package com.cg.demo.conc;

public class App implements Runnable {
	
	public static void main(String[] args) {
		
		App app = new App();
		
		for (int i =1; i <= 10; i++) {
			Thread thread = new Thread(new App());
			thread.start();
		}
	}
	



	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i =1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}
}
