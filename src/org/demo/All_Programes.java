package org.demo;

public class All_Programes {
	
	public static void main(String[] args) {
		int count =0;
		int counts =0;
		int sum=0;
		int sums =0;
		
		
		for(int i=1; i<=100;i++){
			
			if(i%2 == 0){				
				System.out.println("Even"+i);
				count++;
				sum++;
			}else{
				sum = sum+i;
				System.out.println("Odd" + i);
				counts++;
				
			}
		}
		System.out.println(count);
		System.out.println(counts);
		System.out.println(sum);
	
	}
}	