package com.exam.practice.oops;

public class CallByValueAndCallByReference {
	static int x=5;
	
	public static void main(String[] args) {
		modifyPrimitive(x);
		System.out.println(x);
		A a1=new A();
		a1.setX(x);
		modifyObject(a1);
		System.out.println(a1.x);
		
		Integer i = new Integer(10); 
	    Integer j = new Integer(20); 
	    swap(i, j); 
	    System.out.println("i = " + i + ", j = " + j); 
	}
	//Call by value
	private static void modifyPrimitive(int  x) {
		x=10;
	}
	
	//Call by reference
	private static void modifyObject(A a2) {
		a2.setX(20);
	}
	//swap() doesn't swap i and j 
	public static void swap(Integer i, Integer j)  
	{ 
	   Integer temp = new Integer(i); 
	   i = j; 
	   j = temp; 
	} 
	
}


class A{
	int x;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
}
