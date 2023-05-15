package j0515;

import java.util.Scanner;

public class C0515_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 5,5배열
		String[][] box = new String[5][5];
		
		//1차원배열에 숫자넣기
//		intp[] num = {1,2,3,4,5,6,7,~,25)
		
		//1-25번 순차적으로 번호넣기
		int[] num = new int[25];
		for(int i=0;i<num.length;i++) {
			num[i] = i+1; //num[0] = 1, num[1]=2, ...num[24]=25
		}
		//배열 섞기
		int temp=0, random = 0;
		for(int i=0;i<100;i++) {
			random = (int)(Math.random()*25);
			temp = num[0];
			num[0] = num[random];
			num[random] = temp;
		}
		
		//2차원 배열에 숫자넣기
		for(int i=0;i<box.length;i++) {
			for(int j=0;j<box[i].length;j++) {
				box[i][j] = ""+num[5*i+j]; //String타입 = ""+int;
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
			int input = scan.nextInt(); //12
			//해당값을 찾기
			loop:for(int i=0;i<5;i++) {
				for(int j=0;j<5;j++) {
					if(box[i][j].equals(input+"")) {
						box[i][j] = "X";
						break loop;
					}
				}
			}
			
			
			
			
			
			//좌표입력
//			System.out.println("X좌표를 입력하세요.>>(0-4까지 번호)");
//			int no1 = scan.nextInt();
//			System.out.println("Y좌표를 입력하세요.>>(0-4까지 번호)");
//			int no2 = scan.nextInt();
//			
//			box[no1][no2] = "X";
		}//while
		
		
		
		
		
	}//main

}//class
