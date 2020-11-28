package com.exam.practice.arrays;

import java.util.Arrays;

public class SecondlargestInArray {
	public static void main(String[] args) {
		int arr[] = {1,4,25,3,67,3};
		Arrays.sort(arr);
		int size = arr.length;
		System.out.println(arr[size-1] +"-->"+arr[size-2]);
		int first=arr[0],second=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>first) {
				second = first;
				first = arr[i];
			}
			else if(arr[i]>second) {
				second = arr[i];
			}
		}
		
		System.out.println(first +"-->"+second);
	}
}
