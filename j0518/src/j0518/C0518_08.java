package j0518;

import java.util.Scanner;

public class C0518_08 {

	public static void main(String[] args) {
		// 로또맞추기
		//1-45까지 숫자입력
		int[] lotto = new int[45];
		int[] myNum = new int[6];
		int[] myLotto = new int[6];
	
		//1-45번까지 숫자를 lotto 넣어보세요.
		//for
		for(int i=0;i<lotto.length;i++) {
			lotto[i] = i+1;
			}
		
		//lotto 번호섞기
		int temp=0;
		//for 0-1000까지
		for(int i=0;i<1000;i++) {
			int random = (int)(Math.random()*45);
			temp = lotto[0];
			lotto[0] = lotto[random];
			lotto[random] = temp;
		}//
		
		//lotto 당첨번호 출력
		System.out.println("lotto 당첨번호 : ");
		for(int i=0;i<6;i++) {
		System.out.print(lotto[i]+"\t");
		}
		System.out.println();
		
		//내가 입력한 숫자 6개
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<6;i++) {
		System.out.println((i+1)+"번째 번호를 입력하세요.");
		myNum[i] = scan.nextInt();
	}
		System.out.println();
		//당첨된 번호 넣기
		int count = 0;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(lotto[i]==myNum[j]) {
					myLotto[count] = lotto[i]; 
					count++;
					break;
				}
			}
		}
		//당첨된 번호 출력
		System.out.println("당첨된 번호 : ");
		for(int i=0;i<count;i++) {
		System.out.print(myLotto[i]+"\t");
		}
		System.out.println();
		
		//입력한 번호
		System.out.println("입력번호 출력 : ");
		for(int i=0;i<6;i++) {
			System.out.print(myNum[i]+"\t");
		}
	}
}
