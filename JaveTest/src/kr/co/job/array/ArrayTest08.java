package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest08 {

	public static void main(String[] args) {
		// 1부터 45까지 숫자중 6개번호를 출력하라.(로또)
		// 단, 숫자는 중복되면 안된다.
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