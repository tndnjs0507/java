package j0518;

import java.util.Scanner;

public class C0518_03 {

	public static void main(String[] args) {
		// Scanner - 입력할때만 쓴다.
		Scanner scan = new Scanner(System.in);
		//숫자
//		int num = scan.nextInt();
//		//nextLine();
//		String str = scan.next();
//		double d = scan.nextDouble();
		
		//숫자 2개를 입력받음 
		System.out.println("첫번째 숫자를 입력하시오.");
		int num = scan.nextInt(); //1
		System.out.println("두번째 숫자를 입력하시오.");
		int num2 = scan.nextInt(); //10
		
		//if
		int temp=0;
		if(num>num2) {
			temp = num;
			num = num2;
			num2 = temp;
		}
		//1,10 -> 1부터 10까지의 합을 구하시오.
		int sum = 0;
		for(int i=num;i<=num2;i++) {
			sum = sum + i;
		}
		System.out.print("합 :"+sum);

	}

}
