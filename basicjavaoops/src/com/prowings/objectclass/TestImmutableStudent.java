package com.prowings.objectclass;

public class TestImmutableStudent {
	public static void main(String[] args) {
		Address ad=new Address(1055,"nagpur");
		Student st=new Student(102, "marish mokal", ad);
		System.out.println(st);
		//System.out.println(ad);
		//ad.city="pune";
		st.getAddress().city="pune";
		System.out.println(st);
		
		
	}

}
