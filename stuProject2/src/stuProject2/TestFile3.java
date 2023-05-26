package stuProject2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestFile3 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("c:/data/student.txt"));
			while(true) {
				String data = br.readLine();
				if(data==null) break;
				System.out.println(data);//1001,홍길동,81,81,100
				String[] dataArr = data.split(",");
				
				
				int stuNo = Integer.parseInt(dataArr[0]);
				String name = dataArr[1];
				//new Student(dataArr[0],DataArr[1],dataArr[2],);
			}//while
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
