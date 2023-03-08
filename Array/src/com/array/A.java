package com.array;

import java.util.Scanner;

public class A {
	public static void main(String[] args) {
		int a[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Add Element");
		for (int i = 0; i < a.length; i++) {
			System.out.println("please enter element : index No." + i);
			a[i] = sc.nextInt();
		}
		int sum = 0;
		System.out.println("Show Elements ");
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];

			System.out.println(a[i]);
		}
		System.out.println("Sum Is :" + sum);
	}
}
