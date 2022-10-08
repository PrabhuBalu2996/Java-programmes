package org.demo;

public class Plaindrome {

	public static void main(String[] args) {
		
		
		for(int a=1; a<=30; a++){
		
		
		int i,j=0,k=0;
		
		i=a;
		
		while(i>0){
			j=i%10;
			k=(k*10)+j;
			i=i/10;
		
		}
		if(a==k){
			
			System.out.println("Is palindrome:"+k);
			
		}else{
			System.out.println("Not a palindrome:"+k);
		}
		}
	}
}
