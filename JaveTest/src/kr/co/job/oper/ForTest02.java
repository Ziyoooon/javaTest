/*
 * 1. ������ �Է¹ް�
 * 2. 1���� �Է¹��� ������ ������� ���
 * 
 */
package kr.co.job.oper;

import java.util.Scanner;

public class ForTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.println("���� �Է� :");
		num = scan.nextInt();
		
		//for�� �ϼ�
		for(int i=1; i<=num; i++) {//int i = 0; ���� ������ ��
			System.out.println(i);
		}
		
	}

}
