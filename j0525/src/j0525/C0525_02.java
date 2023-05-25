package j0525;

import java.util.ArrayList;

public class C0525_02 {

	public static void main(String[] args) {
		ArrayList<Card> list = new ArrayList<>();
		
		
		//퀴즈1 - 1,13
//		list.add(new Card(Card.kinds[0],1));
//		list.add(new Card(Card.kinds[0],2));
//		list.add(new Card(Card.kinds[0],3));
		
//		for(int i=0;i<13;i++) {
//			list.add(new Card(Card.kinds[0],i+1));
//		}
		
		//퀴즈2 - 카드 4개를 만들어서, 4가지 종류, 숫자는 1로 넣으시오.
//		for(int i=0;i<4;i++) {
//			list.add(new Card(Card.kinds[i],1));
//		}
//		
		//퀴즈3 - 카드 52장을 만들어서 SPACE-13장, HEART-13장, DIAMOND - 13장, CLOVER -13장, 숫자는 1로 넣으세요.
		// /13, %13 활용
		// 0/13=0 1/13=0, 2/13=0....13/13=1....25/13=1
		// 1,2,3,4,....52 0*13+1, 0*13+2......0*13+12, 1*13+1, 1*13+2....1*13+12
		//1,2,3,4,...13,1,2,3,4...13
		for(int i=0;i<52;i++) {
				list.add(new Card(Card.kinds[i/13],i%13+1));	
			}
		//출력
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).kind+","+list.get(i).number);
			System.out.println(list.get(i).kind+","+Card.numbers[list.get(i).number]);
		}
	}

}
