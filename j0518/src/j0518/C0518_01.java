package j0518;

import java.util.Scanner;

public class C0518_01 {

	public static void main(String[] args) {
		// 5! = 5 * 4 * 3 * 2 * 1;
		// for문으로 해보세요.
		// 숫자를 입력받아 해당되는 팩토리얼을 구현하시오.
		Scanner scan = new Scanner(System.in);
		int input =0;
		int num = 1;
		System.out.println("팩토리얼에 사용하는 숫자를 입력해 주세요.");
		input = scan.nextInt();
		for(int i=input;i>0;i--) {
			num = num*i;
		System.out.println("num : "+num);
		} 
		System.out.printf("결과값 : %,d \n",num);
		
		
//		int num=1;
//		for(int i=5;i>0;i--) {
//			num = num*i; // 5
//			System.out.println("num : "+num);
//		}
//			System.out.println("결과값 : "+num);
		//1. 1-10까지 합을 구하시오. 55
//		int sum = 0; 
//		for(int i=1;i<=10;i++) {
//			sum = sum + i; 
//		}
//		System.out.println("1-10까지 합 : " + sum);
//		
		//2. 1-100까지 합을 구하시오. 5050
//		sum = 0; 
//		for(int i=1;i<=100;i++) {
//			sum = sum + i; 
//		}
//		System.out.println("1-10까지 합 : " + sum);
//		//3. 1-1000까지 합을 구하시오. 500500
//		sum = 0; 
//		for(int i=1;i<=1000;i++) {
//			sum = sum + i; 
//		}
//		System.out.println("1-10까지 합 : " + sum);
//		
//		
//		
		
		
//		for(i=5;i<5;i--) {
//			multi = multi * i
//		}
//
	}

}
