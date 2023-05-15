package j0515;

import java.util.Scanner;

public class C0515_08 {

	public static void main(String[] args) {
		// 5,5배열을 만들어서 해당번호를 X표시하는 프로그램을 구현하시오.
		Scanner scan = new Scanner(System.in);
		int random = 0;
		// 5,5배열
		String[][] box = new String[5][5];
		//1-25번 순차적으로 번호넣기
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i]= i+1;
		}
		
		//배열 섞기
		int temp = 0;
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0]=num[random];
			num[random]=temp;
		}
		//2차원 배열에 숫자넣기
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box.length;j++) {
				box[i][j]=""+num[5*i+j];
			}
		}
		while(true) {
			//상단번호 출력
			System.out.print(" |"+"\t");
			for(int i=0;i<5;i++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			System.out.println("--------------------------------------------");
			//화면출력
			for(int i=0;i<box.length;i++) {
				System.out.print(i+"|\t");
				for(int j=0;j<box[i].length;j++) {
					System.out.print(box[i][j]+"\t");
				}
				System.out.println();
			}
			//1-25까지 번호입력
			System.out.println("1-25까지 번호를 입력하세요.>>");
			int input = scan.nextInt();
			//해당값을 찾기
			loop:for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(box[i][j].equals(input+"")) {
						box[i][j] = "X";
						break loop;
					}
				}
			}
		}
	}
}