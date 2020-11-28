package com.exam.practice.number;

public class IsPrimeNumber {
	public static void main(String[] args) {
		// input 7
		int i = 23;
		if (isPrime(i))
			System.out.println(i + " is a prime number");
		else
			System.out.println(i + " is not a prime number");
	}

	private static boolean isPrime(int n) {
		if (n == 1)
			return false;
		else if (n == 2)
			return true;
		else if (n % 2 == 0)
			return false;
		for (int i = 3; i*i < n; i +=2) {
			if (n % i == 0)
				return false;
		}
		return true;

	}
}

/* output : 7 is a prime number */
