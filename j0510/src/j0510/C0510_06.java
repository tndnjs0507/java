package j0510;

import java.util.Scanner;

public class C0510_06 {

	public static void main(String[] args) {
//		int random = (int)(Math.random()*3)+1; //1,2,3
//		숫자를 입력받아 같은 값일경우 당첨 그렇지 않으면 꽝출력하시오.
		int input = 0;
		int random = (int)(Math.random()*3)+1;
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		input = scan.nextInt();
		
		if (input == random) {
			System.out.println("당첨");
		}else {
			System.out.println("꽝");
		}
		System.out.println("랜덤숫자 : "+random);
		System.out.println("입력숫자 : "+input);
	}
}
		//랜덤숫자
//		System.out.println((int)(Math.random()*10)+1);
		//랜덤 숫자
//		int random = 0;
//		random = (int)(Math.random()*5)+1; //
//		System.out.println(random);
//	}
//}
		// 1.변수선언 num1,num2,op 2.scan입력 3번 입력
		// 3. 비교(switch) 4.결과값 출력 - 더하기 결과값 : 4 
//		int num1 = 0, num2 = 0, result =0;
//		char op = ' ';
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		num1 = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		num2 = scan.nextInt();
//		System.out.println("연산자를 입력하세요.");
//		op = scan.next().charAt(0);
//		
//		switch(op) {
//		case '+' :
//			result = num1+num2;
//			break;
//		case '-' :
//			result = num1-num2;
//			break;
//		case '*' :
//			result = num1*num2;
//			break;
//		case '/' :
//			result = num1/num2;
//			break;
//		System.out.println("결과값 :"+result);
//		}
//	}
//}
//
//}
//		int num1 = 0, num2 = 0;
//		char op = ' ';
//		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		num1 = scan.nextInt();
//		System.out.println("숫자를 입력하세요.");
//		num2 = scan.nextInt();
//		System.out.println("연산자를 입력하세요.");
//		op = scan.next().charAt(0);
//		
//		switch(op) {
//		case '+' :
//			System.out.println("더하기 결과값 : "+(num1+num2));
//			break;
//		case '-' :
//			System.out.println("빼기 결과값 : "+(num1-num2));
//			break;
//		case '*' :
//			System.out.println("곱하기 결과값 :"+(num1*num2));
//			break;
//		case '/' :
//			System.out.println("나누기 결과값 :"+(num1/num2));
//			break;
//		}
//	}
//
//}
