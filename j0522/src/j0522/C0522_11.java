package j0522;

public class C0522_11 {

	public static void main(String[] args) {
		//Circle 객체선언
		Circle c1 = new Circle();
		Point center = new Point(150,150);
		Circle c2 = new Circle(center,50);
//	 	Circle c2 = new Circle(new Point(150,150),50);//윗줄과 같다.
		//c2 변수? : x=150, y=150, r=50
		
		int[] x = {1,2,3};
		
		
		
		Point[] p = {new Point(100,100),new Point(140,50),new Point(200,100)};
		Triangle t1 = new Triangle(p);
		
		Triangle t2 = new Triangle(p[0],p[1],p[2]);
		
		// Point center = new Point(0,0);
		// x=0, y=0;
		// r=100;
	}

}
