package kr.co.job.oper;

import java.util.Scanner;

public class ForTest04 {

	public static void main(String[] args) {
		// �ܼ��� �Է¹޾Ƽ� �ش� ���� ����ϼ���.
		int dan =0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� �� �Է� : ");
		dan = scan.nextInt();
		
		for(dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.println(dan + "*" + i + "=" + dan*i);
				
			}
			
		}

	}

}
