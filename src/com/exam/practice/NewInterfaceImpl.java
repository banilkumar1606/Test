package com.exam.practice;

class A{
	void checkJava7(){
		System.out.println("Class A");
	}
}
public class NewInterfaceImpl extends A implements NewInterface{

	@Override
	public void checkJava7() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkJava8() {
		System.out.println("Hello-NewInterfaceImpl");
	}
	public static void main(String[] args) {
		NewInterface ni= new NewInterface() {
			
			@Override
			public void checkJava7() {
				// TODO Auto-generated method stub
				
			}
		};
		ni.checkJava8();
		NewInterfaceImpl a=new NewInterfaceImpl();
		a.checkJava7();
	}

}
