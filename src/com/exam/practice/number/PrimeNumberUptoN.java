package com.exam.practice.number;

public class PrimeNumberUptoN {
	public static void main(String[] args) {
		//input
		int num=30;
		System.out.println("Prime Numbers upto "+ num);
		for(int i=1;i<=num;i++) {
			if(isPrime(i))
				System.out.print(i+" ");
		}
	}

	private static boolean isPrime(int num) {
		if (num == 1)
			return false;
		else if (num == 2)
			return true;
		else if (num % 2 == 0)
			return false;
		for (int i = 3; i <= Math.sqrt(num); i += 2) {
			if (num % i == 0)
				return false;
		}
		return true;

	}
}
