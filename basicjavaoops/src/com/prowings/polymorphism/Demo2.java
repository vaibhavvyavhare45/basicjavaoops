package com.prowings.polymorphism;

public class Demo2 {
	public void m1() {
		System.out.println("i am no arg m1() method");
	}
//	public void m1(int a) {
//		System.out.println("i am no arg m1(int a) method");
//	}
//	public void m1(float b) {
//		System.out.println("i am no arg m1(float b) method");
//	}
	public void m1(double c) {
		System.out.println("i am no arg m1(float c) method");
	}
	
	public static void main(String[] args) {
		Demo2 d1=new Demo2();
		d1.m1();
		d1.m1(10);
		d1.m1(200.5f);
		d1.m1(10l);
		d1.m1(10.05);
		d1.m1('a');
		d1.m1(0);
	}

}
