package j0511;

public class C0511_03 {
	
	public static void main(String[] args) {
				int i=0,sum=0;
				
				for(i=0;;i++) {
					if(sum>100) {
						break;
					}
					sum = sum+i;
				}
				
				System.out.println("i의 결과값 : "+(i));
				System.out.println("sum의 결과값 : "+sum);
					
//				while(true) {
//					if(sum>100) {	//
//						break; //while,for문 종료할때 : break문
//					} //if
//					i++;
//					sum = sum + i; //i=0, sum=0, i=1 sum=1
//				}//while
//
//			System.out.println("i의 결과값 : "+i);
//			System.out.println("sum의 결과값 : "+sum);
			
	}
}