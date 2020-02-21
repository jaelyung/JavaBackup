package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.print("당신의 이름은 무엇입니까? \t ");
		String str1 = sc.nextLine();
		System.out.print("당신의 나이는 몇살입니까? \t ");
		String str2 = sc.nextLine();
		System.out.print("당신의 키는 얼마입니까? \t ");
		String str3 = sc.nextLine();
		System.out.print("당신의 몸무게는 얼마입니까? \t ");
		String str4 = sc.nextLine();
		System.out.println("당신의 이름은 "+str1+"이고, 나이는 "+str2+", 키는 "+str3+", 몸무게는 "+str4+" 입니다.");
		
		
		sc.close();

	}

}
