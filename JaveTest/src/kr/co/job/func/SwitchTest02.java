/*
 * �Լ� ��, �޼ҵ忡 ���� �����غ���
 */
package kr.co.job.func;

import java.util.Scanner;

public class SwitchTest02 {
	static Scanner scan = new Scanner(System.in); // ���⼭ new�� Scanner�� ����ϰڴٴ� ��

	public static void main(String[] args) {
		// static(����) : �޸𸮿� �ε�� =>�̰� ������ ������ �ȵ�.
		int num = 0;
		boolean done = true; // done�� ���̸� ����, �����̸� ����

		while (done) {
			// �޴����
			menuPrint();

			num = menuPrint();

			switch (num) {
			case 1:// �μ��� ��
				sumTest();
				break;

			case 2:
				System.out.println("2�Դϴ�.");
				break;
			case 3:
				System.out.println("3�Դϴ�.");
				break;
			case 99:
				System.out.println("�ݺ��� �����մϴ�");
				done = false;
				break;
			default:
				System.out.println("������ ��??");
			}
		}

	}

	private static void sumTest() {
		System.out.println("1�Դϴ� : �μ��� ��");
		int n1 = 3, n2 = 5, sum = 0;
		sum = n1 + n2;
		System.out.println("�� ���ϱ� ��");

	}

	// menuPrint() : �޴� ����ϴ� �Լ�
	private static int menuPrint() {// private = �� Ŭ�����ȿ����� ��밡���Ѵٴ� ��. �̶�µ� ��...
		System.out.println("==========[ Menu ] ===========");
		System.out.println(" 1.  2. 3.     99. ����.");
		System.out.println("==============================");
		System.out.print("���� �Է� : ");

		return scan.nextInt();
	}

}
