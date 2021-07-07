/*
 * 다양ㅇ한 for문들
 * 1.시작값 끝값까지 입력받아 홀수의 합
 * 1+2+3...+10 = 55 출력해보기
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startValue, lastValue;
		
		//입력
		System.out.print("시작값 입력 : ");
		startValue = scan.nextInt();
		
		System.out.print("끝값 입력 : ");
		lastValue = scan.nextInt();
		
		//처리
		for(int i=startValue; i<=lastValue; i++) {
			if(i%2 == 1) {//다른 것으로 적용 가능 i%2 != 0
				System.out.println(i + "");
			}
		}
		
		System.out.println("-----------------------------");
		//이문제는 어려우니 다시 이해하도록 하기.
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i; // sum = sum + i 같다
			if(i !=10) {//i가 10이 아닐때
				System.out.print(i + "+");
			}else {
				System.out.println(i+"="+sum);
			}
			
		}
	}
}
