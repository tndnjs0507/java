package j0508_01;

public class Class0508_06 {

	public static void main(String[] args) {
		//형변환
		// 기본형 - 8가지
		// 논리형 1바이트 - boolean
		// 문자형 2바이트 - char
		// 정수형 1바이트 - byte, 2바이트 - short, 4바이트 - int, 8바이트 - long
		// 실수형 4바이트 - float, 8바이트 - double
		// 문자열 - String

		float f = 1.6f; //소수점이 있음.
		int i = (int)f; //강제형변환 1
		System.out.println(i);
		
		int num = 10;
		double d = num;
		System.out.println(d);
		
		//String > double > float > long > int > char, byte, short
		
		char ch = 'A';
		int n = ch;
		System.out.println(n); //65 
		
		int n2 = 97;
		char ch2 = (char)n2;
		System.out.println(ch2); //a
		
		
		
	}

}
