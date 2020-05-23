//How to Sort Arrays in Java, Arrays Sorting In Java
package com.democoll;

import java.util.Arrays;

public class Demo04 {
public static void main(String[] args) {
	String[] s= {"pavan","kuamr","apple","Zee","Zaa","Swamy","Ant","ball"};
	Arrays.sort(s);
	
	for(String ss:s) {
		System.out.println(ss);
	}
}
}
