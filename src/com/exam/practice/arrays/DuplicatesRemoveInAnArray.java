package com.exam.practice.arrays;

import java.util.Arrays;

import com.exam.practice.sorting.BubbleSort;

public class DuplicatesRemoveInAnArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 3, 4 };
		int n = removeDuplicates(arr);
		System.out.println("The Result Array is:");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeDuplicates(int arr[]) {
		BubbleSort obj = new BubbleSort();
		Arrays.sort(arr);
		int j = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[arr.length - 1];

		return j;
	}
}
