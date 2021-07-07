/*
 * 나이를 입력받아서 60세이상이면 "노인"
 * 30세 59세면 "중장년",
 * 29세미만이면 "청소년"을 표현하세요.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam04 {	

	public static void main(String[] args) {
		// 선언
		Scanner scan = new Scanner(System.in);
		int num=0; // num말고 나이이므로 age로 입력하는게 좋음
		String str = ""; //String은 문장을 입력할때 사용, char은 하나의 문자만 사용
						 //String 연령층 = null;
		//입력
		System.out.print("나이를 입력하세요 : ");
		num = scan.nextInt(); // 이거 외우기!!!
		
		if(num>=60) {
			str="노인";
		}
		else if(num<=30) {
			str="청소년";
		}
		else {
			str="중장년";
		}
		
		//결과
		System.out.println("당신의 나이는 :" +num+"세이며 "+str+"입니다.");
	}

}
