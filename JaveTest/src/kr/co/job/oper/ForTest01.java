/*
 * �⺻���� for��
 * for(�ʱⰪ; ����; ����ġ){
 *  ���๮
 * }
 */
package kr.co.job.oper;

public class ForTest01 {

	public static void main(String[] args) {
		int i = 0;
		int sum = 0;
		for(i=1; i<=10; i++) {
			System.out.println("�ݺ����� i�� : "+ i);
			sum = sum + i;
			System.out.println("i="+i+"�϶�, sum=" + sum);
		}
		System.out.println("sum");
		System.out.println("for�� ������ �ݺ����� i�� :"+ i);
	}

}
