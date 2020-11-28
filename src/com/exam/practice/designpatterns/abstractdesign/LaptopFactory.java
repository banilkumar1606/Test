package com.exam.practice.designpatterns.abstractdesign;

public class LaptopFactory {
	public static Laptop getLaptop(LaptopType type) {
		switch(type) {
		case DELL:
				return new Dell("8gb","Intel");
		case MAC:
				return new MAC("12gb","Intel", "gpu");
		case HP:
				return new HP("8gb","AMD");
		}
		return null;
		
	}
}
