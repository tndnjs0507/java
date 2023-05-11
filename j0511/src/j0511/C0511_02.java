package j0511;
import java.util.Scanner;
public class C0510_02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input = 0, num1 = 0, num2 = 0;
		
		while(true) {
			System.out.println("[ 사칙연산 프로그램 ]");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("0. 종료");
			System.out.println("원하는 번호를 입력하세요.>>");
			input = scan.nextInt(); // 원하는 번호 입력 받음.
			
			if(input==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 숫자를 입력
			System.out.println("첫 번째 숫자를 입력하세요.");
			num1 = scan.nextInt();
			System.out.println("두 번째 숫자를 입력하세요.");
			num2 = scan.nextInt();
			
			// 조건문
			switch(input) {
			case 1:
				System.out.println("더하기 결과값 : "+(num1+num2));
				break;
			case 2:
				num2 = scan.nextInt();
				System.out.println("빼기 결과값 : "+(num1-num2));
				break;
			case 3:
				System.out.println("곱하기 결과값 : "+(num1*num2));
				break;
			case 4:
				System.out.println("나누기 결과값 : "+(num1/num2));
				break;
			}
		}
	}
}
		// 무한반복
//		for(;;) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if(num == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break;
//			}
//		}
		
		// 무한반복
//		while(true) {
//			System.out.println("숫자를 입력하세요.");
//			int num = scan.nextInt();
//			if(num == 0) {
//				System.out.println("프로그램을 종료합니다.");
//				break; // 반복문 종료는 break
//			}
//		}
//		int i = 10;
////		while(i<0) {
////		System.out.println("i의 값 : "+i);
////		}
//		
//		do {
//			System.out.println("i의 값 : "+ i);
//		}while(i<0);