package com.exam.practice.number;

public class IsCompositeNumber {
	public static void main(String[] args) {
		// Input
		int i = 7;
		if (isCompositeNum(i))
			System.out.println(i + " is a Composite Number");
		else
			System.out.println(i + " is not a Composite Number");
	}

	private static boolean isCompositeNum(int n) {
		if (n == 1 || n == 2 || n == 3)
			return false;
		else if (n % 2 == 0)
			return true;
		for (int i = 5; i < Math.sqrt(n); i += 2) {
			if (n % i == 0)
				return true;
		}
		return false;
	}
}
/*
 * Output: 4 is a Composite Number
 */
