package com.arraytask;

public class Average {
	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		int Average = sum / a.length;
		System.out.println("Sum is :" + sum);
		System.out.println("Average is :" + Average);
	}
}
