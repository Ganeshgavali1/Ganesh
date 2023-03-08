package com.array;

public class B {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Length Is :" + arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(".........For Each Loop.......");
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
