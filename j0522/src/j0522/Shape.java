package j0522;

public class Shape {
	String color="blue";//인스턴스 변수 - 객체선언 후 참조변수명.변수명
	
	void draw() { //Static이없으면 인스턴스 메소드 - 객체선언 후 참조변수명.메소드명
		System.out.println("도형을 그리다.");
	}
}
