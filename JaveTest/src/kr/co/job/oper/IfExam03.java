/*
 *  ������ �Է¹޾Ƽ� ����(A~F)�� ����ϼ���
 *  ������
 *  97�̻��̸� A+, 96~94�̸� A0, 93���ϸ� A-
 *  87�̻��̸� B+, 96~94�̸� B0, 93���ϸ� B-
 *  77�̻��̸� C+, 96~94�̸� C0, 93���ϸ� C-
 *  67�̻��̸� D+, 96~94�̸� D0, 93���ϸ� D-
 *  �� ������ ����ϼ���
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		// ����
		Scanner scan = new Scanner(System.in);
		int score = 0;
		char ch ='Z';
		char cuho = '0'; //�ʱⰪ�� 0�̶� else if ���� ������ else(cuho='0')�Ƚᵵ ��.
		
		//�Է�
		System.out.print("������ �Է��ϼ��� :");
		score = scan.nextInt();
		
		
		//ó�� �� ���
		if(score >= 90 && score <=100) {
			ch='A';
			if(score >= 97) {
				cuho = '+';			
			}
			else if(score <= 93) {
				cuho = '-';
			}
			
		}
		if(score >= 80 && score <=89) {
			ch='B';
			if(score >= 87) {
				cuho = '+';
			}
			else if(score <= 83) {
				cuho = '-';
			}
				
		}
		if(score >= 70 && score <=79) {
			ch='C';
			if(score >= 77) {
				cuho = '+';
			}
			else if(score <= 73) {
				cuho = '-';
			}
				
		}
		if(score >= 60 && score <=69) {
			ch='D';
			if(score >= 67) {
				cuho = '+';
			}
			else if(score <= 63) {
				cuho = '-';	
			}
				
		}
		if(score < 60) {
			ch='F';
			
		}
		System.out.println("����� ������"+score+"�̰� ����� ������"+ch+cuho+"�Դϴ�");
	}
}	