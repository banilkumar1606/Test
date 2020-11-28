package com.exam.practice;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowmaximum {
	public static void main(String[] args) {
		
		
		//Method 1--> 
		int arr[]= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int k=3;
		for(int i=0;i<arr.length-k;i++) {
			int max=arr[i];
			for(int j=1;j<k;j++) {
				if(arr[i+j]>max)
					max=arr[i+j];
				
			}
			System.out.println(max);
			
		}
		//Method 2
		
		Deque<Integer> qi = new LinkedList<Integer>(); 
		for(int i=0;i<k;i++) {
			
		}
			
		
	}
}
