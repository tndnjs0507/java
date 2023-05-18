package j0518;

import java.util.Scanner;

public class C0518_05 {

	public static void main(String[] args) {
		// 숫자를 입력받아, 양수인지 음수인지 출력하시오. 0은 양수로 인정한다.
		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요.");
//		int num =0;
//			num = scan.nextInt();
//		if(num<0) {
//			System.out.println("음수입니다.");
//		}else
//			System.out.println("양수입니다.");
		// 국어,영어,수학 점수를 입력받아 평균 60점을 넘으면 합격, 불합격 출력하시오.
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		System.out.println("국어점수를 입력하세요.");
		kor = scan.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = scan.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = scan.nextInt();
		
		int total=kor+eng+math;
		double avg = total/3.0;
		if(avg>=60) {
			System.out.println("합격 : "+avg+"점입니다.");
		}else 
			System.out.println("불합격 : "+avg+"점입니다.");
		
		
	}

}
