package com.arraytask;

public class B {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50, 60, 70 };
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		System.out.println("Reverse Loop");
		for (int i = a.length - 1; i > 0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("......End....");
	}
}
