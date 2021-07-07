/*
 * 두수를 입력받아서
 * 작은수에서 큰수까지 출력
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("작은 수 : ");
		num1 = scan.nextInt();
		
		System.out.print("큰 수 : ");
		num2 = scan.nextInt();
		
		int i = 0;
		int sum = 0;
		for(i=num1; i<=num2; i++) {
			sum = sum+i;
			System.out.println("i="+i+"일때, sum=" + sum);
			//i가 10일 때 멈추고 싶다.
			if(i==10) {
				break;//continue; 사용하게 될경우 sysout("-------")선을 만들 때 1선,2선,3선---10,11선이 연결되서 나옴(10선11선이 아니라)
			}
		}
		
		
		
		
		
	}

}
