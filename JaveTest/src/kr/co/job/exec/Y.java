package kr.co.job.exec;


import java.util.*;
import java.math.*;
public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 0;
		Scanner scan = new Scanner(System.in);
//		boolean done = true;
//		int coin = 0;
//		System.out.println("���� �־��ּ��� : ");
//		
//		while(done) {
//			System.out.println("------------------[MENU]------------------");
//			System.out.println("1.�ݶ�[500] 2.���̴�[500] 3.Ŀ��[1,000] 1.���");
//			System.out.println("------------------------------------------");
//			System.out.println("���ἱ�� : ");
//			num = scan.nextInt();
//		
//			switch(num) {
//			
//			}
//		}
		int num = 0;
		String[] coffee = new String[3];
		for(int i =0; i<3; i++) {
			System.out.print((i+1)+"��° Ŀ������: ");
			coffee[i] = scan.nextLine();
		}
		System.out.println("���° Ŀ�� �����ٱ�?");
		num = scan.nextInt();
		System.out.println("�ʰ� �� Ŀ�Ǵ�:"+coffee[num-1]);
		
	}

}
