/* 실행문1
 * while(조건){
 * 		실행문2 => 조건이 참이면 실행됨.
 * }
 * 실행문3
 * 
 */
package kr.co.job.oper;

public class WhileTest01 {

	public static void main(String[] args) {
		// 1부터 10까지의 합
		int i = 1;
		int sum = 0;
		
		while(i<=10) {// = for(int i=1; i<=10; i++ 과 같다
			sum += i; //sum = sum + i
			System.out.println(i);
			
			i++; // i++의 순서가 중요하다.
			
		}

		System.out.println("sum =" + sum);
	}

}
