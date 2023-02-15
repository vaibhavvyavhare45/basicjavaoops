package com.prowings.objectclass;

public class EqualHashCodeDemo {
	
	int roll;
	String nm;
	public EqualHashCodeDemo(int roll,String nm) {
		this.roll=roll;
		this.nm=nm;		
	}
	public boolean equals(Object obj){
		if(this==obj)
			return true;
		if(obj instanceof EqualHashCodeDemo ) {
			EqualHashCodeDemo s=(EqualHashCodeDemo)obj;{
				if(roll==s.roll && nm.equals(s.nm))
					return true;
				}
				return false;
			}
			return false;
	}
		
		
		
		
		
	public static void main(String[] args) {
		EqualHashCodeDemo o1=new EqualHashCodeDemo(101, "vaibhav");
		EqualHashCodeDemo o2=new EqualHashCodeDemo(102, "pranavsss");
		EqualHashCodeDemo o3=new EqualHashCodeDemo(101, "vaibhav");
		EqualHashCodeDemo o4=new EqualHashCodeDemo(101, "marish");
		EqualHashCodeDemo o5=new EqualHashCodeDemo(101, "Marish");
		//o1=o5;
		System.out.println(o1.equals(o2));//
		//System.out.println(o1==o5);
		
		
	}

}
