package kr.co.job.exec;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ChpFour {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ���ڿ��� 12345��� 1+2+3+4+5�� ����� 15�� ����� �Ǿ���Ѵ�.
		
		//'1'-'0' = 1 ASKII�ڵ� ����ϱ� 
//		String str = "12345";
//		System.out.println("str���ڿ��� ���� : "+str.length());
//		System.out.println(str.charAt(0));
//		System.out.println(str.charAt(1));
//		System.out.println(str.charAt(2));
//		System.out.println(str.charAt(3));
//		System.out.println(str.charAt(4)); //str.length()-1;
//		
//		String s = "HELLO";
//		String s2 = s.concat("world");
//		System.out.println(s2);
		
		String str = "12345";
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			sum += str.charAt(i)-'0';//sum=sum+str.charAt(i)-48; �ƽ�Ű�ڵ����0�� 48�̱� �����̴�
		}
		System.out.println("sum="+sum);
	

	}

}
