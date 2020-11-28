package com.exam.practice;

public interface NewInterface {
	default void checkJava8() {
		System.out.println("Hai");
	}
	void checkJava7();
}
