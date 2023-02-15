package com.prowings.collections;



public class SynchArrayListTest<T>  extends SynchronizedArrayListway1<T>{
	
	public static void main(String[] args) {
		SynchArrayListTest<Integer> al=new SynchArrayListTest<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(5);
		//System.out.println(al.toString());
	}

}
