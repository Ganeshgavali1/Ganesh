package com.array;

public class B1 {
	public static void main(String[] args) {
		int a[] = { 2, 8, 3, 4, 1, 6, 7 };
		int max = a[0];
		for (int i = 0; i < a.length; i++) {

			if (max < a[i]) {
				max = a[i];
			}

		}
		System.out.println("max Number Is :" + max);
	}

}
