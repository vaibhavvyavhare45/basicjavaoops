package com.prowings.polymorphism;

class A {
	public void m1() {
   System.out.println("i am a m1 method in java..");
		
	}
}

public class Demo1 extends A {
	public void m1() {
		System.out.println("i am m2 mehtod in java...");
	}
	public void m2() {
		System.out.println("i am m mehtod in java...");
	}

	public static void main(String[] args) {
		A a=new A();
		a.m1();
		//a.m2();
		Demo1 d=new Demo1();
		d.m1();
		d.m1();

	}

}
