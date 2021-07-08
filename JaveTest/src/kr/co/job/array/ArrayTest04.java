package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest04 {

	public static void main(String[] args) {
		// 5가지의 랜덤숫자중 최대값과 최소값을 구하라.
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

		// 1부터 100까지의 숫자 10개를 출력하는데
		// 출력한 값에서 최대값과 최소값을 구하라.
		int[] num = new int[10];
		int max = 0;
		int min = 0;

		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100) + 1;
			System.out.println(i + "개의 숫자 : " + num[i]);

//			if (num[i] > max) {
//				max = num[i];
//			}
//			if (num[i] < min) {
//				min = num[i];
//			}
//			System.out.println("최대값 : " + max);
//			System.out.println("최소값 : " + min);
		}

	}

}
