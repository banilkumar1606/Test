package com.exam.practice;

import java.util.HashSet;
import java.util.Set;

public class TestZeroSumSlices {
public static void main(String[] args) {
	Set<Integer> set=new HashSet<>();
	int arr[]= {1, 4, -2, -2, 5, -4, 3};
	int sum=0, count=0;
	// Traverse through the given array 
    for (int i = 0; i < arr.length; i++) 
    {  
        // Add current element to sum 
        sum = sum+ arr[i]; 
          
        // Return true in following cases 
        // a) Current element is 0 
        // b) sum of elements from 0 to i is 0 
        // c) sum is already present in hash set 
        if (arr[i] == 0 || sum == 0 || set.contains(sum))                          
            count++;
          
        // Add sum to hash set 
        set.add(sum);
    }  
    System.out.println(count);
}
}
