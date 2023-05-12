package j0512;
import java.util.Scanner;
public class C0512_09 {
	public static void main(String[] args) {
		// 이름 국어, 영어, 수학, 합계
		Scanner scan = new Scanner(System.in);
		// 국어, 영어, 수학, 합계
		String[] title = {"이름", "국어", "영어", "수학", "합계", "평균"};
		int stu_num = 3 ;
		String[] name = new String[stu_num];
		double[] avg = new double[stu_num];
		int[][] score = new int[stu_num][4]; // 3명의 국어, 영어, 수학, 합계, 평균
		// 점수입력
		for(int i=0; i<score.length; i++) {
			System.out.println((i+1)+"번째 :");
			System.out.println("이름을 입력하세요.");
				name[i] = scan.next();
			// 이름 입력 받으면 됨.
			
			int total = 0;
			for(int j=0; j<score[i].length-1; j++) {
				System.out.println(title[j+1] + " 점수를 입력하세요.");
				score[i][j] = scan.nextInt();
				total += score[i][j];
			}
			// 합계, 평균
			score[i][score[i].length-1] = total;
			avg[i] = score[i][3] / 3.0;
		}
		// 점수출력
		for(int i=0; i<title.length; i++) { // 타이틀 설정
			System.out.printf("%s\t",title[i]);
		}
		System.out.println();
		System.out.println("-".repeat(48));
		for(int i=0; i<score.length; i++) { // 행값 입력
			// 이름 출력
			System.out.print(name[i]+"\t");
			for(int j=0; j<score[i].length; j++) { // 열값 입력
				System.out.print(score[i][j]+"\t");
			}
		System.out.printf("%.2f",avg[i]);
		System.out.println();
		}//for
	}
}