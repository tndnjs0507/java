package j0512;

import java.util.Scanner;

public class C0512_08 {

	public static void main(String[] args) {
		// 국어,영어,수학,합계
		Scanner scan = new Scanner(System.in);
		String[] title = {"국어","영어","수학","합계"};
		int[][] score = new int[5][4]; //5명의 국어,영어,수학
		//점수입력
		for(int i=0;i<score.length;i++) {
			System.out.println((i+1)+"번째 :");
			for(int j=0;j<score[i].length-1;j++) { //합계 안받으려고 -1 :score[i].length-1 대신 3써도 됨
				System.out.println(title[j]+"점수를 입력하세요.");
				score[i][j] = scan.nextInt();
			}
			//합계
			//j값은 존재하지 않음(괄호를 넘어오면)
			score[i][3] = score[i][0]+score[i][1]+score[i][2];
		}
		//점수출력
		for(int i=0;i<title.length;i++) {
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("-------------------------------------");
		for(int i=0;i<score.length;i++) {
			for(int j=0;j<score[i].length;j++) {
				System.out.print(score[i][j]+"\t");
	}
			System.out.println();

		}//for
	}//main
}//class
