package kr.co.job.exec;

import java.util.Scanner;

public class wjy {

	public static void main(String[] args) {
		// drinkName[3],drinkPrice[3],drinkGa[3]
		String drinkName[] = { "���̴�", "�ݶ�", "Ŀ��" };
		int drinkPrice[] = { 500, 500, 1000 };
		int drinkGa[] = { 2, 0, 8 };
		Scanner scan = new Scanner(System.in);

		int totalcoin = 0;

		boolean done = true;
		while (done) {
			System.out.println("----------[�޴�]----------");
			System.out.println("1.�������� 2.���ἱ�� 3.������� 4.�Ž����� 99.����");
			int menu = 0;
			menu = scan.nextInt();

			switch (menu) {
			case 1: // ��������
				// �󸶸� ������ �Է��ϱ�
				// �󸶸� coin��� ������ ����
				// 500�� �Ǵ� 100���� �������θ� ���԰����ϰ�
				// ���߰��� ��� �� ������
				int coin = 0;
				System.out.println("500�� �Ǵ� 100���� ������ �־��ּ��� : ");
				coin = scan.nextInt();

				if (coin == 500 || coin == 100) { // �Է°��� 500�� 100�� �϶�
					totalcoin += coin;
					System.out.println("���ܾ� : " + totalcoin);
				} else {
					System.out.println("500�� �Ǵ� 100���� �־��ּ���.");
				}
				break;

			case 2: // ���ἱ��
				// � ���ᰡ �ִ���
				// ���ῡ ��ȣ�� �������ֱ�
				// ���ᰡ ������
				// ���� ����
				// ���Ḧ � ����� �� ����
				// 500�� �̻� ������ �־�����
				// ������ ��� �ִ���
				System.out.println("1.���̴�(500��) 2.�ݶ�(500��) 3.Ŀ��(1000��)");
				int choice = scan.nextInt();
				for(int i=1; i<4; i++) {
					if(choice == i) {
						if(drinkGa[i-1] == 0) {
							System.out.println("������");
						}else {
							if (choice == 3 && totalcoin < 1000) {
								System.out.println("�ܾ׺���");
							} else {
								if (totalcoin >= 500) {// totalcoin�� 500�� �̻�����
									for (int j = 1; j < 4; j++) {
										if (choice == j) {// ������ ���ᰡ ������ totalcoin���� ����
											System.out.println(drinkName[j - 1]);
											totalcoin -= drinkPrice[j - 1];
											
											drinkGa[i-1] -= 1;
									
											
											System.out.println(drinkGa[i-1]);
											System.out.println("���ܾ� : "+ totalcoin);
											
										}
									}
									
								} else {
									System.out.println("�ܾ׺���");
								}
							}
							
						}
						
						
					}
				}
				break;

			case 3: // ���
				//���������� ��� � ���Ҵ��� Ȯ���ϴ� â
				//
			case 4: // ������ȯ
				//500�� � 100�� � ��������
			case 99: // �ý��� ����
				done = false;
				System.out.println("����");
				break;
			default: // �� ���� �� �Է�
				System.out.println("���� �޴��Դϴ�.");
			}

		}

	}

}
