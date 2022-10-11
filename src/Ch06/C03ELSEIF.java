package Ch06;

import java.util.Scanner;

public class C03ELSEIF {

	public static void main(String[] args) {

		// 90점이상 : A x >= 90
		// 80 이상 90점 미만 : B 80<=x<90
		// 70 이상 80점 미만 : C 70<=x<80

		// 국어(40점) / 영어(40점) / 수학(40점)
		// 국어<40 - 불합격
		// 영어 <40 - 불합격
		// 수학 <40 불합격
		// 평균 < 60 불합격
		// 그외 : 합격

//		Scanner sc = new Scanner(System.in);
//		int kor = sc.nextInt(), eng = sc.nextInt(), mat = sc.nextInt();
//		double avg = (double) (kor + eng + mat) / 3;
//
//		if (kor < 40) {
//			System.out.println("불합격");
//		} else if (eng < 40) //kor>=40 
//		{
//			System.out.println("불합격");
//		} else if (mat < 40) //kor>=40 && eng>=40
//		{
//			System.out.println("불합격");
//		} else if (avg < 60) //kor >=40 && eng>=40 && mat>=40 
//		{
//			System.out.println("불합격");
//		}else {
//			System.out.println("합격");
//		}
		//문제 
		
//		Scanner sc = new Scanner(System.in);
//		int score;
//		score = sc.nextInt();
//		if (score >= 90) {
//			System.out.println("A입니다.");
//		} else if (score < 90 && score >= 80) {
//			System.out.println("B입니다.");
//		} else if (score < 80 && score >= 70) {
//			System.out.println("C입니다.");
//		} else if (score < 70 && score >= 60) {
//			System.out.println("D입니다.");
//		} else {
//			System.out.println("F입니다.");
//		}
		/*
		 * 
		 * int num=85; if(num>=90) { System.out.println("A"); } else //90점 미만 {
		 * if(num>=80) //80<=x<90 { System.out.println("B"); } else //80점 미만 {
		 * if(num>=70) // 70<= x < 80 { System.out.println("C"); }
		 * 
		 * } }
		 */

		/*
		 * int num=80;
		 * 
		 * if(num>=90) { System.out.printf("A"); } else if(num>=80) {
		 * System.out.printf("B"); } else if(num>=70) { System.out.printf("C"); } else
		 * if(num>=60) { System.out.println("D"); } else {
		 * 
		 * }
		 */

		// 나이별로 요금을 부과하는 else if문을 만드세요
		// 8세 미만 : 요금은 1000원
		// 14세미만 : 요금은 2000원
		// 20세미만 : 요금은 2500원
		// 20세이상 : 요금은 3000원
//		Scanner sc = new Scanner(System.in);
//		int charge=0;
//		int age=sc.nextInt();
//		if (age<8) {
//			charge=1000;
//		}else if(age<14) {
//			charge=2000;
//		}else if(age<20) {
//			charge=2500;
//		}else {
//			charge=3000;
//		}
//		System.out.printf("나이 : %d 요금 : %d\n", age, charge);

//		int age=10;
//		
//		if(age<8)
//		{
//			
//		}
//		else if(age<14)
//		{
//			
//		}
//		else if(age<20)
//		{
//			
//		}
//		else
//		{
//			
//		}

	}

}
