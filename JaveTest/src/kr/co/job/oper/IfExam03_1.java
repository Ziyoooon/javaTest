/*
 *  ������ �Է¹޾Ƽ� ����(A~F)�� ����ϼ���
 *  
 *  ������ ����? ,����1��?, char
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03_1 {

	public static void main(String[] args) {
		// ����
		Scanner scan = new Scanner(System.in);
		int num = 0; // num��ſ� score�� ���
		char ch = 'Z';
		
		//�Է�
		System.out.print("������ �Է��ϼ��� :");
		num = scan.nextInt();
		
		//ó�� �� ���
		if(num>=90) { //if(num >= 90 && num <=100
			ch = 'A'; // System.out.printIn("A")
		}
		else if(num>=80) {
			ch = 'B';
		}
		else if(num>=70) {
			ch = 'C';
		}
		else if(num>=60){
			ch = 'D';
		}
		else{
			ch = 'E';
		}
		// ��ȣó���� ���� ���๮
		
		// ����� ������ ??�����̰�, ������ ??�Դϴ�.
		System.out.println("����� ������"+num+"���̰�, ������"+ch+"�Դϴ�");
		
	}
}
