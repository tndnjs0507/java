package j0515;

import java.util.Scanner;

public class C0515_09 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 성적입력
		// 2. 성적출력
		// 3. 성적수정
		// 4. 등수처리
		// 5. 학생성적검색
		// 0. 프로그램종료
		// 이름,국어,영어,수학, 합계,평균 - 10명
		// a.변수선언
		Scanner scan = new Scanner(System.in);
		String modifyName = "";
		int input = 0;
		int count = 0; // 입력된 학생수
		String[] title = { "이름", "국어", "수학", "영어", "합계", "평균" };
		String[] name = new String[2];
		int[][] score = new int[2][4]; // 성적을 한번에 묶을 예정
		// int[] kor = new int[10];
		// int[] eng = new int[10];
		// int[] math = new int[10];
		// int[] total = new int[10];
		double[] avg = new double[10];
		while (true) {
			// b.화면출력
			System.out.println("[성적처리프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.등수처리");
			System.out.println("5.학생성적검색");
			System.out.println("0.프로그램 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			input = scan.nextInt();
			if (input == 0) {
				System.out.println("[프로그램을 종료합니다.]");
				break;
			} // if
				// c.조건문
			switch (input) {
			case 1:
				// d. 성적입력
				// 반복문
				for (int i = count; i < name.length; i++) {
					System.out.println("이름을 입력하세요.(0.이전화면으로 이동)");
					name[i] = scan.next();
					if (name[i].equals("0")) {
						System.out.println("이전화면으로 이동합니다.!!");
						System.out.println();
						break;
					}
					// 국어 영어 수학 -> 합계
					for (int j = 0; j < 3; j++) {
						System.out.println(title[j + 1] + " 점수를 입력하세요");
						score[i][j] = scan.nextInt();
						score[i][3] = score[i][3] + score[i][j]; // total이 완성된다.
					}
//		               System.out.println("국어점수를 입력하세요.");
//		               kor[i] = scan.nextInt();
//		               System.out.println("영어점수를 입력하세요.");
//		               eng[i] = scan.nextInt();
//		               System.out.println("수학점수를 입력하세요.");
//		               math[i] = scan.nextInt();
//		               total[i] = kor[i]+eng[i]+math[i];
					avg[i] = score[i][3] / 3.0;
					count++;
				}
				break;
			case 2:
				// f.화면출력
				// System.out.println("이름\t국어\t영어\t수학\t합계\t평균"); //아래의 코드와 같은 의미
				for (int i = 0; i < title.length; i++) {
					System.out.print(title[i] + "\t");
				}
				System.out.println();
				System.out.println("------------------------------------------");
				for (int i = 0; i < count; i++) {
					System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name[i], score[i][0], score[i][1], score[i][2],
							score[i][3], avg[i]);
				}
				System.out.println("------------------------------------------");
				break;
			case 3:// 학생성적수정
				System.out.println("수정할 학생 이름을 입력하세요.");
				modifyName = scan.next();

				int chk = 0; // 찾을 학생이 없을 경우 0, 있으면 1
				for (int i = 0; i < count; i++) {
					if (name[i].equals(modifyName)) {
						System.out.println("[ 수정 과목 선택 ]");
						System.out.println("----------------");
						System.out.println("1.국어");
						System.out.println("2.영어");
						System.out.println("3.수학");
						System.out.println("수정할 과목을 선택하시오");
						input = scan.nextInt();
						chk = 1; // 찾는 학생이 있을 경우 1로 변경

						// score[i][0] = 국어, score[i][1] = 영어,score[i][2] = 수학, score[i][3] = 합계
						System.out.println(title[input] + "점수: " + score[i][input - 1]);
						System.out.println("-----------------------------");
						System.out.println("변경할 " + title[input] + "점수를 입력하세요");
						score[i][input - 1] = scan.nextInt(); // 수정할 점수 입력
						score[i][3] = score[i][0] + score[i][1] + score[i][2]; // 합계 수정
						avg[i] = score[i][3] / 3.0; // 평균 수정
						System.out.println("[ 수정 완 ]");
						System.out.println();
						break;

					} // if
				} // for

				// chk 학생이름이 없는 경우
				if (chk == 0) {
					System.out.println("[찾는 학생 없음 ]");
					System.out.println("찾는 학생이 없습니다.");
					System.out.println();
				}
			}// switch
		} // while
	}// main
}// class