package kr.co.job.array;

public class ArrayYest01 {

	public static void main(String[] args) {
		// �迭 or ����Ʈ : ���� Ÿ���� ������ �ϳ��� �������� �ٷ�� ��
//1��		int[] score; // score : �迭��
//2��		score = new int[5];
		// 1��+2��
//			int[] score = new int[5];

//			score[0] = 55;//~ score[4]=11
//		�迭�� �������� 1~100���� ���� �����ϱ�.
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
		// �ʱ�ȭ
		for (int i = 0; i < score.length; i++) {
			score[i] = 0;
		}

	}

}
