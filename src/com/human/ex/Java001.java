package com.human.ex;

public class Java001 {
	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int A = scanner.nextInt();
		System.out.print("�Ʒ����� �Է��Ͻÿ� : ");
		int B = scanner.nextInt();
		System.out.print("���̸� �Է��Ͻÿ� : ");
		int H = scanner.nextInt();
		double S = (double)(A+B)*H/2;
		System.out.println("��ٸ����� ���̴� "+S+"�Դϴ�.");
		//��ٸ����� ���̸� ���ϴ� �˰���
	}
}
