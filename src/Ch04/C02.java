package Ch04;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
		
		System.out.println("----------------Scanner Test-------------------");
		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 :");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 :" + num1);
//		
//		System.out.print("실수 입력 :");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : "+num2);
//		
//		System.out.print("문자열 입력 :");
//		String strl = sc.next();    //문자열입력받기기능함수, 띄어쓰기는 포함하지않는다.
//		//System.out.println("입력된 문자열 :"+strl);
//		//String s1 = sc.next();
//		String s1 =sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n" , s1 , s2 , s3);
////		sc.nextLine(); //버퍼공간에 남아있는 데이터값을 초기화

		System.out.printf("수 입력 : ");
		int num = sc.nextInt();
		System.out.print("문자열 입력(띄어쓰기포함 문자열) :");
		String str2 = sc.nextLine(); //문자열입력받기기능함수, 띄어쓰기도 포함한다.
		char ch = str2.charAt(0); // \n가 ch에 저장
		int code =(int)ch;
		
		System.out.println("CODE : "+code);
		
		System.out.println("입력된 문자열 :"+ str2);
	
	}

}
