package com.exam.practice;

import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PreIncrementProgram {
	public static void main(String[] args) {
		int a=1,b=2,c=3;
		a= ++a + b++ + --c;
		System.out.println(a+","+b+","+c);
		Path p3 = Paths.get("./src/main/resources/output.txt");

		System.out.println(p3);
		readResponse();
		
		
	}
	
	
	protected static void readResponse()  {
	    StringBuilder responseStringBuilder = new StringBuilder();
	    System.out.println(responseStringBuilder.toString());
	    ByteBuffer rawResponsePart = ByteBuffer.allocate(32);
	    int read=0;
	    
	      String rawResponsePartString = new String(rawResponsePart.array(), StandardCharsets.US_ASCII);
	      rawResponsePartString = rawResponsePartString.substring(0, read);
	      responseStringBuilder.append(rawResponsePartString);
	      rawResponsePart = ByteBuffer.allocate(32);
	}   
	    
}
