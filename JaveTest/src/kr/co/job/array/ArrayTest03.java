package kr.co.job.array;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float avg = 0f; // float=f �Ǽ��� ��Ÿ������ϱ� ������ ���
		int max = 0;
		int min = 100;

		int[] score = { 55, 88, 96, 100, 90, 85, 75, 11, 5 };
		// �ش� �迭���� �ִ밪(max)�� �ּҰ�(min)�� ���ϼ���.
		// ���ڸ� �ϳ��� int max�� �־��ְ� ��� ū�� ���ؼ� ū ���� �����
		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if(score[i] < min) {
				min = score[i];
			}

		}
		System.out.println(max);
		System.out.println(min);

		// �ձ��ϱ�
//		for(int i=0; i<score.length; i++) {
//			sum+=score[i];
//					}
//		//���
//		avg = sum /(float)score.length;
//		System.out.println("���� : "+sum);
//		System.out.println("��� : "+avg);
	}

}
