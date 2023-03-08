package com.arraytask;

public class OddArray {
	public static void main(String[] args) {
		 System.out.println("Odd Numbers Are");
		int a[]= {1,2,3,4,5,6,7,8};
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				 System.out.print(i+",");
			}
			
		}
		
	}
}