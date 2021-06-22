package com.cg.demo.fun;

public class FunDemo { //implements FunIn {

//	@Override
//	public boolean functionalMethod(int i) {
//		// TODO Auto-generated method stub
//		System.out.println("FunctionalMethod");
//		return false;
//	}
	public static void main(String[] args) {
		FunIn obj = new FunIn() {

			@Override
			public boolean functionalMethod(int i) {
				System.out.println("FunctionalMethod");
				// TODO Auto-generated method stub
				return false;
			}
			
		};
		 obj.functionalMethod(10);
	}
}
		
	
	
	
	
	
	

	

	
	

