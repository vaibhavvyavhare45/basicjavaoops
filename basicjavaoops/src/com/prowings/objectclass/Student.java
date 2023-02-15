package com.prowings.objectclass;

public final class Student {

	private final int roll;
	private final String name;
	private final Address address;

	public Student(int roll, String name, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		Address cloneAddr = new Address();//creating deep copy of the program...
		cloneAddr.setCity(address.getCity());
		cloneAddr.setPin(address.getPin());
		this.address = cloneAddr;
	}

	public int getRoll() {
		return roll;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		Address dummy = new Address();
		dummy.setPin(this.address.getPin());
		dummy.setCity(this.address.getCity());
		return dummy;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", address=" + address + "]";
	}

}
