package com.prowings.multi_threading;

class MyThread extends Thread{
	 public void run() {
		 System.out.println("thread is running...");
	 }
 }


public class MyThreadDemo1 {
	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.start();
		for(int i=0;i<10;i++) {
			System.out.println("main thread");
		}
	}
	

}
