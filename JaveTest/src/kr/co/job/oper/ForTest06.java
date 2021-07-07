/*
 * 1+2+3...+10=55
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest06 {

	public static void main(String[] args) {
		
		/*Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		for(int i=1; i<=10; i++) {
			sum = sum + i; //sum + = i 와 같고 enter => sysout(i);
			if(i != 10) {
				System.out.print(i + "+"); // sysout("+")만 해주고
			}else {
				System.out.print(i + "="+ sum); //"=" + sum 이아니라 앞에 i를 붙여줘야지 10이 나온다 // sysout("")공백만 넣어준다 
			}
		}
		
		
		//sysout("=" + sum) 해주면 또하나의 보기 편한 방법이 나온다.
		

		System.out.println("-------------------------");
		*/
		/*
		 * 1.시작값 끝값까지 입력받아 홀수의 합
		 */
		Scanner scan = new Scanner(System.in);
		int fristNum = 0;
		int lastNum = 0;
		int sum = 0; //sum이 있어야지만 시작값과 끝값의 홀수의 합을 구할 수 있다.
		
		System.out.print("시작 값 : ");
		fristNum = scan.nextInt();
		
		System.out.print("끝 값 : ");
		lastNum = scan.nextInt();
		
		for(int i=fristNum; i<=lastNum; i++) {
			if(i%2 == 1) { // % = 나눴을 때의 나머지 값, / = 나눴을 때 의 몫
			sum = sum+i;
			System.out.println(i);
		}
		}
		System.out.println("홀수의 합"+sum);
		
	}

}
		