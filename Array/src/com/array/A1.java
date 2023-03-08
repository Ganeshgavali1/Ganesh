package com.array;

public class A1 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			
			if(max<a[i]) {
				max=a[i];
			}
			
		}
		System.out.println("Largest Number is:"+max);
	}

}
