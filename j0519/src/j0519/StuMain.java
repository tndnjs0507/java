package j0519;

import java.util.Scanner;

public class StuMain {
	
	//main 메소드
	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in); // 객체선언(new) S가 대문자이므로 클래스
		Student[] s = new Student[10]; // (객체)배열을 선언 한 줄이면 아래 7줄과 같은 효과다.

//		String[] name = new String[10];
//		int[] kor = new int[10];
//		int[] eng = new int[10];
//		int[] math = new int[10];
//		int[] total = new int[10];
//		double[] avg = new int [10];
//		int[] rank = new int[10];
//		int[][] score = new int[10][4] 배열을 컬럼안에 넣을 수 없다. DB에 넣어주기위해 kor,eng,math를 쓴다.

		int choice = 0; // 원하는 번호 입력하는 변수
		int count = 0; // 입력된 학생수
		int chk = 0; // 학생이 있는지 확인하는 변수
		String searchName = ""; // 검색할 이름변수
		String name="";
		int kor=0,eng=0,math=0;

		// 반복문 while,for : for는 횟수가 있는 것, while은 조건이 있는 것을 적으면 좋다.
		// 조건문은 if와 switch

		// 조건이 맞으면 실행 : 무한반복 - 100%
		loop: while (true) {
			System.out.println("[학생성적처리프로그램]");
			System.out.println("1.성적입력");
			System.out.println("2.성적출력");
			System.out.println("3.성적수정");
			System.out.println("4.등수처리");
			System.out.println("5.학생성적검색");
			System.out.println("0.프로그램 종료");
			System.out.println("----------------------");
			System.out.println("원하는 번호를 입력하세요.");
			choice = scan.nextInt(); // 한번 실행되고 입력 받으려고 대기할 것이다. 5를 입력하면 choice에 5가 들어간다.

			// 입력된 번호를 선택하는 조건문
			switch (choice) { // if문은 느리므로 switch문을 쓴다.

			case 1:

				// 10명의 성적을 입력하는 반복문 - (초기식;조건식(비교식);증감식)
				for (int i = count; i < s.length; i++) {// 나왔다가 다시 들어올 경우 입력된 학생수 다음부터 진행
					System.out.println((i + 1) + "이름을 입력하세요.(0.이전페이지 이동)");
					s[i] = new Student(); // 객체선언 - 공간할당을 해줌. 원래 Student s[i] ~인데 Student 위에서 써줘서 생략
					name = scan.next(); // 참조변수명.변수명 //이름 입력 또는 이전페이지 이동입력
					// 이전페이지 이동입력이 되었는지 확인 - 그외는 equals, 기본형 타입 : ==
					if (name.equals("0")) {
						System.out.println("[ 이전페이지로 이동합니다. ]");
						break;// 브레이크는 if문과 무관하다. for 또는 while 또는 switch를 빠져나온다. 메소드를 빠져나오는건 return이다.
					} // if
					System.out.println("국어점수를 입력하세요.");
					kor = scan.nextInt();
					System.out.println("영어점수를 입력하세요.");
					eng = scan.nextInt();
					System.out.println("수학점수를 입력하세요.");
					math = scan.nextInt();

					//데이터값과 함계,평균
					s[i] = new Student(name,kor,eng,math);
					s[i].sum(); // 합계처리
					s[i].average(); // 평균처리

					count++;// 입력이 완료되면 입력된 학생수 1증가
				} // for
				break; // switch빠져나올때 사용되는 구문 switch안에 for, if문 다 쓸 수 있다.
			case 2:
				System.out.println("[ 학생성적 ]");
//				String[] title = Student.title;
				// 클래스변수 사용 방법 : 클래스명.변수명
				// 상단타이틀 출력
				for (int i = 0; i < Student.title.length; i++) {
					System.out.print(Student.title[i] + "\t");
				}
				System.out.println();
				System.out.println("------------------------------------------------------");
				// 입력된 성적출력
				for (int i = 0; i < count; i++) {
					System.out.print(s[i].name + "\t");
					System.out.print(s[i].kor + "\t");
					System.out.print(s[i].eng + "\t");
					System.out.print(s[i].math + "\t");
					System.out.print(s[i].total + "\t");
					System.out.printf("%.2f \t", s[i].avg);
					System.out.print(s[i].rank + "\n");
				}
				System.out.println();

				break;
			case 3://
				chk = 0; // 초기화가 필요
				System.out.println("[ 학생성적 수정 ]");
				System.out.println("수정 할 학생의 이름을 입력하세요.(0.이전페이지 이동)");
				searchName = scan.next();

				// 0번 이전페이지 이동인지 비교
				if (searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break;// switch에 대한 브레이크
				}

				// 수정할 학생의 이름을 비교하기 위해 반복문
				for (int i = 0; i < count; i++) {
					if (s[i].name.equals(searchName)) {
						chk = 1;
						System.out.printf("[ %s 학생이 검색되었습니다. ] \n", searchName);
						System.out.println("1. 국어점수");
						System.out.println("2. 영어점수");
						System.out.println("3. 수학점수");
						System.out.println("----------------------------------------");
						System.out.println("수정할 과목을 선택하세요.");
						choice = scan.nextInt();

						switch (choice) {

						case 1:
							System.out.printf("[ 이전 국어점수 : %d ]\n", s[i].kor);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].kor = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 국어점수 수정완료 ]");
							System.out.println();
							break;

						case 2:
							System.out.printf("[ 이전 영어점수 : %d ]\n", s[i].eng);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].eng = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 영어점수 수정완료 ]");
							System.out.println();
							break;
						case 3:
							System.out.printf("[ 이전 수학점수 : %d ]\n", s[i].math);
							System.out.println("수정할 점수를 입력하세요.>>");
							s[i].math = scan.nextInt();
							s[i].sum();
							s[i].average();
							System.out.println("[ 수학점수 수정완료 ]");
							System.out.println();
							break;// switch

						}
					}
				}
				if (chk == 0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ] \n", searchName);
					System.out.println();

				}
				break;

			case 4:// 등수처리
				System.out.println("[ 등수처리 ]");
				// 등수처리 for문
				for (int i = 0; i < count; i++) { // 등록된 학생수 만큼 비교
					int rankCount = 1;// 등수가 1등부터 시작하기 때문에 1부터 시작
					for (int j = 0; j < count; j++) {
						if (s[i].total < s[j].total) { // 다른학생성적이 더 높으면
							rankCount++;
						}
					} // for
					s[i].rank = rankCount;// 변수를 등수변수에 저장
				} // for
				System.out.println("등수처리가 완료되었습니다.");
				System.out.println();
				break;
			case 5:
				System.out.println("[ 학생성적 검색 ]");

				System.out.println("학생이름을 입력하세요.(0.이전페이지로 이동)");
				searchName = scan.next();

				// 0번 이전페이지 이동인지 비교
				if (searchName.equals("0")) {
					System.out.println("이전페이지로 이동합니다.");
					System.out.println();
					break;// switch에 대한 브레이크
				}
				chk = 0;
				for (int i = 0; i < count; i++) {
					if (s[i].name.contains(searchName)) {

						chk = 1;
					}
				} // for
				if (chk == 0) {
					System.out.printf("[ %s 학생은 존재하지 않습니다. ] \n", searchName);
					System.out.println();
				}
				break;

			case 0:
				System.out.println("[ 프로그램 종료 ]");
				System.out.println();
				break loop;// switch
			default: // else 형태로 모든 조건이 아니면 이것을 실행해라라는 의미다.
				break;
//			if(choice==1) { //1초
//				
//			}else if(choice==2) {
//				
//			}else if(choice==3) {
//				
//			}else if(choice==4) {
//				
//			}else if(choice==5) {
//				
//			}else { //0

			}// switch
		} // while

	}// main

	// 성적출력 메소드
//static void recordTitle(int count, Student[] s) {
//		
//}//recordTitle

}// class
