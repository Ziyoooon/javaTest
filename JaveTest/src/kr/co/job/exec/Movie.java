/*����.  ����� �¶��� ��ȭ���� ����Ʈ�� ��� ��ȭ���̵� ���ͳ����� �¶��� Ƽ�Ͽ��Ÿ� �� �� �ֵ��� �Ͽ� ������ �����ϰ� ������ �� �ֵ��� ���� �����ý����� �����ϱ�� �Ͽ���.
 * 1. �� ȸ���� ȸ����ȣ�� �ĺ��Ǹ� �̸�,�ֹι�ȣ,�ּ�,�ڵ�����ȣ,�����ּ�, �����ϴ� �帣�� ���� ������ ������ �ִ�.
 * �ϼ��Ǹ� ȸ�����Ա��� ������
 */

package kr.co.job.exec;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = 12345;
		String name = "������";
		int birthDate = 970610;
		String address = "��⵵ ������ �Ǽ���";
		String cellPhone = "010-2606-1355";
		String mail = "m0506ji@namnam.com";
		
		String ilikeGenre = "SF";
		String lately = "���̾�Ʈ �÷��̽�2";
		String movieBasket = "�߽�����, ��������";
		
//		String choose = scan.nextLine();
		System.out.print("[�α���]\nȸ����ȣ�� �Է����ּ��� : ");
		boolean movie = true;
		boolean menu2 = true;
		while (movie) {
			menu2=true;
			int menu = 0;
			
			number = scan.nextInt();
			if (number == 12345) {
//				choose = scan.nextLine();
				System.out.println("���� : " + name + "\nȸ����ȣ : " + number + "\n�ֹι�ȣ : " + birthDate + "\n�ּ� : " + address
						+ "\n�ڵ�����ȣ : " + cellPhone + "\n�����ּ� : " + mail);
				System.out.println("------------------------------------------------");
				System.out
				.println("�����ϴ� �帣 : " + ilikeGenre + "\n�ֱٿ� �� ��ȭ : " + lately + "\n���� ���� ��ȭ : " + movieBasket);
				System.out.print("\n���������� �����ʴϱ�? \n1.�� 2.�ƴϿ�\n=>");
				menu = scan.nextInt();
				
				while (menu2) {
					System.out.println("-------------------[�������]--------------------");
					System.out.println("1.�̸� 2.�ּ� 3.�ڵ�����ȣ 4.�����ּ� 5.����");
					System.out.println("-----------------------------------------------");
					
					switch (menu) {
					case 1:
						
						int repair = 0;
						repair = scan.nextInt();
						
						switch (repair) {
						
						case 1:
							scan.nextLine();//������ �ʿ� ����
							System.out.print("�����̸� : " + name + "\n������ �̸� : ");
							if (name.equals("������")) {
								String a = name;
								a = scan.next();
								System.out.println(a);
							}
							break;
							
						case 2:
							scan.nextLine();
							System.out.print("�����ּ� : " + address + "\n������ �ּ� : ");
							if (address.equals("��⵵ ������ �Ǽ���")) {
								String b = address;
								b = scan.nextLine();
								System.out.println(b);// ��⵵ ����� ��� �Է��ϴϰ� ��⵵�� �� nextLine�����ص� �ȵ�...
							}
							break;
							
						case 3:
							System.out.print("�����ڵ��� ��ȣ : " + cellPhone + "\n������ ��ȣ : ");
							if (cellPhone.equals("010-2606-1355")) {
								String c = cellPhone;
								c = scan.next();
								System.out.println(c);// ��⵵ ����� ��� �Է��ϴϰ� ��⵵�� �� nextLine�����ص� �ȵ�...
							}
							break;
							
						case 4:
							System.out.print("���������ּ� : " + mail + "\n������ �����ּ� : ");
							if (mail.equals("m0506ji@namnam.com")) {
								String d = mail;
								d = scan.next();
								System.out.println(d);
							}
							break;
							
						case 5:
							
							System.exit(0);//movie=false; && menu2=false;
							
							break;
							
						default :
							break;
						
							
						}
						break;
					case 2:
						System.out.println("�ݰ����ϴ�." + name + "��");// �ٲ� �̸�(b)���� �ְ����
						break;
						
					default:
						System.out.println("ȸ����ȣ�� �ǹٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ��䤡");
					}
					
					
					
//					menu2 = false;
//					break;
					
				} 
			}
				else {
					System.out.println("ȸ����ȣ�� �ǹٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ���");// ȸ����ȣ�� �ٸ���ȣ�ϰ�� �ٽ� �α���â�� �����ϴµ� �ȶ�
					break;
				} // �ٽ� �α����ϸ� �ٲ� �������� ���;���
			
		}
	}
}