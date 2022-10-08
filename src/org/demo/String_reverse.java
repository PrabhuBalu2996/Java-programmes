package org.demo;

public class String_reverse {
	public static void main(String[] args) {
		String a = "my world java";
		
		String[] b = a.split("");
		
		String c ="";
		
		for(int i=a.length()-1;i>=0;i--){
			c=c+a.charAt(i);
		}
		System.out.println(c);
	}

}
