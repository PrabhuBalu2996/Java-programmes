package org.demo;

public class Armstrong {
	public static void main(String[] args) {
		int a = 232;
		
		int i,j=0,k=0;
		
		i=a;
		
		while(i>0){
			j=i%10;
			k=k+(j*j*j);
			i=i/10;
		}
		
		if(a==k){
			System.out.println("Is Armstrong:"+k);
		}else{
			System.out.println("Is not a Armstrong:"+k);
		}
		
	}
}
