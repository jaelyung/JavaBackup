package com.human.ex;

import java.util.*;
public class JavaStart16 {
	
	public static void main(String[] args) {
		
		int i=0;
		{
			int i1=0;
		}
		if(true) {
			int i2=10;
		}
		for(int j=0;j<11;j++) {
			int i3=10;
			i++;
			//i1++;
			//i2++;
			//중괄호 안에있는 변수들은 사라져서 실행이 안됨.
		}
	}
}
