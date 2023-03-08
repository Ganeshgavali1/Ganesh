package com.arraytask;

public class PairAddition {
	public static void main(String[] args) {

		int x = 6;
		int sum = 0;
		int a[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("Two Numbers Whose Addition is :-> " + x);
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				sum = a[i] + a[j];
				if (sum == x) {
					System.out.print("(" + a[i] + ",");

					System.out.println(a[j] + ")");
				}
			}
		}
	}
}