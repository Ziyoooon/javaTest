/*
 * Ű����� �μ��� �Է¹޾Ƽ� ū�� ������ ���ϴ� ���α׷��� �ۼ�.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam02 {

	public static void main(String[] args) {
		// ����
		Scanner scan = new Scanner(System.in);
		int num1= 1;
		int num2= 0;
	
		// �Է�		
		System.out.print("Input Number :");
		num1 = scan.nextInt();
		
		System.out.print("Input Number :");
		num2 = scan.nextInt();
		
		// ó�� �� ���
		if(num1>num2) {
			System.out.println("num1�� num2���� Ů�ϴ�.");
		}
		else {
			System.out.println("num1�� num2���� �۽��ϴ�.");	
		}
		
		System.out.println("���Դϴ�.");
		
	
		
		
	}

}
