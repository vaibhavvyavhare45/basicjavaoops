package com.prowings.objectclass;

public class CopyConstructorDemo {
public static void main(String[] args) {
	Address1 address=new Address1(155,"pune");
	Employee e1=new Employee(1001,"vaibhav",address);
	System.out.println(e1);
	Employee e2=new Employee(e1);
	System.out.println(e1);
	System.out.println(e2);
	//chanding address for try
	
	e2.address.city="mumbai";
	System.out.println(e1);
	System.out.println(e2);
	
}
}
