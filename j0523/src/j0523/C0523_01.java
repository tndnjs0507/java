package j0523;

public class C0523_01 {

	public static void main(String[] args) {
		Deck d = new Deck();
		//Card[] c = new Card[52];
		
		//d.c[0].kind;
		System.out.printf("%s%d \n",d.c[0].kind,d.c[0].number);
		System.out.printf("%s%d \n",d.c[51].kind,d.c[51].number);
		
		//출력
		// c
		for(int i=0;i<52;i++) {
			System.out.printf("%s%d \n",d.c[i].kind,d.c[i].number);
		}
		
//		int[] arr = {1,2,3,4,5};
//		for(int i=0;i<5;i++) {
//		System.out.println(arr[i]);
//		}
	
	
		//구구단
//		for(int i=2;i<10;i++) {
//			for(int j=1;j<10;j++)
//				System.out.printf("%d * %d = %d\n",i,j,i*j);
//		}
	}

}
