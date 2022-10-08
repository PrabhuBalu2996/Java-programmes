package org.demo;

public class Oddeven {
	public static void main(String[] args){
	
		int count = 0;
		
		int sum=0;
		for(int i=-1;i<=100;i++){
			sum = sum + i;
			if(i%2 == 0){
				System.out.println(i +": even");
				count++;
			}else{
				System.out.println(i+": odd");
				
			}
			
		}
		System.out.println(sum);
		System.out.println(count);
	}	
	
}
