package stuProject2;

public class TestFile2 {

	public static void main(String[] args) {
		String name = "홍길동";
		int kor = 100;
		int eng = 99;
		int math = 90;
		System.out.printf("%s,%d,%d,%d \r\n",name,kor,eng,math);//프린트f는 파일로 저장할 수 없음.(출력용도)
		
		String data = String.format("%s,%d,%d,%d \r\n",name,kor,eng,math); //프린트f인데 파일로 저장할 수 있는 형태로 보면된다.(저장용도)
		System.out.println("문자열로 변수 저장 : "+data);
	}

}
