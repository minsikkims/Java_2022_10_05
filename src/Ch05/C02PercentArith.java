package Ch05;

import java.util.Random;
import java.util.Scanner;

public class C02PercentArith {

	public static void main(String[] args) throws InterruptedException {

		// %연산자

		// 01 홀수/짝수

		// Scanner 객체 생성 후
		// 정수를 num1 에 저장 다음
		// 짝홀수 확인하세요.

//		Scanner sc = new Scanner(System.in);
//		int num1 = sc.nextInt();
//		String result = (num1%2==0)?"짝수입니다": "홀수입니다"; //% : 나머지 연산자
//		System.out.println("결과 : "+result);
//		

		// 02 배수 구하기

//		Scanner sc = new Scanner(System.in);
//		int a, b, c, sum;
//		a = sc.nextInt();
//		b = sc.nextInt();
//		c = sc.nextInt();
//		sum = a + b + c;
//		String result = (sum%5 == 0) ? "5의배수입니다" : "5의배수가 아닙니다.";
//		System.out.println("결과 : " + result);

		// 03 수의범위

		// 난수생성
		// 01Random rnd = new Random();

		/*
		 * Random rnd = new Random(); while (true) { System.out.println(rnd
		 * nextline(5)); // N%5과 동일 (0~4) Thread.sleep(500); }
		 */
		/*
		 * //02 math.random(); // while (true) { // System.out.println(
		 * (int)(Math.random()*100)%16); // Thread.sleep(500);
		 * 
		 * }
		 */

//		Scanner sc = new Scanner(System.in);
//		int num3 = sc.nextInt();
//		String result = (num3 % 3 == 0) ? "0~2사이의 범위입니다" : "0~2사이의 범위가 아닙니다."; // 수%3 = 0 ~ 2
//		System.out.println("결과는 : " + result);

//		Scanner sc = new Scanner(System.in);
//		int num4 = sc.nextInt();
//		String result = (num4 % 4 == 0)?"0~3사이의 범위입니다." : "0~3사이의 범위가 아닙니다.";// 수%4 = 0 ~ 3
//		System.out.println("결과는 : "+result);	
//		
//		Scanner sc = new Scanner(System.in);// 수%100 = 0 ~99
//		int num5 = sc.nextInt();
//		String result = (num5 % 100 == 0) ? "0~99사이의 범위입니다." : "0~99사이의 범위가 아닙니다.";
//		System.out.println("결과는 : " + result);

		// 04 끝자리수

//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		String result = (num % 10 == 0)? "오른쪽 끝 1자리" : "숫자가없습니다.";
//		System.out.println("결과 : "+result);

//		
//
//		System.out.println("오른쪽 끝 1자리 : " + (num % 10));
//		System.out.println("오른쪽 끝 2자리 : " + (num % 100));
//		System.out.println("오른쪽 끝 3자리 : " + (num % 1000));
//		System.out.println("오른쪽 끝 4자리 : " + (num % 10000));
//		System.out.println();
//		System.out.println("왼쪽 끝 1자리 : " + (num / 10000));
//		System.out.println("왼쪽 끝 2자리 : " + (num / 1000));
//		System.out.println("왼쪽 끝 3자리 : " + (num / 100));
//		System.out.println("왼쪽 끝 4자리 : " + (num / 10));

	    //정수 하나를 입력받아 거꾸로 저장해보세요.(반복문법 이후 풀어보기) %,/연산 동시에 이용할 것
		//예
		//입력 : 1234
		//저장
		//int reverse = 4321;
		//출력 : 4321
		//Hint : int num = 1234; 
	}

}
