package j0512;
import java.util.Scanner;
public class C0512_05 { // 시험
	public static void main(String[] args) {
		// 10진수를 2진수로 변경하는 프로그램
		Scanner scan = new Scanner(System.in);
		//String[] binary = new String[10];
		//int[] num = new int [10];
		//            0      1    2   3    4    5     6   7   8  9
		String[] data = {"0000","0001","0010","0011","0100", "0101", "60","70","80","90"};
		int[] num =new int[5];
		//1. 숫자 입력
		for(int i =0; i<5 ;i++){
			System.out.println("10진수를 입력해라");
			num[i] =scan.nextInt();
			
		}
		//2. 2진 코드로 숫자 출력
		for(int i =0; i <5; i++) {			
			System.out.print(data[num[i]]+" "); //출력
		}
		System.out.println();
		
		//binary[0] ="0000";
				
		//System.out.println("숫자를 입력하세요 ");
		//int num =scan.nextInt();
		
		//String[] binary = {"0",
		//		           "1", "2", "3", "4", "5",
		//		           "6", "7", "8", "9"}; //총 10개의 배열이 생성되었다
		
		//5
		//binary [5]; // 5가 나옴
		
		
		//이거랑 같다
		//binary[0]
		//binary[1], binary[2], binary[3], binary[4], binary[5],
		//binary[6], binary[7], binary[8], binary[9]
		
//		int[] num = new int[4];
		
		// 1025 - 0001 0000 0010 0101
		// 1개씩 받기
//		for(int i =0 ;i<num.length ; i++) {
//			System.out.println("번호 입력하세여");
//			num[i] = scan.nextInt();
//		}
//		
//		// 10진 코드로 출력
//		System.out.println("10진 코드: " );
//		for(int i =0;i<num.length;i++) {
//			System.out.print(num[i]+" ");
//		}
//		System.out.println();
//		// 2진코드로 번호 출력
//		System.out.println("2진 코드:");
//		for(int i =0;i<num.length;i++) {
//			System.out.println(binary[num[i]]+" ");
//		}
//		System.out.println();
		//2
		//5
		//0125
		}//main
	}//class