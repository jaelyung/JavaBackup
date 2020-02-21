package com.human.ex;

public class JavaClass7 {

	public static void main(String[] args) {
		//1
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.print("학점입력 : ");
		String str1 = sc.nextLine();
		System.out.print("이름입력 : ");
		String str2 = sc.nextLine();
		System.out.println(str2+"님의 학점은 "+str1+"입니다.");
		//2
		System.out.print("키를 입력하세요(cm) : ");
		String str3 = sc.nextLine();
		int i1 = Integer.parseInt(str3);
		float f1 = i1/100f;
		System.out.println("m로 변환된 결과는 "+f1+"m 입니다.");
		//3
		System.out.print("상자의 가로, 세로, 높이를 한번에 입력 : ");		
		str1 = sc.nextLine();
		str2 = sc.nextLine();
		str3 = sc.nextLine();
		
		double dou1 = Double.parseDouble(str1);
		double dou2 = Double.parseDouble(str2);
		double dou3 = Double.parseDouble(str3);
		System.out.println("상자의 부피는 "+(dou1*dou2*dou3)+"입니다.");
		
		//4
		System.out.print("평을 입력하세요 : ");
		str3 = sc.nextLine();
		int i2 = Integer.parseInt(str3);
		double d1 = i2*3.3058;
		System.out.println(d1+"평방미터입니다.");
		//5
		System.out.print("질량: ");
		str3 = sc.nextLine();
		int i3 = Integer.parseInt(str3);
		System.out.print("속도: ");
		String str4 = sc.nextLine();
		int i4 = Integer.parseInt(str4);
		double d2 = 0.5*i3*i4*i4;
		System.out.println("운동에너지: "+d2);
		
		sc.close();

	}

}
