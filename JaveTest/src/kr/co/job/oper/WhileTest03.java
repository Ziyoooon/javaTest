package kr.co.job.oper;

import java.util.Scanner;

public class WhileTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int num = 0;
		System.out.print("���ڸ� �Է��ϼ���.(��:12345)>");
		
		Scanner scan = new Scanner(System.in);
		String tmp = scan.nextLine();
		num = Integer.parseInt(tmp);//or num = Integer.parseInt(scan.nextLine());
		
		while(num!=0) { //num�� 0�� �ƴ� ��
			sum = sum + num%10;
			System.out.println("sum=" + sum + " num=" + num);//sum=%3d num=%d%n", sum, num
			num /= 10;
		}
		System.out.println("���ڸ����� �� : "+sum);
	}

}
