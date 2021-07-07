package kr.co.job.exec;

import java.util.*;

public class ChpFour02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
				
		System.out.println("입력하시오: ");
		ch = scan.nextLine().charAt(0); //next도 사용이 가능하지만 enter를 했을 때 결과값이 안나옴 그냥 enter기능임. 그래서 nextLine입력
		System.out.println(ch);
		if(ch == ' '|| ch=='\t') {//문제와 반대되는 조건식을 입력해야지 값이 나옴.
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		
//		String name ="";
//		System.out.println("문자열 입력:");
//		name = scan.nextLine();
//		if(!name.equals("홍길동")) {
//			System.out.println("통과");
//		}
//		else {
//			System.out.println("탈락");
//		}
		
//--------------------------------------------------------------
		//!(ch == ''|| ch == '\t')
		

	}
}
