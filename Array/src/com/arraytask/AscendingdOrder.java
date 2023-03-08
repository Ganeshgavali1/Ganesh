package com.arraytask;

public class AscendingdOrder {
	public static void main(String[] args) {
		int temp;
		int a[] = { 1, 3, 6, 4, 7, 8, 5 };
		System.out.println("Ascending order");
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

			System.out.println(a[i]);
		}
		System.out.println("Second Smallest :" + a[1]);
		System.out.println("Third Smallest :" + a[2]);
	}
}
