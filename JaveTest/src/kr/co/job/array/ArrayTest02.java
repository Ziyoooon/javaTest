package kr.co.job.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
		//���ڿ� �迭 5���� ������ �� 5���� �̸��� Ű���� �Է¹����ÿ�.
//		Scanner scan = new Scanner(System.in);
//		String[] name; //���� �ȳ�...
//		name = new String[5];//String[] name = new String;
//		
//		System.out.println("�̸��� �Է����ּ���.");
//		for(int i=0; i<name.length; i++) {
//			
//			name[i] = scan.next();
//			
//			System.out.println("�̸� : "+name[i]);
//		}
		
		
		
		
		
		//���ڿ� �迭 5���� ������ �� 5���� �̸��� Ű���� �Է¹����ÿ�.
		Scanner scan = new Scanner(System.in);
		String[] name;
		name = new String[5];
				//String[] name = new String;
		System.out.println("�̸� : ");
		for(int i=0; i<name.length; i++) {
			name[i] = scan.next();
			System.out.println("�̸� : "+name[i]);
			System.out.println(Arrays.toString(name));
		}System.out.println("����Ǿ����ϴ�.");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
