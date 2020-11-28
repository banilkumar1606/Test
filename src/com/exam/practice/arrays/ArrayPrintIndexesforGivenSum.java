package com.exam.practice.arrays;

import java.util.HashMap;
import java.util.Map;

public class ArrayPrintIndexesforGivenSum {

	public static void main(String[] args) {
		//input Array
		int arr[]= {4,5,8,7,3,9};
		//input sum
		int x=10;
		//Expected output is: 7+3=10 so indexes are 3,4
		Map<Integer,Integer> arrMap=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			int diff=x-arr[i];
			System.out.println(diff);
			if(arrMap.containsKey(diff)) {
				System.out.println("The Sum of two numbers indexes are :"+ arrMap.get(diff)+","+i);
				break;
			}
			arrMap.put(arr[i],i);
		}		

	}

}

