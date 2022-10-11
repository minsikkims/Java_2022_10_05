package Ch07;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		//원하는 단 출력하기
//		Scanner sc = new Scanner(System.in);
//		int i=1;
//		System.out.println("원하는 단의 출력을 입력하세요. : ");
//		int dan=sc.nextInt();
//		
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan, i,dan*i);
//				i++;
//			}
//			System.out.println();
//		
		//2~9단까지 전체출력
//		int i;
//		int dan=2;
//		while(dan<=9) {
//			i=1;
//			while(i<=9) {
//				System.out.printf("%d x %d = %d\n",dan,i,dan*i);				
//				i++;
//				
//			}
//			System.out.println();
//			dan++;
//			
//		}
		//전체 구구단(2단-9단) 출력하기(단만 역순으로)
	int i;
	int dan=9;
	while(dan>=2) {
		i=1;
		while(i<=9) {
			System.out.printf("%d x %d = %d\n",dan,i,dan*i);
			i++;
		}
		System.out.println();
		dan--;
	}

	}

}
