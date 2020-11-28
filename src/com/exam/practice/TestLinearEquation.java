package com.exam.practice;

import java.util.HashSet;
import java.util.Set;

public class TestLinearEquation {
	// x(x+1) program
	public static void main(String[] args) {
		int x = 1;
		int y = 20;
		int count = 0;
		Set<Integer> set=new HashSet<>();
		
		for (int i = x; i <= y; i++) {
			set.add(i);
		}
		for (int j = 1; j<y; j++) {
			int sum = j*(j+1);
			if(set.contains(sum))
				count++;
		}
		System.out.println(count); 
		
		int count1 = 0;
	for (int i = x; i <= y; i++) {
		for (double j = 1; j <100; j++) {
			double l = 1 - j;
			if (l != 0) {
				if (i / l == -j) {
					count1++;
					System.out.println(i +" "+j+" "+l);
				}
			}
		}
	}
	System.out.println(count1); 
	}

}
