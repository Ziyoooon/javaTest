package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 5������ ���������� �ִ밪�� �ּҰ��� ���϶�.
//		int min = 100;
//		int max = 0;
//		
//		int score = (int)(Math.random()*50)+1;
//		
//		for(int i=0; i<score; i++) {
//			if(max>=score) {
//				max=i;
//			}
//			if(min<score) {
//				min=i;
//			}
//		}
//		System.out.println(max);
//		System.out.println(min);

		// 1���� 100������ ���� 10���� ����ϴµ�
		// ����� ������ �ִ밪�� �ּҰ��� ���϶�.
		int[] num = new int[10];
		int max = 0;
		int min = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			System.out.println(i + "���� ���� : " + num[i]);

//			if (num[i] > max) {
//				max = num[i];
//			}
//			if (num[i] < min) {
//				min = num[i];
//			}
//			System.out.println("�ִ밪 : " + max);
//			System.out.println("�ּҰ� : " + min);
		}

	}

}
