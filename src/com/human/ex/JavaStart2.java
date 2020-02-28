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
		
		//실행결과_ b=3 break;있을때_ b=1
		
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
		String str1=String.format("hap의 값 : %d\n", hap);
		System.out.println(str1);
		//실행결과_ hap의 값:12 break;있을때_hap의 값:3
		
		//사용자로부터 몇 월인지를 정수로 입력받아서 Jan과 같은 영어단어로 출력
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.print("월번호를 입력하시오(1-12): ");
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
		//연습문제1. if문과 switch~case문에 대한 설명으로 옳지않은 것
		//3번 if문이 중첩된 경우 안쪽 if문을 벗어날 때 break를 사용한다. =>if문은 반복되지 않고 한번만 실행되기 때문에 break가 필요없다.
		
		//연습문제2.
		System.out.print("정수 입력: ");
		int n=Integer.parseInt(sc.nextLine());
		switch(n%3) {
		case 0:
			System.out.println("거짓");
			break;
		case 1:
			System.out.println("참");
			break;
		case 2:
			System.out.println("참");
			break;
		}
		
		
		//p.43
		//순서도에 맞춰서 if문 작성하기
		if(a>=10) {
			System.out.println(a);
		}else if(b!=0) {
			System.out.println(a/b);
		}
	
		//순서도에 맞춰 switch~case문 작성
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
		System.out.print("나이를 입력하세요>>");
		int age=Integer.parseInt(sc.nextLine());
		System.out.println("가슴둘레를 입력하세요>>");
		int chest=Integer.parseInt(sc.nextLine());
		if(age<20) {
			if(chest<85) {
				System.out.println("사이즈는 S입니다.");
			}else if(chest>=85&&chest<95) {
				System.out.println("사이즈는 M입니다.");
			}else if(chest>=95) {
				System.out.println("사이즈는 L입니다.");
			}
		}else if(age>=20) {
			if(chest<90) {
				System.out.println("사이즈는 S입니다.");
			}else if(chest>=90&&chest<100) {
				System.out.println("사이즈는 M입니다.");
			}else if(chest>=100) {
				System.out.println("사이즈는 L입니다.");
			}
		}
		
		//p.44
		//도전 1 계산기 프로그램
		//도전 2 장학금 계산 프로그램
		System.out.print("가정 월 수입을 입력하세요>>");
		int rich = Integer.parseInt(sc.nextLine());
		System.out.println("학점을 입력하세요>>");
		double grade = Double.parseDouble(sc.nextLine());
		int tuition = 100;
		if(rich>=100) {
			if(grade>=4.0) {
				System.out.println("다음 학기 납입할 등록금은 "+tuition*0.8+"만원입니다.");
			}else {
				System.out.println("다음 학기 납입할 등록금은 "+tuition+"만원입니다.");
			}
		}else {
			System.out.println("다음 학기 납입할 등록금은 "+tuition*0.6+"만원입니다.");
		}
		
		
		//p.45
		//전기 사용량을 입력받아 사용 요금을 출력
		int standard=0;
		double kwCharge=0.0;
		double totalCharge=0;
		
		System.out.print("전기 사용량을 입력하세요(kw) : ");
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
		
		System.out.println("이번 달 요금은 "+(totalCharge+tax)+"원입니다.");
	
		//3개의 숫자를 입력받아 큰 순으로 세개 출력하시오
		
		
		
		
		
		//p.46
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
	}

}
