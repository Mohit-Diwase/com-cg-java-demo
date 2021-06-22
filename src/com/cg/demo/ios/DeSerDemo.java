package com.cg.demo.ios;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerDemo {

	public static void main(String[] args) {

		String file = "emp.ser";
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		Employees emp = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			ois = new ObjectInputStream(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			emp = (Employees) ois.readObject(); // discuss
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(emp.toString());
	}

}