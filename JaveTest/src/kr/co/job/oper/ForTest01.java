/*
 * 기본적인 for문
 * for(초기값; 조건; 증감치){
 *  실행문
 * }
 */
package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for(i=1; i<=10; i++) {
			System.out.println("반복변수 i값 : "+ i);
			sum = sum + i;
			System.out.println("i="+i+"일때, sum=" + sum);
		}
		System.out.println("sum");
		System.out.println("for문 종류후 반복변수 i값 :"+ i);
	}

}
