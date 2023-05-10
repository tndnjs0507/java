package j0510;

import java.util.Scanner;

public class C0510_09 {

	public static void main(String[] args) {
		// 10개의 숫자를 입력받아 합계를 출력하시오.
		Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 10; i++) {		            
        System.out.print("숫자를 입력하세요: ");
        int number = scan.nextInt();
        sum = sum + number;
    }
    System.out.println("합계: " + sum);
}
}
