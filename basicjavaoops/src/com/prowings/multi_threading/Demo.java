package com.prowings.multi_threading;

public class Demo extends Thread {

	public void run() {

		try {
			for (int i=0 ; i<5 ; i++) {

				sleep(500);
				System.out.println("Hii");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Demo obj = new Demo();
		
		for(int i=0 ; i<5 ; i++) {
			
			obj.yield();
		System.out.println("hello");
		
		}
		obj.start();
	}

}
