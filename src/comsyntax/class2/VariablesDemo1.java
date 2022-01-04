package com.syntax.class2;

public class VariablesDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Class 2 ");
		System.out.println("First task");
		byte smallContainer=-128;
		byte smallBox=127;
		System.out.println(smallContainer);
		System.out.println(smallBox);
		double boxWithDecimalPlaces=12.5;
		System.out.println(boxWithDecimalPlaces);
		char keyBoardSymbols='%';
		System.out.println(keyBoardSymbols);
		
		boolean trueFalseBox=false;
		System.out.println(trueFalseBox);
		boolean doYouGuysNeedABreak=true;
		System.out.println(doYouGuysNeedABreak);
		
		String name="Alan";
		String address="12345 Birch St.";
		String phone="(203)555-5555";
		System.out.println(name);
		//If you use + in a println, you can add multiple variables to the same system outline. 
		System.out.println(name+" "+address);
		//You cannot use reserved words for variable names. Examples include: System, class, byte, public, void, etc.
		
	}

}
