package kr.co.job.oper;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scan = new Scanner(System.in);
		boolean done = true; // done�� ���̸� ����, �����̸� ����				
		while(done) {
			System.out.println("--------------[�޴�]--------------");
			System.out.println("1.   2.   3.      99. ����.");
			System.out.println("-----------------------------------");
			System.out.print("���� �Է� : ");
			num = scan.nextInt();
			
			
			//�μ��� ��
			switch(num) {
			case 1:
				
				
				int a = 0;
				int b = 0;
				int able =0;
				
				System.out.println("ù��° �� : ");
				a = scan.nextInt();
				
				System.out.println("�ι�° �� : ");
				b = scan.nextInt();
				
				able= a+b;
				System.out.println("�μ��� �� : " + able);
				break;
				
			// ���� ���Ͻÿ�.	
			case 2:
				
				
				int dan = 0;
				int sum = 1;
				
				System.out.println("���� �� : ");
				dan = scan.nextInt();
				
				for(int i=1; i<10; i++) {
					sum=dan*i;
					System.out.println(dan+"*"+i+"="+sum);
					
				}
				break;
			
			//�Է¹����������� ��	
			case 3:
				int num1=0;
				int sum2=0;
				System.out.print("���ڸ� �Է��ϼ���:");
				num1 = scan.nextInt();
				
				for(int i=1; i<=num1; i++) {
					sum2=sum2+i;
				}
				System.out.println(sum2);
				break;
				
				
			//case3 = �Է��� �������� ���� ���Ͻÿ�.	
			case 4:
				int bin =0;
				int sum3 =0;
				
				System.out.println("�Է��� �� :");
				bin = scan.nextInt();

				for(int i=1; i<=bin; i++) {
					sum3=sum3+i;
				}
				System.out.println(sum3);
				
				break;
				
			case 5:
				int x = 0;
				int y = 0;
				
				System.out.println("�Է��� �� :");
				x = scan.nextInt();
				
				while(x<y) {
					
				}
				
			case 99:
				System.out.println("�����մϴ�.");
				done = false;
				break;
				
			default : // case 1,2,3 ������
				System.out.println("�� ������~?");
				
			}
		}
	}

}
