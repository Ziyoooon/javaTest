/*
 * �پ礷�� for����
 * 1.���۰� �������� �Է¹޾� Ȧ���� ��
 * 1+2+3...+10 = 55 ����غ���
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int startValue, lastValue;
		
		//�Է�
		System.out.print("���۰� �Է� : ");
		startValue = scan.nextInt();
		
		System.out.print("���� �Է� : ");
		lastValue = scan.nextInt();
		
		//ó��
		for(int i=startValue; i<=lastValue; i++) {
			if(i%2 == 1) {//�ٸ� ������ ���� ���� i%2 != 0
				System.out.println(i + "");
			}
		}
		
		System.out.println("-----------------------------");
		//�̹����� ������ �ٽ� �����ϵ��� �ϱ�.
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i; // sum = sum + i ����
			if(i !=10) {//i�� 10�� �ƴҶ�
				System.out.print(i + "+");
			}else {
				System.out.println(i+"="+sum);
			}
			
		}
	}
}
