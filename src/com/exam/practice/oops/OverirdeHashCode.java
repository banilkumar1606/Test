package com.exam.practice.oops;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;

public class OverirdeHashCode {
	private int x;
	private String str;
	
	public static void main(String[] args) {
		OverirdeHashCode obj1=new OverirdeHashCode(5,"Anil");
		OverirdeHashCode obj2=new OverirdeHashCode(5, "Anil");
	
		ArrayList<String> arrList=new ArrayList<>();
		arrList.add("Anil");
		arrList.add("Anil");
		System.out.println("ArrayList size:"+arrList.size());
		int oldCapacity=10;
		int newCapacity = oldCapacity + (oldCapacity >> 1);
		System.out.println(newCapacity);
		
		HashSet<String> hashSet=new HashSet<>();
		hashSet.add("Anil");
		hashSet.add("Anil");
		
		System.out.println("HashSet size:"+hashSet.size());
		
		Map<String, Integer> hashMap=new HashMap<>();
		hashMap.put("Anil",1);
		hashMap.put("Anil",2);
		
		System.out.println("HashMap size:"+hashMap.size());
		
		Map<String, Integer> treeMap=new TreeMap<>();
		hashMap.put("Anil",1);
		hashMap.put("Anil",2);
		
		System.out.println("TreeMap size:"+hashMap.size());
		
		System.out.println("hashCode for obj1 "+obj1.hashCode());
		System.out.println("hashCode for obj2 "+obj2.hashCode());
		
		System.out.println("equals for obj1 and obj2 "+obj2.equals(obj1));
		
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x=x;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str=str;
	}
	public OverirdeHashCode(int x, String str) {
		this.x=x;
		this.str=str;
	}
	
	public int hashCode() {
		int hash=31*x;
		hash=hash+str.hashCode();
		return hash;
	}
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
