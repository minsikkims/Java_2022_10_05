package Ch07;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args) {
		
		//전체 구구단(2단-9단) 출력하기
		
//		int dan=2;
//		int i;
//		while(dan<=9) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//				
//			}
//			System.out.println();
//			dan++;
//		}
		//전체 구구단(2단-9단) 출력하기(단만 역순으로)
		//dan=2     i=9
		//dan++     i--
		//dan<=9    i>=1
		
//		int dan=9;
//		int i;
//		while(dan>=2) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i++;
//				
//			}
//			System.out.println();
//			dan--;
//		}
		
		//전체 구구단(2단-9단) 출력하기(전체 역순출력)
//		int dan=9;
//		int i;
//		while(dan>=2) {
//			i=9;
//			while(i>=1) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		} 
		
		
		//N 부터 9단까지 전체 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 시작 단 수를 입력하세요:  ");
		int dan = sc.nextInt();
		while(dan<=9) {
			int i= 1;
			while(i<=9) {
				System.out.printf("%d x %d = %d\n",dan,i,dan*i);
				i++;
			}
			System.out.println();
			dan++;
		}
		

	}

}
