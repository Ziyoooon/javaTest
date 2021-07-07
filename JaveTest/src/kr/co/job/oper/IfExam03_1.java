/*
 *  점수를 입력받아서 성적(A~F)을 출력하세요
 *  
 *  성적을 보관? ,문자1개?, char
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03_1 {

	public static void main(String[] args) {
		// 선언
		Scanner scan = new Scanner(System.in);
		int num = 0; // num대신에 score로 사용
		char ch = 'Z';
		
		//입력
		System.out.print("점수를 입력하세요 :");
		num = scan.nextInt();
		
		//처리 및 출력
		if(num>=90) { //if(num >= 90 && num <=100
			ch = 'A'; // System.out.printIn("A")
		}
		else if(num>=80) {
			ch = 'B';
		}
		else if(num>=70) {
			ch = 'C';
		}
		else if(num>=60){
			ch = 'D';
		}
		else{
			ch = 'E';
		}
		// 부호처리를 위한 실행문
		
		// 당신의 점수는 ??점수이고, 성적은 ??입니다.
		System.out.println("당신의 점수는"+num+"점이고, 성적은"+ch+"입니다");
		
	}
}
