/*
 * �μ��� �Է¹޾Ƽ�
 * ���������� ū������ ���
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("���� �� : ");
		num1 = scan.nextInt();
		
		System.out.print("ū �� : ");
		num2 = scan.nextInt();
		
		int i = 0;
		int sum = 0;
		for(i=num1; i<=num2; i++) {
			sum = sum+i;
			System.out.println("i="+i+"�϶�, sum=" + sum);
			//i�� 10�� �� ���߰� �ʹ�.
			if(i==10) {
				break;//continue; ����ϰ� �ɰ�� sysout("-------")���� ���� �� 1��,2��,3��---10,11���� ����Ǽ� ����(10��11���� �ƴ϶�)
			}
		}
		
		
		
		
		
	}

}
