package com.prowings.Interfacedemo;

interface inter{
	int i=20;
	//int j; //in interface  compulsory initialize value  to the interface variable 
}
public class Test implements inter {
	public static void main(String[] args) {
		//i=2;//we can't change the declaring interface  variable value in implemented class
		System.out.println(i);
	}

}
