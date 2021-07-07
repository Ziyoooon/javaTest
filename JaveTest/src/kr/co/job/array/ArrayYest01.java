package kr.co.job.array;

public class ArrayYest01 {

	public static void main(String[] args) {
		// 배열 or 리스트 : 같은 타입의 변수를 하나의 묶음으로 다루는 것
//1번		int[] score; // score : 배열명
//2번		score = new int[5];
		// 1번+2번
//			int[] score = new int[5];

//			score[0] = 55;//~ score[4]=11
//		배열에 랜덤으로 1~100까지 수를 대입하기.
		int[] score = new int[100];

//			score[0] = (int)(Math.random()*100)*1;
//			score[1] = (int)(Math.random()*100)*1;
//			score[2] = (int)(Math.random()*100)*1;
//			score[3] = (int)(Math.random()*100)*1;
//			score[4] = (int)(Math.random()*100)*1;

		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100) + 1;
		}
		for (int i = 0; i < score.length; i++) {
			System.out.println("score[" + i + "]=" + score[i]);
		}
		// 초기화
		for (int i = 0; i < score.length; i++) {
			score[i] = 0;
		}

	}

}
