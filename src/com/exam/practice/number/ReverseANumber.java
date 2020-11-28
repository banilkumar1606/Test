package com.exam.practice.number;

public class ReverseANumber {
	static int revNum = 0, base_Pos = 1;

	public static void main(String[] args) {
		// input
		int num = -2001;
		int revNum = reverseNum2(num);
		System.out.println("Reverse Number is :" + revNum);
	}

	// Method---> Interative
	private static int reverseNum1(int num) {
		int revNum = 0, reminder, tempNum = num;
		if (num < 0) {
			tempNum = -(num);
		}
		while (tempNum > 0) {
			reminder = tempNum % 10;
			revNum = revNum * 10 + reminder;
			tempNum = tempNum / 10;
		}

		return num < 0 ? -revNum : revNum;

	}

	// Method-Recurrsive
	private static int reverseNum2(int num) {
		int tempNum = num;
		if (num < 0) {
			tempNum = -(num);
		}
		if (tempNum > 0) {
			reverseNum2(tempNum / 10);
			revNum = revNum + tempNum % 10 * base_Pos;
			base_Pos = base_Pos * 10;
		}
		return num < 0 ? -revNum : revNum;
	}
}

/*
 * Reverse a number
 * 
 * 123%10=3 0*10+3=3 3*10+2=32 32*10+1=321
 * 
 */