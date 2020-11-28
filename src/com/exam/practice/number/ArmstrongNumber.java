package com.exam.practice.number;

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		if(isArmStrongNumber(num))
			System.out.println(num+ " is a ArmStringNumber");
		else
			System.out.println(num+ " is  not a ArmStringNumber");
		
	}
	private static boolean isArmStrongNumber(int num) {
		int armStrongNum=0,temNum=num;
		while (temNum>0) {
			int reminder=temNum%10;
			armStrongNum=armStrongNum+reminder*reminder*reminder;
			temNum=temNum/10;
		}
		if(num==armStrongNum)
			return true;
		return false;
		
	}
}
/* output : 153 is a ArmStringNumber*/