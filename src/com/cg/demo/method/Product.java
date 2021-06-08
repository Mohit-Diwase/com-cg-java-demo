package com.cg.demo.method;

public class Product {

	String modelNo;
	double price;
	String expiry;
	String use;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(double price, String expiry, String use) {
		super();
		this.price = price;
		this.expiry = expiry;
		this.use = use;
	}



	public Product(String modelNo, double price, String expiry, String use) {
		super();
		this.modelNo = modelNo;
		this.price = price;
		this.expiry = expiry;
		this.use = use;
	}



	@Override
	public String toString() {
		return "Product [modelNo=" + modelNo + ", price=" + price + ", expiry=" + expiry + ", use=" + use + "]";
	}
	
	
	
//	Product(String modelNo, double price, String expiry, String use) {
//		
//		this.modelNo = modelNo;
//		this.price  = price;
//		this.expiry = expiry;
//		this.use = use;
//		
//	}
//	 @Override
//	    public String toString() {
//	        return "Product [modelNo=" + modelNo + ", price=" + price + ", expiry=" + expiry + ", use=" + use + "]";
//	 }
//	
	
	
}
