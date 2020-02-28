package com.human.ex;

import java.util.Arrays;

public class JavaStart3 {

	public static void main(String[] args) {
		//배열 같은 자료형을 여러개 선언할때 사용
		//int a1,a2,a3,a4,a5; 100개 선언하려면 일일이 다 써야하는 불편함이 있다
		//int [] arrInt= new int[5];
		//배열의 값에 접근하려면 인덱스를 사용한다.
		//arrInt[0] arrInt[1] 변수명[숫자]
		//인덱스는 0부터 시작한다.
		//new int[5];5개를 선언하고 인덱스는 0~4
		
		boolean b1=true;
		boolean b2=false;
		boolean [] bArray=new boolean[4];//0~3 bArray=>boolean자료형 여러개 bArray=>boolean자료형 1개
		bArray[0]=false;
		bArray[1]=b1;
		bArray[2]=bArray[0];
		bArray[3]=true;
		System.out.println(bArray[0]+":"+bArray[1]+":"+bArray[2]+":"+bArray[3]);
		System.out.println(java.util.Arrays.toString(bArray));//java.util.Arrays.toString->배열의 내용을 출력하고 싶을 때 사용
		
		int i1=5;
		int i2=23;
		int iArray[]=new int[4];
		iArray[0]=1;
		iArray[1]=i1;
		iArray[2]=iArray[0]+iArray[1];
		iArray[3]=iArray[2]+4;
		System.out.println(Arrays.toString(iArray));
		
		double d1=5.6;
		double d2=23.8;
		double dArray[]=new double[4];
		dArray[0]=1;
		dArray[1]=d2;
		dArray[2]=dArray[0]+dArray[1];
		dArray[3]=dArray[2]+4.4;
		System.out.println(Arrays.toString(dArray));
		
		String str1="hello1";
		String str2=new String("hello2");
		
		String []sArray=new String[4];
		sArray[0]=str1;
		sArray[1]=str2+str1;
		sArray[2]=sArray[0]+d1;
		sArray[3]=sArray[0]+"world";
		
		System.out.println(Arrays.toString(sArray));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}