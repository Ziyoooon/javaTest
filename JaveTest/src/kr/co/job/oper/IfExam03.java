/*
 *  점수를 입력받아서 성적(A~F)을 출력하세요
 *  점수가
 *  97이상이면 A+, 96~94이면 A0, 93이하면 A-
 *  87이상이면 B+, 96~94이면 B0, 93이하면 B-
 *  77이상이면 C+, 96~94이면 C0, 93이하면 C-
 *  67이상이면 D+, 96~94이면 D0, 93이하면 D-
 *  로 성적을 출력하세요
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		// 선언
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char ch ='Z';
		char cuho = '0'; //초기값이 0이라서 else if 다음 밑으로 else(cuho='0')안써도 됨.
		
		//입력
		System.out.print("점수를 입력하세요 :");
		score = scan.nextInt();
		
		
		//처리 및 출력
		if(score >= 90 && score <=100) {
			ch='A';
			if(score >= 97) {
				cuho = '+';			
			}
			else if(score <= 93) {
				cuho = '-';
			}
			
		}
		if(score >= 80 && score <=89) {
			ch='B';
			if(score >= 87) {
				cuho = '+';
			}
			else if(score <= 83) {
				cuho = '-';
			}
				
		}
		if(score >= 70 && score <=79) {
			ch='C';
			if(score >= 77) {
				cuho = '+';
			}
			else if(score <= 73) {
				cuho = '-';
			}
				
		}
		if(score >= 60 && score <=69) {
			ch='D';
			if(score >= 67) {
				cuho = '+';
			}
			else if(score <= 63) {
				cuho = '-';	
			}
				
		}
		if(score < 60) {
			ch='F';
			
		}
		System.out.println("당신의 점수는"+score+"이고 당신의 학점은"+ch+cuho+"입니다");
	}
}	