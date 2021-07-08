package kr.co.job.array;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		float avg = 0f; // float=f 실수로 나타내줘야하기 때문에 사용
		int max = 0;
		int min = 100;

		int[] score = { 55, 88, 96, 100, 90, 85, 75, 11, 5 };
		// 해당 배열에서 최대값(max)과 최소값(min)을 구하세요.
		// 숫자를 하나씩 int max에 넣어주고 어떤게 큰지 비교해서 큰 값만 남기기
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

		// 합구하기
//		for(int i=0; i<score.length; i++) {
//			sum+=score[i];
//					}
//		//평균
//		avg = sum /(float)score.length;
//		System.out.println("총점 : "+sum);
//		System.out.println("평균 : "+avg);
	}

}
