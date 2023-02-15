package com.prowings.objectclass;

public class Employee {
	int id;
	String name;
	Address1 address;

	public Employee() {
		super();
	}

	public Employee(int id, String name, Address1 address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(Employee e) {
		super();
		this.id = e.id;
		this.name = e.name;
		Address1 ad = new Address1(e.address);
		this.address = ad;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address1 getAddress() {
		return address;
	}

	public void setAddress(Address1 address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
