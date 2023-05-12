package j0512;

import java.util.Arrays;
import java.util.Collections;

public class C0512_10 {

	public static void main(String[] args) {
		int[] arr = {1,11,23,45,2,3,9,5};
		//Arrays.sort(arr);//오름차순정렬
		//Arrays.sort(arr,Collections.reverseOrder()); //내림차순 정렬 Integer(객체타입)
		int num=10;
		//단순for문
		for(int i:arr) {
			System.out.println(i+" ");
		}
		
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}

	}

}
