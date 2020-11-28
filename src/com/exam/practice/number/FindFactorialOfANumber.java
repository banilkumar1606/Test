package com.exam.practice.number;

public class FindFactorialOfANumber {
	public static void main(String[] args) {
		// input
		long num = 0;
		System.out.println(findFactorial2(num));
	}

	// Method-Iterative
	private static long findFactorial1(long num) {
		long fact = 1;
		if (num == 1 || num == 0)
			return 1;
		for (long i = num; i > 0; i--) {
			fact = fact * i;
		}
		return fact;
	}

	// Method-Recurrsive
	private static long findFactorial2(long num) {
		if (num == 1 || num == 0)
			return 1;
		return num * findFactorial2(num - 1);
	}
}
