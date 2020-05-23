package com.democoll;

public class Demo03 {
	public static void main(String[] args) {
		String ss="p1a2v";
        //Check whether the given character is a number of not ?
		for(int i=0;i<=ss.length();i++) {
			Boolean bb=Character.isDigit(ss.charAt(i));
			if(bb) {
				System.out.println(""+ss.charAt(i)+  " is number");
			}
			else {
				System.out.println(""+ss.charAt(i)+  "  is not number");
			}
		}
		
        //To check first character is a number or not ?
		
		  Boolean bb1 = ss.substring(0, 1).matches("[0-9]");

          if(bb1){
             System.out.println("First Character is a number..!");
          }
          else{
             System.out.println("First character is not a number..!");

		
		
	}
}}
