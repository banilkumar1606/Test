package com.exam.practice.arrays;

import java.util.HashSet;
import java.util.Set;

public class ArrayDuplicationPairsTest {

	public static void main(String[] args) {
		//input array
		int arr[]= {1,1,2,1,5,8,5,3,9};
		//Sample output is : 2
		int x=10;
		Set<Integer> arrSet=new HashSet<>();
		int countPairs=0;

		for(int i=0;i<arr.length;i++) {
			if(arrSet.contains(arr[i])) {
				arrSet.remove(arr[i]);
				countPairs++;
			}
			else
				arrSet.add(arr[i]);
		}
	
		System.out.println("CountOfduplicatePairs: "+ countPairs);

	}

}
