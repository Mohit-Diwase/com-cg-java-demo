package com.cg.demo.encap;

class Phone {

	void call() {
		System.out.println("Calling...");
	}

	void sms() {
		System.out.println("Sending SMS...");
	}

}

   class FeaturePhone extends Phone {
	   
	   void music() {
		   System.out.println("Playing Music...");
	   }
   }

public class PhoneDemo {

	public static void main(String[] args) {

		Phone phone = new Phone();
		phone.call();
		phone.sms();
		phone.sms();
	
		FeaturePhone featurePhone = new FeaturePhone();
		featurePhone.music();
		featurePhone.call();
		featurePhone.sms();

	}

}