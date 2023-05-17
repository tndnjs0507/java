package j0517;

public class C0517_07 {

	public static void main(String[] args) {
		//static 객체선언없이 사용
		
		int[] num = new int[2];
		
		int a = 10;
		int b = 5;
		
		calculate(num, a,b);
		
		System.out.println("합계 : "+num[0]); //15
		System.out.println("평균 : "+num[1]); //7
		
		
		
	}
	
	static void calculate(int[] num, int a, int b) {
		//두수의 합, 평균
		num[0] = a+b;
		num[1] = (a+b)/2;
		
		return num;
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//		// Tv
//		// 객체선언
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		
//		t1.channel = 7;
//		System.out.println("Tv t1 channel : "+t1.channel);
//		
//		t2.channel = 8;
//		System.out.println("Tv t2 channel : "+t2.channel);
//		
//		t2 = t1;
//		System.out.println("t2 channel : "+ t2.channel);
//		
//		t2.channel = 0;
//	}
//
//}
