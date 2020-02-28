package com.human.ex;

public class JavaStart {

	public static void main(String[] args) {
		// 4+3 이항 연산자
		// 삼항연산자 A ? B : C;
		// if문이랑 같다. A가조건 B참 C거짓
		//int a=10;
//		if(a>0) {
//			a=1;
//		}else {
//			a=-1;
//		}
		//a=(a>0) ? 1 : -1; //변수=조건 ? 참 : 거짓;
		//System.out.println(a);
		//두 수 비교 : 삼항연산자로 바꿔보자.
		int b=7, c=8;
//		if(b>c) {
//			b=4;
//		}else {
//			b=1000;
//		}
		b=(b>c)? 4 : 1000;
			
		System.out.println(b);
		
		int num1 = 5, num2 = 7;

		int result;

		 

		result = (num1 - num2 > 0) ? num1 : num2;

		System.out.println("두 정수 중 더 큰 수는 " + result + "입니다.");


		
		
		
		
		
		
	}

}
