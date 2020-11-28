package com.exam.practice.designpatterns.abstractdesign;

public class AbstractDesignPattern {
		public static void main(String[] args) {
			Laptop delllap = LaptopFactory.getLaptop(LaptopType.DELL);
			Laptop maclap = LaptopFactory.getLaptop(LaptopType.MAC);
			Laptop hplap = LaptopFactory.getLaptop(LaptopType.HP);
			
			System.out.println(delllap.getConfiguration());
			System.out.println(maclap.getConfiguration());
			System.out.println(hplap.getConfiguration());
			
			System.out.println(delllap);
			System.out.println(maclap);
			System.out.println(hplap);
		}
}






