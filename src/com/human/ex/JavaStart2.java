package com.human.ex;

public class JavaStart2 {

	public static void main(String[] args) {
		//p.40
		int a=3, b=0;
		switch(a+2) {
		case 5 :
			b=1;
			break;
		default : b+=2;
		}
		
		String str = String.format("b=%d\n", b);
		System.out.println(str);
		
		//������_ b=3 break;������_ b=1
		
		//p.41
		int count=2;
		int hap=0;
		switch(++count) {
		case 1: 
			hap = hap + count++;
			break;
		case 2: 
			hap = hap + count++;
			break;
		case 3: 
			hap = hap + count++;
			break;
		case 4: 
			hap = hap + count++;
			break;
		case 5: 
			hap = hap + count++;
			break;
		}
		String str1=String.format("hap�� �� : %d\n", hap);
		System.out.println(str1);
		//������_ hap�� ��:12 break;������_hap�� ��:3
		
		//����ڷκ��� �� �������� ������ �Է¹޾Ƽ� Jan�� ���� ����ܾ�� ���
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("����ȣ�� �Է��Ͻÿ�(1-12): ");
		int mon = Integer.parseInt(sc.nextLine());
		switch(mon) {
		case 1:
			System.out.println("Jan");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Apr");
			break;
		case 5:
			System.out.println("May");
			break;
		case 6:
			System.out.println("June");
			break;
		case 7:
			System.out.println("July");
			break;
		case 8:
			System.out.println("Aug");
			break;
		case 9:
			System.out.println("Sep");
			break;
		case 10:
			System.out.println("Oct");
			break;
		case 11:
			System.out.println("Nov");
			break;
		case 12:
			System.out.println("Dec");
			break;
		}
		
		//p.42
		//��������1. if���� switch~case���� ���� �������� �������� ��
		//3�� if���� ��ø�� ��� ���� if���� ��� �� break�� ����Ѵ�. =>if���� �ݺ����� �ʰ� �ѹ��� ����Ǳ� ������ break�� �ʿ����.
		
		//��������2.
		System.out.print("���� �Է�: ");
		int n=Integer.parseInt(sc.nextLine());
		switch(n%3) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("��");
			break;
		case 2:
			System.out.println("��");
			break;
		}
		
		
		//p.43
		//�������� ���缭 if�� �ۼ��ϱ�
		if(a>=10) {
			System.out.println(a);
		}else if(b!=0) {
			System.out.println(a/b);
		}
	
		//�������� ���� switch~case�� �ۼ�
		switch(a) {
		case 3:
			b=1;
			break;
		case 5:
			b=2;
			break;
		case 7:
			b=3;
			break;
			
		default:
			b=0;
						
		}
		System.out.print("���̸� �Է��ϼ���>>");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("�����ѷ��� �Է��ϼ���>>");
		int chest=Integer.parseInt(sc.nextLine());
		if(age<20) {
			if(chest<85) {
				System.out.println("������� S�Դϴ�.");
			}else if(chest>=85&&chest<95) {
				System.out.println("������� M�Դϴ�.");
			}else if(chest>=95) {
				System.out.println("������� L�Դϴ�.");
			}
		}else if(age>=20) {
			if(chest<90) {
				System.out.println("������� S�Դϴ�.");
			}else if(chest>=90&&chest<100) {
				System.out.println("������� M�Դϴ�.");
			}else if(chest>=100) {
				System.out.println("������� L�Դϴ�.");
			}
		}
		
		//p.44
		//���� 1 ���� ���α׷�
		//���� 2 ���б� ��� ���α׷�
		System.out.print("���� �� ������ �Է��ϼ���>>");
		int rich = Integer.parseInt(sc.nextLine());
		System.out.println("������ �Է��ϼ���>>");
		double grade = Double.parseDouble(sc.nextLine());
		int tuition = 100;
		if(rich>=100) {
			if(grade>=4.0) {
				System.out.println("���� �б� ������ ��ϱ��� "+tuition*0.8+"�����Դϴ�.");
			}else {
				System.out.println("���� �б� ������ ��ϱ��� "+tuition+"�����Դϴ�.");
			}
		}else {
			System.out.println("���� �б� ������ ��ϱ��� "+tuition*0.6+"�����Դϴ�.");
		}
		
		
		//p.45
		//���� ��뷮�� �Է¹޾� ��� ����� ���
		int standard=0;
		double kwCharge=0.0;
		double totalCharge=0;
		
		System.out.print("���� ��뷮�� �Է��ϼ���(kw) : ");
		int kw =Integer.parseInt(sc.nextLine());
		if(kw>=1&&kw<=100) {
			standard=370;
		}else if(kw>=101&&kw<=200) {
			standard=660;
		}else if(kw>=201&&kw<=300) {
			standard=1130;
		}else if(kw>=301&&kw<=400) {
			standard=2710;
		}else if(kw>=401&&kw<=500) {
			standard=5130;
		}else if(kw>500) {
			standard=9330;
		}
		
		if(kw<=100) {
			kwCharge=52.00;
		}else if(kw>=101&&kw<=200) {
			kwCharge=88.50;
		}else if(kw>=201&&kw<=300) {
			kwCharge=127.80;
		}else if(kw>=301&&kw<=400) {
			kwCharge=184.30;
		}else if(kw>=401&&kw<=500) {
			kwCharge=274.30;
		}else if(kw>500) {
			kwCharge=494.00;
		}
		
		totalCharge=standard+(kw*kwCharge);
		double tax=totalCharge*0.09;
		
		System.out.println("�̹� �� ����� "+(totalCharge+tax)+"���Դϴ�.");
	
		//3���� ���ڸ� �Է¹޾� ū ������ ���� ����Ͻÿ�
		
		
		
		
		
		//p.46
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
