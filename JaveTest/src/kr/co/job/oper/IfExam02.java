/*
 * 키보드로 두수를 입력받아서 큰지 작은지 비교하는 프로그램을 작성.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// 선언
		Scanner scan = new Scanner(System.in);
		int num1= 1;
		int num2= 0;
	
		// 입력		
		System.out.print("Input Number :");
		num1 = scan.nextInt();
		
		System.out.print("Input Number :");
		num2 = scan.nextInt();
		
		// 처리 및 출력
		if(num1>num2) {
			System.out.println("num1이 num2보다 큽니다.");
		}
		else {
			System.out.println("num1이 num2보다 작습니다.");	
		}
		
		System.out.println("끝입니다.");
		
	
		
		
	}

}
