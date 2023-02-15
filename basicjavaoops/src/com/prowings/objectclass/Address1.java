package com.prowings.objectclass;

public class Address1 {
	int pin;
	String city;

	public Address1() {
		super();
	}

	public Address1(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}

	public Address1(Address1 address) {
		super();
		this.pin=address.pin;
		this.city=address.city;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address1 [pin=" + pin + ", city=" + city + "]";
	}

}
