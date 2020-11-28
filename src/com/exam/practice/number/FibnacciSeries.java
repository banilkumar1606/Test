package com.exam.practice.number;

import java.util.HashMap;
import java.util.Map;

public class FibnacciSeries {
	static Map<Integer, Integer> hashMap = new HashMap<>();

	public static void main(String[] args) {
		// input
		int num = 5;
		System.out.println("Fibnumacci series upto " + num);
		for (int i = 1; i <= num; i++)
			// System.out.print(findFibanumacci(i) + " ");//Iterative call
			// System.out.print(findFibanumacci2(i) + " ");//Recurssive call
			System.out.print(findFib(i) + " ");// Improved with cache call
	}

	// iterative method
	private static int findFibanumacci(int num) {
		int fib1 = 1, fib2 = 1, fib = 1;
		if (num == 1 || num == 2)
			return fib;
		for (int i = 3; i <= num; i++) {
			fib = fib1 + fib2;
			fib1 = fib2;
			fib2 = fib;
		}
		return fib;
	}

	// Recurrsive method
	private static int findFibanumacci2(int num) {
		int fib = 1;
		if (num == 1 || num == 2)
			return fib;
		return findFibanumacci2(num - 1) + findFibanumacci2(num - 2);

	}

	// Improved Result using inbuild cache
	private static int findFib(int num) {
		Integer fibonacci = hashMap.get(num);
		if (fibonacci != null)
			return fibonacci;
		fibonacci = findFibanumacci(num);
		hashMap.put(num, fibonacci);
		return fibonacci;
	}
}
/*
 * Output: 
	Fibnumacci series upto 5
	1 1 2 3 5 
 * 
 */