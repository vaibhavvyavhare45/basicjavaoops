package com.prowings.collections;

import java.util.ArrayList;
import java.util.List;

public class SynchronizedArrayListway1<T> {
	
		private List<T> al=new ArrayList<>();
		
		public synchronized void add(T element) {
			al.add(element);
		}
		public synchronized T get(int index) {
			return al.get(index);
		}
	
		public synchronized int size() {
			return al.size();
			
		}

}
