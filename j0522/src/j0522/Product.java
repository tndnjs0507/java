package j0522;

public class p1 {
	static int count=0;//클래스변수 - 객체선언없이 클래스명.변수명
	int serialNo;//인스턴스변수 - 객체선언 후 참조변수명.변수명
	{//인스턴스 초기화블럭
		++count;
		serialNo = count;
	}
	
	Product(){}//기본생성자
}
