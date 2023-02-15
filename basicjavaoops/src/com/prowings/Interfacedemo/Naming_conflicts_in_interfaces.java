package com.prowings.Interfacedemo;

interface Inter1{
	void m1();
}
interface Inter2{
	void m1();
}

public class Naming_conflicts_in_interfaces implements Inter1,Inter2{
	public void m1() {
		System.out.println("hey there!");
	}
	public static void main(String[] args) {
		
	}

}
