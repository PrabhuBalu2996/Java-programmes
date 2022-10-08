package org.demo;

public class Reverseorder {
	
	public static void main(String[] args) {
		int a = 123;
		
		int i,j=0,k=0;
		
		i=a;
		
		while(i>0){
			j=i%10;
			k=(k*10)+j;
			i=i/10;
		}
		System.out.println(k);
	}

}
