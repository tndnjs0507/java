
public class Student {

	private int stuNo;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	private int rank;
	private String createDate;
	private String updateDate;
	
	Student(){}
	Student(int stuNo,String name,int kor,int eng,int math,String createDate){
		this.stuNo = stuNo; //this.인스턴스변수 = 지역변수, this빼면 지역변수에 저장, 선언하는 객체 안에 데이터를 집어넣기 위함.
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = total;
		this.avg = avg;
		this.rank = rank;
		this.createDate = createDate;
		
	}
	
	
}