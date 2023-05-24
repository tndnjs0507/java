package j0524;

public class C0524_02 {

	public static void main(String[] args) {

		//객체선언
		CaptionTv c = new CaptionTv();
		c.channelUp();
		System.out.println(c.channel);
		
		//다형성
		Tv t = new CaptionTv();
		t.channelUp();
		System.out.println(t.channel);
		
		//t.caption();//공간은 있지만, t에는 메소드가 없음
		Tv t2 = new Tv();
		t2.channelUp();
		System.out.println(t2.channel); //1

//		CaptionTv c2 = null;
//		t2 = c;//자손에서 부모로 갈땐 tv를 생략 가능
//		c = (CaptionTv)t2; //부모에서 자손갈땐 꼭 형변환 해야한다.
//		c2 = t2;
		
	}

}
