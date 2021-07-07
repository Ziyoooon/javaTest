package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		//문자열 배열 5개를 선언한 후 5명의 이름을 키보드 입력받으시오.
//		Scanner scan = new Scanner(System.in);
//		String[] name; //선언 냠냠...
//		name = new String[5];//String[] name = new String;
//		
//		System.out.println("이름을 입력해주세요.");
//		for(int i=0; i<name.length; i++) {
//			
//			name[i] = scan.next();
//			
//			System.out.println("이름 : "+name[i]);
//		}
		
		
		
		
		
		//문자열 배열 5개를 선언한 후 5명의 이름을 키보드 입력받으시오.
		Scanner scan = new Scanner(System.in);
		String[] name;
		name = new String[5];
				//String[] name = new String;
		System.out.println("이름 : ");
		for(int i=0; i<name.length; i++) {
			name[i] = scan.next();
			System.out.println("이름 : "+name[i]);
			System.out.println(Arrays.toString(name));
		}System.out.println("종료되었습니다.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
