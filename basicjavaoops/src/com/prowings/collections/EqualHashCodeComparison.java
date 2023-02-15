package com.prowings.collections;

import java.util.HashMap;

public class EqualHashCodeComparison {


	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("arvind", 5778515);
		hm.put("vaibhav", 7878515);
		hm.put("gajanan", 9978515);
		hm.put("ganesh", 77778515);

		System.out.println(hm.hashCode());
	}

}
