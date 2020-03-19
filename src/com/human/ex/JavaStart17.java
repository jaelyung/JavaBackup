package com.human.ex;

import java.util.*;
public class JavaStart17 {

	private static int add(int num1, int i) {
		int sum=num1+i;
		return sum;
	}
	public static void main(String[] args) {
		int result=0;
		int num1=10;
		result=add(num1,30);
		System.out.println(result);
		result=add(num1,40);
		System.out.println(result);
	}

	
}
