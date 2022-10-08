package org.demo;

public class Swap_Numbers {
	
	// swap the numbers with third variable
	public static void main(String[] args) {
		int i = 150;
		int j = 100;
		int k;
	
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("**** After swap ****");
		
		k = i;
		i=j;
		j=k;
		
		System.out.println(i);
		System.out.println(j);		
	}
	}



