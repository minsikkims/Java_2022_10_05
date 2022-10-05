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
		
//		long n1 = 10;			//리터럴 접미사 x-> 기본자료형 (int)
//		long n2 = 20L;			//리터럴 접미사 L,l : long 자료형
//		
//		//long n3 = 10000000000;  //error
//		long n4 = 10000000000L;
		
		//----------------------------------
		//실수
		//----------------------------------
		//float : 4byte 실수
		//double : 8byte 실수(기본값)
		
//		float n1 = 3.14f;	//리터럴접미사 F,f : float 자료형
//		double n2 = 3.14;	//리터럴접미사x -> 기본자료형(double)
//		
//		//정밀도 확인
//		float n3 = 0.123456789123456789F;
//		double n4 = 0.123456789123456789;
//		System.out.println(n3);
//		System.out.println(n4);
//		
//		//지수형으로 표현
//		double n5 = 3e6;  //3* 10^6
//		double n6 = 2e-4; //2* 10-4
//		System.out.println(n5);
//		System.out.println(n6);
				
		//-----------------------
		//단일문자
		//-----------------------
		//char 2byte 문자 저장 자료형
		
//		char ch1 = 'A'; //01000001 -> 65
//		char ch2 = '가';
//		short ch3 = 'A';      //약 -300000~+300000
//		short ch4 = (short)'가';   //범위
//		System.out.println(ch1);
//		System.out.printf("%c\n", ch1);
//		System.out.printf("%d\n", (int)ch1);
//		System.out.println(ch4);
//		System.out.println((int)ch2);		//문자는 숫자로도 확인 가능하다
//		
//		int n1=44032;
//		System.out.printf("%d %c\n", n1, n1);	//숫자, 문자로 각각 표현
//		System.out.printf("%c\n",'\uACA2');		// /u : 유니코드 적용 서식문자

		//---------------------------
		//문자열 : String
		//---------------------------
		//String : 클래스자료형..- 객체지향 파트에서 다시 설명
        
//		String name = "홍길동";		//참조변수 name에는
//		String job = "프로그래머";		//문자열이 저장된 위치값(메모리주소)가 저장
//		name +="입니다";
//		System.out.println(name);
//		System.out.printf("%x\n",System.identityHashCode(name));
//		System.out.println(job);
		
		//------------------------------
		//boolean : 논리형(true/false 저장)
		//------------------------------
		//true(참)		: 0이 아닌 모든 값
		//false(거짓)		: 0
		boolean flag = false;
		if(flag)
		{
			System.out.println("참인경우 실행");
		}
		else
		{
			System.out.println("거짓인경우 실행");
		}
		System.out.println(flag);

	}

}
