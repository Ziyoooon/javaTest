package kr.co.job.exec;

import java.util.*;

public class ChpFour02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch = ' ';
				
		System.out.println("�Է��Ͻÿ�: ");
		ch = scan.nextLine().charAt(0); //next�� ����� ���������� enter�� ���� �� ������� �ȳ��� �׳� enter�����. �׷��� nextLine�Է�
		System.out.println(ch);
		if(ch == ' '|| ch=='\t') {//������ �ݴ�Ǵ� ���ǽ��� �Է��ؾ��� ���� ����.
			System.out.println("false");
		}
		else {
			System.out.println("true");
		}
		
//		String name ="";
//		System.out.println("���ڿ� �Է�:");
//		name = scan.nextLine();
//		if(!name.equals("ȫ�浿")) {
//			System.out.println("���");
//		}
//		else {
//			System.out.println("Ż��");
//		}
		
//--------------------------------------------------------------
		//!(ch == ''|| ch == '\t')
		

	}
}
