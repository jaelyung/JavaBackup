package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//1
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.print("�����Է� : ");
		String str1 = sc.nextLine();
		System.out.print("�̸��Է� : ");
		String str2 = sc.nextLine();
		System.out.println(str2+"���� ������ "+str1+"�Դϴ�.");
		//2
		System.out.print("Ű�� �Է��ϼ���(cm) : ");
		String str3 = sc.nextLine();
		int i1 = Integer.parseInt(str3);
		float f1 = i1/100f;
		System.out.println("m�� ��ȯ�� ����� "+f1+"m �Դϴ�.");
		//3
		System.out.print("������ ����, ����, ���̸� �ѹ��� �Է� : ");		
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		str3 = sc.nextLine();
		
		double dou1 = Double.parseDouble(str1);
		double dou2 = Double.parseDouble(str2);
		double dou3 = Double.parseDouble(str3);
		System.out.println("������ ���Ǵ� "+(dou1*dou2*dou3)+"�Դϴ�.");
		
		//4
		System.out.print("���� �Է��ϼ��� : ");
		str3 = sc.nextLine();
		int i2 = Integer.parseInt(str3);
		double d1 = i2*3.3058;
		System.out.println(d1+"�������Դϴ�.");
		//5
		System.out.print("����: ");
		str3 = sc.nextLine();
		int i3 = Integer.parseInt(str3);
		System.out.print("�ӵ�: ");
		String str4 = sc.nextLine();
		int i4 = Integer.parseInt(str4);
		double d2 = 0.5*i3*i4*i4;
		System.out.println("�������: "+d2);
		
		sc.close();

	}

}
