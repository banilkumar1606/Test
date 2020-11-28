package com.exam.practice.designpatterns.builder;

public class BuilderDesignPattern{
	public static void main(String[] args) {
		Phone.Builder builder= new Phone.Builder() 
				.backpanel("back")
				.frontpanel("front")
				.processor("Intel")
				.camera("16");
		
		Phone iphone = builder.build();
		
		System.out.println(iphone);
	}
}
