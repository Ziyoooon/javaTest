/*
 * Ű����� ���ڸ� �Է¹޾Ƽ�
 * 0���� �ƴ��� Ȯ���ϴ� ���α׷��� �ۼ��غ���
 * 
 * */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// ����� : Ű�����Է�, ���ں���
		Scanner scan = new Scanner(System.in);
		int num=0;
		String result = null; //result ������� �����ҷ��� ���
		
		// �Է�
		System.out.print("Input Number :");
		num = scan.nextInt();
		
		if(num==0) {
			//������ ���϶�
			//System.out.println("num�� 0�Դϴ�.");
			result = "num�� 0�Դϴ�.";
		}
		else {
			//������ �����϶�
			//System.out.println("num�� 0�� �ƴմϴ�.");
			result = "num�� 0�� �ƴմϴ�.";
		}
		System.out.println(result);
		System.out.println("Program End!!!");
		
	}//end of main()

}//end of class
