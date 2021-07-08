package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest08 {

	public static void main(String[] args) {
		// 1���� 45���� ������ 6����ȣ�� ����϶�.(�ζ�)
		// ��, ���ڴ� �ߺ��Ǹ� �ȵȴ�.
		int[] lotto = new int[6];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * 45) + 1;
			for (int f = 0; f < i; f++) {
				if (lotto[f] == lotto[i]) {
					i--;
				}
			}
		}
		System.out.print(Arrays.toString(lotto));
	}

}