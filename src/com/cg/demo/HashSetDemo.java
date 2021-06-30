package com.cg.demo;

import java.util.HashSet;
import java.util.Set;

class HashSetDemo {
	public static void main(String args[]) {
		// create a hash set
		Set<String> hs = new HashSet<String>();
		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
	}
}
