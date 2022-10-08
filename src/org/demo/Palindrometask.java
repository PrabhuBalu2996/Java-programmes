package org.demo;

public class Palindrometask {
	public static void main(String[] args) {		
	
	int a = 0;
	
	for(int z=1;z<=1000;z++){		
	
		int b,i=0,j=0;
		
		b = z;
		while(b>0){
			i=b%10;
			j=(j*10)+i;
			b=b/10;
		}
	if(z==j){
		a++;
	}
		}
	System.out.println(a);
}
	}