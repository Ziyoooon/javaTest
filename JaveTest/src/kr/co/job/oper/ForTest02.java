/*
 * 1. 정수를 입력받고
 * 2. 1부터 입력받은 수까지 순서대로 출력
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("숫자 입력 :");
		num = scan.nextInt();
		
		//for문 완성
		for(int i=1; i<=num; i++) {//int i = 0; 따로 나눠도 됌
			System.out.println(i);
		}
		
	}

}
