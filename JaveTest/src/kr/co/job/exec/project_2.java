package kr.co.job.exec;

import java.util.Scanner;

public class project_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String drinkName[] = { "���̴�", "�ݶ�", "Ŀ��" };
		int drinkPrice[] = { 500, 500, 1000 };
		int drinkGa[] = { 0, 5, 5 };
		int chooce = 0;
		int totalcoin = 0;

		boolean done = true;
		while (done) {
			System.out.println("-----------------------[Menu]----------------------");
			System.out.println("1.�������� 2.���ἱ�� 3.���ᳲ������ 4.�Ž����� 99.����");
			System.out.println("---------------------------------------------------");
			System.out.print("��ȣ�� �Է����ּ��� : ");
			int menu = 0;
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				// ��������
				// �����̶�� ���ǰ� �Ǿ��ֱ� ������ 100�� �Ǵ� 500���� �־����.
				// ��� ������ �־��°�
				// �Է��� ������ ���� �� ���ΰ�
				//
				System.out.print("500�� �Ǵ� 100���� ������ �־��ּ��� : ");
				int coin = 0;
				coin = scan.nextInt();

				if (coin == 100 || coin == 500) {
					totalcoin = totalcoin + coin; // taotalcoin += coin;
					System.out.println("���հ� :" + totalcoin + "��");

				} else {
					System.out.println("100�� �Ǵ� 500�� ������ �־��ּ���");
				}
				break;

			case 2: // ���������
				// ������� �������
				// ������� ������
				// �� ���Ҵ���
				// �ܾ��� ������ �� ������ �־��ּ��� �Է��ϱ�
				// ��� � ���Ҵ���
				System.out.println("1.���̴�(500��) 2.�ݶ�(500��) 3.Ŀ��(1000��) 4.���");
				System.out.println("���� ���Ǳ⿡ ���� �� : " + totalcoin);
				System.out.print("������ ��ȣ�� �����Ͽ� �ּ��� : ");
				chooce = scan.nextInt();

				if (chooce == 4) {
					System.out.println("����");
					break;
				} else {

					if (totalcoin < drinkPrice[chooce - 1]) { // ���� �����ؼ� �����
						System.out.println("���� �����մϴ�. ������ �� �־��ּ���.");
					} else if (totalcoin >= drinkPrice[chooce - 1]) { // ��� �ִ�
						System.out.println("���ϴ� ���ᰡ ���Ű����մϴ�.");

						if (drinkGa[chooce - 1] <= 0) { // ��� ����
							System.out.println("���� ������� �����ϴ�.");
						} else {
							totalcoin -= drinkPrice[chooce - 1]; // �� �ݾ׿��� ���� �ݾ��� ����
							System.out.println("�������� : " + drinkName[chooce - 1] + " /  ���� �ݾ� : " + totalcoin + "��");
							drinkGa[chooce - 1]--;// drinkGa[i-1]-1;
							System.out.println("���� ������ ���� : " + drinkGa[chooce - 1] + "��");
						}
					}

					break;

//				for (int i = 1; i <= drinkName.length; i++) {// 0���� �����ϴϱ� i=0���� ���� �����ϴ°� �ƴѰ� �ٵ� �� �տ����� i�� 1�� ����������
//					if (totalcoin < drinkPrice[i-1]) { // �� �ܾ��� ���� ���ݺ��� �۴ٸ�
//						System.out.println("�� ����");
//					} else if (totalcoin >= drinkPrice[i-1]) { // �� �ܾ��� ���� ���ݺ��� ũ�ٸ�
//						if (chooce == i) {// �������� �ܵ��� �� ���Ҵ���
//							totalcoin -= drinkPrice[i-1]; // �� �ݾ׿��� ���� �ݾ��� ����
//							System.out.println(drinkName[i-1]+totalcoin);
//
//							drinkGa[i-1]--;// drinkGa[i-1]-1;
//							System.out.println(drinkGa[i-1]);
//						}
//					}
				}

			case 3: // ���� ���� ����
				// ���ϴ� ������ ��ȣ�� �����ϸ� �� ��ȣ�� ���ᰡ � ���Ҵ���
				// �׿� ������ ��ȣ�� �ٸ� ��ȣ�� �Է��� �϶�� �����ϴ���
				System.out.println("1.���̴�(500��) 2.�ݶ�(500��) 3.Ŀ��(1000��)");
				System.out.print("Ȯ���ϰ� ���� ������ ��ȣ�� �Է��ϼ��� : ");
				chooce = scan.nextInt();
				if (chooce <= drinkGa.length) {
					System.out.println("���� ���� ���� : " + drinkGa[chooce - 1] + "��");
				} else {
					System.out.println("������ ��ȣ�� �ٽ� �����ϼ���.");// �ٸ� ��ȣ�� ������ �� ��� �ٽ� �ٽ� ���� �ö󰡾��ϴ°� �ƴѰ�
				}

				break;
			case 4: // �Ž�����
				// �� ���� ������ �տ��� ������ ������ �� ������ �ݾ�

				System.out.println("�Ž����� : " + totalcoin + "��");

				break;

			case 99: // ����
				System.out.println("�����ϰڽ��ϴ�.");
				done = false;
				break;

			default:
				System.out.println("�޴��� �ٽ� �������ּ���.");
				break;

			}
		}

		// TODO Auto-generated method stub

	}

}
