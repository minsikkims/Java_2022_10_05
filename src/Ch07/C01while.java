package Ch07;

import java.util.Scanner;

public class C01while {

	public static void main(String[] args) {

		// 탈출 요건
		// 1반복 변수
		// 2조건식
		// 3탈출연산
//		int i=0; //1 탈출 변수
//		while (i<10)// 2 탈출 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++; //3 탈출 연산식
//		}
		// 1부터 10까지 합
//		int i=1; //1 탈출 변수
//		int sum=0; //누적 합 저장 변수 
//		while (i<=10)// 2 탈출 조건식
//		{
//			System.out.println("i :"+i);
//			sum=sum+i;  //sum+=i;
//		i++; //3 탈출 연산식
//		}
////		System.out.println("종료 후 i:"+i);
//		System.out.println("1 부터 10까지 합 : "+sum);

		// 문제
		// 1부터 입력한 정수(N)까지 합 구하기
//		Scanner sc = new Scanner(System.in);
//		int num;
//		int sum=0;
//		num = sc.nextInt();
//		int i=1;
//		while (i<=num) {
//			
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("1부터 입력한 정수까지의 합은 : "+sum);

		// 문제
		// N.M을 입력받아서 N부터 M까지의 합 구하기(N<M)
//		Scanner sc = new Scanner(System.in);
//		int n, m;
//		System.out.println("첫번째 숫자를 입력하세요.:");
//		n  = sc.nextInt();
//		System.out.println("두번째 숫자를 입력하세요.:");
//		m  = sc.nextInt();
//		if(n>m) {
//			int tmp=n;
//			n=m;
//			m=tmp;
//		}
//		//초기값 =n;
//		int i = n;	
//		int sum=0;
//		while(i<=m) {
//			sum=sum+i;
//			i++;
//		}
//		System.out.println("첫번째 숫자와 두번째 숫자의 합은 : "+sum);

		// 문제
		// 구구단 2단 출력
//		int n = 2;
//		int i = 1;
//		int mul = 0;
//		while (i <= 9) {
//			mul = n * i;
//			System.out.println(n + "*" + i + "=" + mul);
//			i++;
//
//		}
		// 구구단 2단역순
//		int n = 2;
//		int i = 9;
//		int mul = 0;
//		while (i >=1) {
//			mul = n * i;
//			System.out.println(n + "*" + i + "=" + mul);
//			i--;
//
//		}

		// 문제
		// 구구단 n단 출력(입력받기)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("원하는 구구단 단수를 입력하세요: ");
//		int n=sc.nextInt();
//		int i = 1;
//		int mul = 0;
//		while (i <= 9) {
//			mul = n * i;
//			System.out.println(n + "*" + i + "=" + mul);
//			i++;
//
//		}

		// 문제
		// 프로그램 사용자로부터 양의 정수를 하나 입력 받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램을 작성
		// ex. 5를 입력 받았다면, 3 ,6 ,9, 12, 15 를 출력

//		Scanner sc = new Scanner(System.in);
//		int n;
//		int m=3;
//		int i=1;
//		int mul;
//		System.out.println("정수를 입력하세요 : ");
//		n = sc.nextInt();
//		while(i<=n) {
//			mul=i*m;
//			System.out.println(mul);
//			i++;
//		}

		// 문제
		// 1부터 100까지 수중에 3의 배수는 제외한 합을 구해서 출력해보세요
//		int i=1;
//		int sum=0;
//		while(i<=100) {
//			if(i%3!=0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);

		// 문제
//		1부터 100까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력
//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		int evensum=0;
//		int oddsum=0;
//		while(i<=100) {
//			if(i%2==0) {
//				//System.out.println("짝수 i = "+ i);
//				evensum+=i;  //evensum = evensum + i;
//			}else {
//				//System.out.println("홀수 i = "+i);
//				oddsum+=i;
//			}
//			i++;
//		}
//		System.out.println("짝수 합 : "+evensum);
//		System.out.println("홀수 합 : "+oddsum);

		// 문제
		// 1부터 N까지 수중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int i = 1;
//		int evensum=0;
//		int oddsum=0;
//		while(i<=n) {
//			if(i%2==0) {
//				evensum+=i;
//			}else {
//				oddsum+=i;
//			}
//			i++;
//		}
//		System.out.println("짝수 합 :"+evensum);
//		System.out.println("홀수 합 : "+oddsum);
		
		//문제 
		//1부터 100까지 수중에 3의 배수는 제외한 합을 구해서 출력해보세요.
//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		int sum=0;
//		while(i<=100) {
//			if(i%3!=0) {
//				sum+=i;
//			}
//			i++;
//		}
//		System.out.println(sum);

		// 문제
		// 문자열을 입력받아서 각문자를 거꾸로 출력해봅시다(같이 풉니다)
		// 입력 : apple
		// 출력 : elppa
		
//		Scanner sc = new Scanner(System.in);
//		
//		String str1 = sc.nextLine();
//			String reverse="";
//			int len = str1.length()-1;
//			System.out.println("길이 : " +len);
//			while(len>=0) {
//				//System.out.print(str1.charAt(len));  //O
//				reverse+=str1.charAt(len);
//			len--;	
//		}
//			System.out.println(reverse);

	}
}
