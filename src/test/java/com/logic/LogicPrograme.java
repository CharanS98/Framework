package com.logic;

public class LogicPrograme {

	public static void main(String[] args) {

		int a = 12100000;
		int temp = a;
		int r = 0;
		int count = 0;
		int sum = 0;
		while (a > 0) {
			int b = a / 10;
			int c = a % 10;
			r = c +(r*10);
			a = b;
			count++;
			sum = sum + c;

		}
		if (temp == r) {
			System.out.println("polindrome");

		} else {
			System.out.println("non polindrome");

		}

		System.out.println(r);
		System.out.println(count);
		System.out.println(sum);

	}
}
