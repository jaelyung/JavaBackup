package com.human.ex;

public class JavaClass8 {

	public static void main(String[] args) {
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.print("����� �̸��� �����Դϱ�? \t ");
		String str1 = sc.nextLine();
		System.out.print("����� ���̴� ����Դϱ�? \t ");
		String str2 = sc.nextLine();
		System.out.print("����� Ű�� ���Դϱ�? \t ");
		String str3 = sc.nextLine();
		System.out.print("����� �����Դ� ���Դϱ�? \t ");
		String str4 = sc.nextLine();
		System.out.println("����� �̸��� "+str1+"�̰�, ���̴� "+str2+", Ű�� "+str3+", �����Դ� "+str4+" �Դϴ�.");
		
		
		sc.close();

	}

}
