package kr.co.job.exec;

import java.util.Scanner;

public class ChpFour04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		char ch = 'c';
		
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		ch = scan.nextLine().charAt(0);
		

		if(ch>=48 && ch<=57) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
	}

}
