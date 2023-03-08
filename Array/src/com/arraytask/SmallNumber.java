package com.arraytask;

public class SmallNumber {
	public static void main(String[] args) {
		int temp;
		int a[] = { 1, 5, 4, 7, 9, 0, 2, 3, 6 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Samllest Number Is :" + a[0]);
	}
}
