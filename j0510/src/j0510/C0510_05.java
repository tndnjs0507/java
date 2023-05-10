package j0510;

import java.util.Scanner;

public class C0510_05 {
	public static void main(String[] args) {
		
		//점수를 입력받아, 90점이상이면 A, 80점 이상이면 B, 70 C, 60 D, F
		// 97점 이상 A+, 93점이하 A-, 87점이상 B+, 83이하 B-
		int num = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		num = scan.nextInt();
		if (num>=90) {
			System.out.print("A");
			if(num>=97) {
				System.out.println("+");
			}else if (num<=93) {
				System.out.println("-");
			}
		}else if (num>=80) {
			System.out.print("B");
			if(num>=87) {
				System.out.println("+");
			}else if (num<=83) {
				System.out.println("-");
			}
		}else if (num>=70) {
			System.out.print("C");
			if(num>=77) {
				System.out.println("+");
			}else if (num<=73) {
				System.out.println("-");
			}
		}else if (num>=60) {
			System.out.print("D");
			if(num>=67) {
				System.out.println("+");
			}else if (num<=63) {
				System.out.println("-");
			}
		}else {
			System.out.println("F");
		}
	}
}
//		String input="";
//		char ch = ' ';
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자를 입력하세요.");
////		input = scan.next(); //문자열
//		ch = input.charAt(0); //문자열의 첫번째 문자를 가져옴.
//		if(ch=='c') { // 기본형 8개 - boolean,char,byte,short,int,long,float,double
//			System.out.println("c 입니다.");
//		}else {
//			System.out.println("c가 아닙니다.");
//		}
//	}
//}
//	public static void main(String[] args) {
//		String str = "";
//		Scanner scan = new Scanner(System.in);
//		System.out.println("문자열을 입력하세요.");
//		str = scan.next();
//		if(str.equalsIgnoreCase("c")) { //기본형이 아닌 str은 이퀄을 써야한다. IgnoreCase는 소문자로 치환한다. 
//										//기본형 8개 - boolean,char,byte,short,int,long,float,double
//			System.out.println("c 입니다.");
//		}else {
//			System.out.println("c가 아닙니다.");
//		}
//	}
//}
