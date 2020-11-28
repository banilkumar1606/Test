package com.exam.practice.oops;


public class OverloadExample {
	public static void main(String[] args) {
		method1(null);
	}
	private static void method2(String s) {
		System.out.println("Inside String method");
	}
	private static void method2(StringBuffer s) {
		System.out.println("Inside String method");
	}
	private static void method1(Object o) {
		System.out.println("Inside Object method");
	}
	
	
}
//Output is : Inside Object method