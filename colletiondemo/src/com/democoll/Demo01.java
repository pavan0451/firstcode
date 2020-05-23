package com.democoll;

import java.util.ArrayList;

public class Demo01 {
public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("pa");
		al.add("va");
		al.add("n");
		al.add("kumar");
	String[] s= new String[al.size()];
		al.toArray(s);
		for(String s1:s) {
System.out.println("convert ");
		
		System.out.println(al);
		}
		
}

}