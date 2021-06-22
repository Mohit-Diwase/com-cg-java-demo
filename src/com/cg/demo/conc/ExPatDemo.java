package com.cg.demo.conc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ExPatDemo implements Runnable {
	
	public static void main(String[] args) {
		
		ExPatDemo exp = new ExPatDemo();
		
//		ExecutorService exservice = Executors.newSingleThreadExecutor();
//		
//		for (int i =1; i <= 10; i++) {
//			exservice.execute(exp);
//			
//		}
		
//		ExecutorService exservice = Executors.newCachedThreadPool();
//		
//		for (int i =1; i <= 10; i++) {
//			exservice.execute(exp);
//			
//		}
		
//		ExecutorService exservice = Executors.newFixedThreadPool(3);
//		
//		for (int i =1; i <= 10; i++) {
//			exservice.execute(exp);
//			
//		}
//		exservice.shutdown();
		
		ExecutorService exservice = Executors.newScheduledThreadPool(3);
		
		for (int i =1; i <= 10; i++) {
			exservice.execute(exp);
			
		}
		exservice.shutdown();
		
	}
	
	@Override
	public void run() {
		
		for (int i =1; i <=10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
		
	}

}
