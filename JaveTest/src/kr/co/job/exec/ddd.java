package kr.co.job.exec;

import java.util.Scanner;

public class ddd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String drinkKind[] = { "���̴�", "�ݶ�", "Ŀ��" };
		int drinkMoney[] = { 1000, 1500, 2000 };
		int drinkCount[] = { 10, 10, 10 };

		boolean whole = true;
		while (whole) {
			System.out.println("-------------[��ü�޴�]--------------");
			System.out.println("1.������ 2.����� 3.���");
			System.out.println("--------------------------------");

			int wholeMenu = scan.nextInt();
			switch (wholeMenu) {

			case 1:// ������
				boolean admin = true;
				while (admin) {
					System.out.println("----------------[������ �޴�]-----------------");
					System.out.println("1.����Ȯ�� 2.��� 3.���� 99.���");
					System.out.println("-------------------------------------------");

					int adminMenu = scan.nextInt();
					switch (adminMenu) {

					case 1: // ����Ȯ��
						break;

					case 2: // ���
						break;

					case 3: // ����
						break;

					case 99: // ���
						System.out.println("����");
						admin = false;
						break; // ���Ḧ 99���� ������ �ٽ� ��ü�޴��� ���;� �Ǵ°� �ƴѰ���???

					default:
						System.out.println("�ٽ� �������ּ���");
						break;
					}
				}
				break;

			case 2:// �����
				boolean don = true;
				int totalmoney = 0;

				while (don) {
					System.out.println("---------------[����� �޴�]-------------");
					System.out.println("1.������ 2.����޴� 3.��� 4.�Ž����� 99.���");
					System.out.println("--------------------------------------");

					int userMenu = scan.nextInt();

					switch (userMenu) {

					case 1: // �� ����
						// ���� �� ������ �Է�
						// ���� �� �߰� ������ �Է��ҽ� �� �ƴϿ��� �ۼ��Ұ�
						// ���� �߰��� �ݾ��� �Է��ϰ� ���� ���� ���;���
						// �ƴϸ� ����������
						int money = 0;

						System.out.print("���� �־��ּ��� : ");
						money = scan.nextInt();
						totalmoney += money;

						System.out.println("�߰��� ���� �� �ְڽ��ϱ�?(���� �Է��Ͻÿ�) : ");
						String choose = scan.next();

						if (choose.equals("��")) {// Ȯ���ʿ�
							System.out.println("���� �־��ּ��� :");
							money = scan.nextInt();
							totalmoney += money;
							System.out.println("�� ���Ǳ⿡ ���� �� : " + totalmoney + "��");

						} else {
							System.out.println("�� ���Ǳ⿡ ���� �� : " + totalmoney + "��");
						}
						//
						break;

					case 2: // ����޴�
						// ���� �޴��� ���;���(���ῷ�� ����,��� �Բ�)
						// ���ϴ� ������ ������ �������� �ܵ��� �����ִٸ� �� �� �� �ΰ�
						// yes�ϸ� �ݺ��ǰ��ϰ� no ����������
						// ���������� �� ���� ���;���
						// ���� ��� ���̴ٸ� ��� �ܵ��� ������ �ٸ� ���Ḧ ������ �� �ΰ�
						System.out.println("------------[���� �޴�]-------------");

						for (int i = 0; i < drinkKind.length; i++) {
							System.out.print(
									(i + 1) + drinkKind[i] + "[" + drinkMoney[i] + "]" + "(" + drinkCount[i] + ") ");
						}
						System.out.println();

						System.out.println("���ϴ� ���Ḧ �������ּ��� : ");
						int num = scan.nextInt();
						System.out.println("���ϴ� ������ �����ּ��� : ");
						int number = scan.nextInt();

						System.out.println("�� �ݾ� : " + (drinkMoney[num - 1] * number));
						drinkCount[num - 1] -= number;

						totalmoney -= (drinkMoney[num - 1] * number);
						boolean boo = true;
						while (boo) {
							System.out.println("�� ���? �� �ƴϿ�");
							String chooce2 = scan.next();

							if (chooce2.equals("��")) {// chooce2.equals=="��"�Ұ����Ѱ�?
								System.out.println("���ϴ� ���Ḧ �������ּ��� : ");
								num = scan.nextInt();
								System.out.println("���ϴ� ������ �����ּ��� : ");
								number = scan.nextInt();

								System.out.println("�� �ݾ� : " + (drinkMoney[num - 1] * number));
								drinkCount[num - 1] -= number;
								totalmoney -= (drinkMoney[num - 1] * number);
								System.out.println("�� ���� �ݾ� : " + (totalmoney));
							} else if (chooce2.equals("�ƴϿ�")) {
								// ���� ������ ������ ������ ������ ���;��Ѵ� �׸��� �ܵ�����
								System.out.println("���� �� ������ ����, ���� : ");
								
								boo = false;

							} else {
								System.out.println("�ٽ� �Է��Ͽ��ּ���");
							}
						}

						/*
						 * if(chooce2.equals("��")) {//chooce2.equals=="��"�Ұ����Ѱ�?
						 * System.out.println("���ϴ� ���Ḧ �������ּ��� : "); num = scan.nextInt();
						 * System.out.println("���ϴ� ������ �����ּ��� : "); number = scan.nextInt();
						 * 
						 * 
						 * System.out.println("�� �ݾ� : "+(drinkMoney[num-1] * number));
						 * drinkCount[num-1]-=number; totalmoney -= (drinkMoney[num-1] * number);
						 * System.out.println("�� ���� �ݾ� : "+(totalmoney)); }else
						 * if(chooce2.equals("�ƴϿ�")) { //���� ������ ������ ������ ������ ���;��Ѵ�
						 * 
						 * }else { System.out.println("�ٽ� �Է��Ͽ��ּ���"); }
						 * 
						 */

						break;

					case 3: // ���
						break;

					case 4: // �Ž�����
						break;

					case 99: // ���
						System.out.println("���");
						don = false;
						break;

					default:
						System.out.println("�ٽ� �Է����ּ���");

					}
				}

				break;

			case 3:// ���
				break;

			default:
				break;
			}

		}

	}

}
