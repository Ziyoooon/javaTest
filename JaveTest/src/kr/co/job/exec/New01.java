package kr.co.job.exec;

import java.util.Scanner;

public class New01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean done = true;
		while (done) {
			// 1. ������ ��� 2. ����ڸ�� ���� ���� while
			System.out.println("�޴� �Է� 1. ������ 2. ����� 3. ����");
			int num = scan.nextInt();

			switch (num) {
			case 1:// �����ڸ��
				boolean done2 = true;
				while (done2) {
					// 1. ���ắ�� �� �����ڸ�带 ���� while
					System.out.println("1. ����ٲٱ� 2. ��� 99.����");
					int num3 = scan.nextInt();
					switch (num3) {
					case 1: // ���� �� ������
						break;
					case 2:
						break;
					case 99:
						System.out.println("����");
						done2 = false;
						break;
					}
				}
				break;

			case 2:// ����ں���
				boolean done3 = true;
				while (done3) {
					// ���� ���Ե� ����� ��带 ���� while
					System.out.println("1.�������� 99.����");
					int num2 = scan.nextInt();

					switch (num2) {

					case 1: // ���� ���Ե��� ���� switch
						break;
					case 99:
						System.out.println("����");
						done3 = false;
						break;
					}

				}
				break;
			case 99:
				System.out.println("����");
				done = false;
				break;
			}

		}

	}

}
