/*
 * ���̸� �Է¹޾Ƽ� 60���̻��̸� "����"
 * 30�� 59���� "�����",
 * 29���̸��̸� "û�ҳ�"�� ǥ���ϼ���.
 */
package kr.co.job.oper;

import java.util.Scanner;

public class IfExam04 {	

	public static void main(String[] args) {
		// ����
		Scanner scan = new Scanner(System.in);
		int num=0; // num���� �����̹Ƿ� age�� �Է��ϴ°� ����
		String str = ""; //String�� ������ �Է��Ҷ� ���, char�� �ϳ��� ���ڸ� ���
						 //String ������ = null;
		//�Է�
		System.out.print("���̸� �Է��ϼ��� : ");
		num = scan.nextInt(); // �̰� �ܿ��!!!
		
		if(num>=60) {
			str="����";
		}
		else if(num<=30) {
			str="û�ҳ�";
		}
		else {
			str="�����";
		}
		
		//���
		System.out.println("����� ���̴� :" +num+"���̸� "+str+"�Դϴ�.");
	}

}
