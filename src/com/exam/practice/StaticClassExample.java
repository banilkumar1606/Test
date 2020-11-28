package com.exam.practice;

class Test1 {
static {   
System.out.println("static a");	
}

{  
 	System.out.println("init a");	
}

Test1() {   
System.out.println("cons a");	
}
}
class B1 extends Test1 {
static {   
System.out.println("static b");	 
}

{  
 	System.out.println("init b");	
}

B1() {   
System.out.println("cons b");	
}
}

public class StaticClassExample {
	public static void main(String args[]) {
		Test1 a= new B1(); 	//	Line2
		}
}
