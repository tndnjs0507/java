package j0517;

import java.util.Arrays;
import java.util.Scanner;

public class C0517_08 {

	public static void main(String[] args) {
		// 3개의 숫자를 입력받아 작은 수부터 순차적으로 출력하시오.
		// calculate() 메소드를 만들어서 사용하시오.
		// 10 5 25 -> 5 10 25
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		for(int i=0;i<3;i++) {
			System.out.println("숫자를 입력하세요.");
			arr[i] = scan.nextInt();
		}
		//배열정렬
//		Arrays.sort(arr);
		
		for(int i=0;i<3;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}//main
	static void calculate(int[] arr) {
		
		int max = Math.max(Math.max(arr[0], arr[1]),arr[2]);
		int min = Math.min(Math.min(arr[0], arr[1]),arr[2]);
		int middle = (arr[0]+arr[1]+arr[2])-max-min;
		
		arr[0]=min;
		arr[1]=middle;
		arr[2]=max;
	}
}//class
		
		
		
		
		
		
		
//			Scanner in = new Scanner(System.in);
//
//			System.out.print("숫자 3개를 입력하세요.:");
//			int x1 = in.nextInt();
//			int y1 = in.nextInt();
//			int z1 = in.nextInt();
//
//			int result1, result2, result3;
//
//			if (x1 > y1 && y1 > z1) {
//				result1 = x1;
//			} else if (y1 > x1 && y1 > z1 && (y1 > z1 || z1 > y1)) {
//				result1 = y1;
//			} else {
//				result1 = z1;
//			}
//
//			if ((x1 < y1 && x1 > z1) || (x1 > y1 && x1 < z1)) {
//				result2 = x1;
//			} else if ((y1 < x1 && y1 > z1) || (y1 > x1 && y1 < z1)) {
//				result2 = y1;
//			} else {
//				result2 = z1;
//			}
//
//			if (x1 < y1 && x1 < z1 && (y1 < z1 || z1 < y1)) {
//				result3 = x1;
//			} else if (y1 < x1 && y1 < z1 && (x1 < z1 || z1 < x1)) {
//				result3 = y1;
//			} else {
//				result3 = z1;
//			}
//			System.out.printf("%d %d %d ", result3, result2, result1);
//		}
//}

