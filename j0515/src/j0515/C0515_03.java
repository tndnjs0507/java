package j0515;

import java.util.Scanner;

public class C0515_03 {

	public static void main(String[] args) {
		// 10개 중 2개의 보물을 찾기 프로그램을 구성하시오.
		// 꽝-0 1억보물-1 10억보물-2

		// box배열 10개
		Scanner scan = new Scanner(System.in);
//		int[] box = {0,0,0,0,0,0,0,0,1,2}; //번호를 맞추기 위한 배열
//		String[] arr = {"?","?","?","?","?","?","?","?","?","?"} //출력을 위한 배열
		int input = 0;// 입력받은 번호 변수
		int temp = 0;
		int random = 0;

		// arr배열 10개
		String[] arr = new String[10];
		for (int i = 0; i < 10; i++) {
			arr[i] = "?";
		}
		int[] box = new int[10];
		for (int i = 0; i < 10; i++) {
			if (i < 8) {
				box[i] = 0;
			} else if (i < 9) {
				box[i] = 1;
			} else {
				box[i] = 2;
			}
		}
		// box번호 섞기
		for (int i = 0; i < 100; i++) {
			random = (int) (Math.random() * 10); //0-9
			temp = box[0];
			box[0] = box[random];
			box[random] = temp;
		}
		// 입력 input -> input
		// while - 무한반복
		while (true) {
			// 출력
			// 상단타이틀입력
			System.out.println("[ 보물찾기 프로그램 ]");
			// 번호출력
			for (int i = 0; i < 10; i++) {
				System.out.print(i + "\t");
			}
			System.out.println();
			// 밑줄
			System.out.println("-----------------------------------------------------------------------------");
			// 정답출력
			for (int i = 0; i < 10; i++) {
				System.out.print(arr[i] + "\t");
			}
			System.out.println();
			// 번호입력
			System.out.println();
			System.out.println("번호를 입력해주세요.>>");
			input = scan.nextInt();// 번호를 받음.
			// 입력된 번호가 보물인지 비교 box 배열 0,1,2
			if (box[input] == 0) {
				arr[input] = "꽝";
			} else if (box[input] == 1) {
				arr[input] = "1억 보물";
			} else {
				arr[input] = "10억 보물";
			}
		} // while

	}// main
}// class
