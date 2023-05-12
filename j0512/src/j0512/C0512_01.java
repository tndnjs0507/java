package j0512;

import java.util.Scanner;

public class C0512_01 {

	public static void main(String[] args) {
		//성적처리프로그램
		//1.이름 2.국어 3.영어 4.수학 합계, 평균 자동으로 들어갈 수 있도록 함
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		
		String[] name = new String[5];
		int[] kor = new int[5];
		int[] eng = new int[5];
		int[] math = new int[5];
		int[] total = new int[5];
		double[] avg = new double[5];
		
		while(true) {
			System.out.println("[성적처리프로그램]");
			System.out.println("1. 성적입력");
			System.out.println("2. 성적출력");
			System.out.println("--------------");
			System.out.println("원하는 숫자를 입력하세요.");
			input = scan.nextInt();
			
			switch(input) {
			case 1: 
				for(int i=0;i<name.length;i++) {
					System.out.println("이름을 입력하세요.");
					name[i] = scan.next();
					System.out.println("국어 점수를 입력하세요.");
					kor[i] = scan.nextInt();
					System.out.println("영어 점수를 입력하세요.");
					eng[i] = scan.nextInt();
					System.out.println("수학 점수를 입력하세요.");
					math[i] = scan.nextInt();
					total[i] = kor[i]+eng[i]+math[i];
					avg[i]= total[i]/3.0;
				} // for
				break;
			case 2:
				System.out.println("이름\t국어\t영어\t수학\t합계\t평균");
				System.out.println("-------------------------------");
				for(int i=0;i<name.length;i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n",name[i],kor[i],eng[i],math[i],total[i],avg[i]);
				}// for
			}//switch
		}//while	
	}//main
}//class