package j0530;

import java.util.Scanner;

public class C0530_03 {

	public static void main(String[] args) {
		// 소문자를 대문자로 출력하시오. a = 97, A = 65, Z=06, 0 = 48
		Scanner scan = new Scanner(System.in);
		
		String str = "ABCDEF";
		System.out.println(str.toLowerCase());
		String str2 = "abcdef";
		System.out.println(str2.toUpperCase());
				
//		System.out.println("영문소문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		System.out.println("입력한 문자 : "+input);
//		char output  = (char) (input-32);//char+int = int+int = int 형변환 -> char
//		System.out.println("대문자 : "+output);
		
		//소문자->대문자, 대문자->소문자출력하시오.
		//'a'<=x && 'z'=>x 'A'<=x && 'Z'=>x
//		System.out.println("영문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		if(65<=input && input<=96) {
//			System.out.println("입력한 문자 : "+input);
//			char output  = (char) (input+32);
//			System.out.println("소문자 : "+output);
//		}else {
//				System.out.println("입력한 문자 : "+input);
//				char output = (char)(input-32);
//				System.out.println("대문자 : "+output);
//		}
		
		//교수님 풀이
//		System.out.println("영문자를 입력하세요.");
//		char input = scan.next().charAt(0);
//		char output = ' ';
//		if((('a'<=input)&&('z'>=input))==true) {//소문자 입력
//			output = (char)(input-32);
//		}else if((('A'<=input)&&('Z'>=input))==true) {
//			output = (char)(input+32);
//		}
//		
//			System.out.println("입력한 문자 : "+input);
//			System.out.println("출력문자 : "+output);
			
			//들어오는 모든 문자열을 변경하시오. aBcDF -> AbCdf
			
			//for
		System.out.println("영문자를 입력하세요.");
		String input = scan.next();
		String output = "";
		char temp = ' ';
		for(int i=0;i<input.length();i++) {
			temp = input.charAt(i);
			System.out.println(temp);
			
			if((('a'<=temp)&&('z'>=temp))==true) {//소문자 입력
				output = output + (char)(temp-32);
			}else if((('A'<=temp)&&('Z'>=temp))==true) {
				output = output + (char)(temp+32);
			}
		}//for
		System.out.println("입력한 문자 : "+input);
		System.out.println("출력문자 : "+output);
			
			
			
			
	}

}
