package com.human.ex;
import java.util.*;
public class JavaStart008 {
	public static int[] intArrFunc(int arr[]) {
		int rArr[]=new int[2];
		rArr[0]=arr[0];
		rArr[1]=arr[1];
		rArr[0]=rArr[0]+1;
		
		return rArr;
	}
	
	
	public static void main(String[] args) {
		//배열
		//int[]arr1=new int[2];
		int[]arr1= {1,1};
		int[]arr2;
		arr2=intArrFunc(arr1);
		System.out.println(arr1[0]);//arr1의 값도 바뀌어 버림
		System.out.println(arr2[0]);
		
	}

}
