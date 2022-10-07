package Ch05;

public class C02PercentArith {

	public static void main(String[] args) {
		
		// %연산자
		
		// 01 홀수/짝수
		
		//Scanner 객체 생성 후
		//정수를 num1 에 저장 다음
		//짝홀수 확인하세요.
		
		int num1=11;
		
		String result = (num1%2==0)?"짝수입니다": "홀수입니다"; //% : 나머지 연산자
		System.out.println("결과 : "+result);
		
		
		// 02 배수 구하기
		
		/*
		int num1=12;
		
		if(num1%3==0)
			System.out.println("3의배수입니다");
		else
			System.out.println("3의배수가 아닙니니다");
		*/
		
		
		// 03 수의범위
		/*
			수%3 = 0 ~ 2
			수%4 = 0 ~ 3
			수%100 = 0 ~99
		*/
		
	
		// 04 끝자리수
		
		/*
		int num = 56789;
		
		System.out.println("오른쪽 끝 1자리 : "+(num%10));
		System.out.println("오른쪽 끝 2자리 : "+(num%100));
		System.out.println("오른쪽 끝 3자리 : "+(num%1000));
		System.out.println("오른쪽 끝 4자리 : "+(num%10000));
		System.out.println();
		System.out.println("왼쪽 끝 1자리 : "+(num/10000));
		System.out.println("왼쪽 끝 2자리 : "+(num/1000));
		System.out.println("왼쪽 끝 3자리 : "+(num/100));
		System.out.println("왼쪽 끝 4자리 : "+(num/10));
		*/
		
		

	}

}
