package kr.co.job.func;

import java.util.Scanner;

public class ExamFunction03 {

	public static void main(String[] args) {
		//�޼���� ���� �˾Ƽ� ����� ��
		Scanner scan = new Scanner(System.in);
		//�μ��� Ű����� �Է¹޾Ƽ� �� �޼ҵ忡 ������� �޾� ����ϱ�
		int sum=0, n1=0, n2=0;
		
		System.out.print("ù�� : ");
		n1 = scan.nextInt();
		System.out.print("�̼� : ");
		n2 = scan.nextInt();
		
		sum = sumTwo(n1, n2);
		System.out.print("���� : "+sum);
	}
	
	static int sumTwo(int n1, int n2) {
		return n1 + n2;
	}
		

}
