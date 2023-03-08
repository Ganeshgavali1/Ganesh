package com.arraytask;

public class LargeNumber {
	public static void main(String[] args) {
		int temp;

		int a[] = { 6, 5, 4, 1, 5, 6, 7, 8, 9 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}

		}
		System.out.println("largest Number Is :" + a[0]);
	}
}