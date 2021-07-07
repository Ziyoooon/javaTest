/*
 * 함수 즉, 메소드에 대해 이해해보기
 */
package kr.co.job.func;

import java.util.Scanner;

public class SwitchTest02 {
	static Scanner scan = new Scanner(System.in); // 여기서 new는 Scanner를 사용하겠다는 뜻

	public static void main(String[] args) {
		// static(정적) : 메모리에 로드됨 =>이게 없으면 동작이 안됨.
		int num = 0;
		boolean done = true; // done이 참이면 실행, 거짓이면 종료

		while (done) {
			// 메뉴출력
			menuPrint();

			num = menuPrint();

			switch (num) {
			case 1:// 두수의 합
				sumTest();
				break;

			case 2:
				System.out.println("2입니다.");
				break;
			case 3:
				System.out.println("3입니다.");
				break;
			case 99:
				System.out.println("반복을 종료합니다");
				done = false;
				break;
			default:
				System.out.println("누구냐 넌??");
			}
		}

	}

	private static void sumTest() {
		System.out.println("1입니다 : 두수의 합");
		int n1 = 3, n2 = 5, sum = 0;
		sum = n1 + n2;
		System.out.println("합 구하기 끝");

	}

	// menuPrint() : 메뉴 출력하는 함수
	private static int menuPrint() {// private = 이 클레스안에서만 사용가능한다는 뜻. 이라는데 음...
		System.out.println("==========[ Menu ] ===========");
		System.out.println(" 1.  2. 3.     99. 종료.");
		System.out.println("==============================");
		System.out.print("숫자 입력 : ");

		return scan.nextInt();
	}

}
