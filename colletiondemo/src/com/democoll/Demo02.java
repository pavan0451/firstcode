package com.democoll;

public class Demo02 {
public static void main(String[] args) {
	 String s = "(123)-456-093<./@!7891";
	    s = s.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(s);
}
}
