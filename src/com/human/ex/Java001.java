package com.human.ex;

public class Java001 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("윗변을 입력하시오 : ");
		int A = scanner.nextInt();
		System.out.print("아랫변을 입력하시오 : ");
		int B = scanner.nextInt();
		System.out.print("높이를 입력하시오 : ");
		int H = scanner.nextInt();
		double S = (double)(A+B)*H/2;
		System.out.println("사다리꼴의 넓이는 "+S+"입니다.");
		//사다리꼴의 넓이를 구하는 알고리즘
	}
}
