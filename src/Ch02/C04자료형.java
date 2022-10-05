package Ch02;

public class C04자료형 {

	public static void main(String[] args) {
		//----------------------------------
		//정수
		//----------------------------------
		//int : 4byte 정수, 기본자료형
		
//		int n1 = 0b10101101; //2진수
//		int n2 = 173;        //10진수
//		int n3 = 0255;       //8진수
//		int n4 = 0xad;       //16진수
//		System.out.printf("%d %d %d %d\n", n1, n2, n3, n4);
		
		//byte : 1byte 정수, 부호 o
		
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		byte n5 = (byte)128; //ERROR... 이유는? (강제형변환)
//		
//		System.out.printf("%d\n",n5);
		
		
		//short vs char 비교
		//char : 2byte 정수 부호 x, 단일문자 저장용으로 주로 사용
		//short : 2byte 정수 부호 o
		
//		char n1 = 60000;  //0~ (2^16-1) / 0 ~ 65536
//		short n2 = 32767; //short의 최대 저장값/ -32768 ~ 32767
//		
//		char n3 = 60000;
//		short n4 = (short)n3;  
//		System.out.println(n4);
//		System.out.println(n3);
		
		// long : 8byte 정수
		
		long n1 = 10;			//리터럴 접미사 x-> 기본자료형 (int)
		long n2 = 20L;			//리터럴 접미사 L,l : long 자료형
		
		//long n3 = 10000000000;  //error
		long n4 = 10000000000L;
		
		//----------------------------------
		//실수
		//----------------------------------
		//float : 4byte 실수
		//double : 8byte 실수(기본값)
		
		
				


	}

}
