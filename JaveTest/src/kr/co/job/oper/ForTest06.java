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
			sum = sum + i; //sum + = i �� ���� enter => sysout(i);
			if(i != 10) {
				System.out.print(i + "+"); // sysout("+")�� ���ְ�
			}else {
				System.out.print(i + "="+ sum); //"=" + sum �̾ƴ϶� �տ� i�� �ٿ������ 10�� ���´� // sysout("")���鸸 �־��ش� 
			}
		}
		
		
		//sysout("=" + sum) ���ָ� ���ϳ��� ���� ���� ����� ���´�.
		

		System.out.println("-------------------------");
		*/
		/*
		 * 1.���۰� �������� �Է¹޾� Ȧ���� ��
		 */
		Scanner scan = new Scanner(System.in);
		int fristNum = 0;
		int lastNum = 0;
		int sum = 0; //sum�� �־������ ���۰��� ������ Ȧ���� ���� ���� �� �ִ�.
		
		System.out.print("���� �� : ");
		fristNum = scan.nextInt();
		
		System.out.print("�� �� : ");
		lastNum = scan.nextInt();
		
		for(int i=fristNum; i<=lastNum; i++) {
			if(i%2 == 1) { // % = ������ ���� ������ ��, / = ������ �� �� ��
			sum = sum+i;
			System.out.println(i);
		}
		}
		System.out.println("Ȧ���� ��"+sum);
		
	}

}
		