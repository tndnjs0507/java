package j0519;

import java.util.Scanner;

public class C0519_01 {
	
	public static void main(String[] args) {
		//성적입력
		Scanner scan = new Scanner(System.in);
		
		int choice = 0;
		int count =0;
		String[] name = new String[10];
		
		System.out.println("[성적처리프로그램]");
		System.out.println("1.성적입력");
		System.out.println("2.성적출력");
		System.out.println("3.성적수정");
		System.out.println("4.등수처리");
		System.out.println("5.학생성적검색");
		System.out.println("0.프로그램 종료");
		System.out.println("----------------------");
		System.out.println("원하는 번호를 입력하세요.");
		
		switch(choice) {
		case 1:
			for(int i=count;i<name.length;i++) {
				System.out.println(count+1 + "번째 학생의 이름을 입력하세요.");
				name[i] = scan.next();
		break;
		
		case 2:
		break;
			}
		}
		
		
	}

}
