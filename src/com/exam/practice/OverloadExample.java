package com.exam.practice;

public class OverloadExample {

	public static void main(String[] args) {
		OverloadExample obj= new OverloadExample();
		obj.watchVideo(new Integer(1));
	}
	private void watchVideo(String user) {
		System.out.println(user);
	}
	private void watchVideo(Integer num) {
		System.out.println(num);
	}

}
