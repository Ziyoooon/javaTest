package kr.co.job.array;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		final int SIZE = 5; //final �����̶�� �� ������ �ٲ��� ����
		String[] name = new String[SIZE];//final�� �빮��
		Scanner scan = new Scanner(System.in);
		
		// �̸� �Է¹ޱ�
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("�̸�: ");
			name[i]=scan.next();
		}
		// �迭�� ����ϱ� -(����)�Ѱ���
		int r=(int)(Math.random()*SIZE);
			System.out.println(name[r]);
	}

}
