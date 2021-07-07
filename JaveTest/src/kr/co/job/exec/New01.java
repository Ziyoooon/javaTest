package kr.co.job.exec;

import java.util.Scanner;

public class New01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean done = true;
		while (done) {
			// 1. 관리자 모드 2. 사용자모드 가기 위한 while
			System.out.println("메뉴 입력 1. 관리자 2. 사용자 3. 종료");
			int num = scan.nextInt();

			switch (num) {
			case 1:// 관리자모드
				boolean done2 = true;
				while (done2) {
					// 1. 음료변경 등 관리자모드를 위한 while
					System.out.println("1. 음료바꾸기 2. 등등 99.종료");
					int num3 = scan.nextInt();
					switch (num3) {
					case 1: // 음료 명 변경등등
						break;
					case 2:
						break;
					case 99:
						System.out.println("종료");
						done2 = false;
						break;
					}
				}
				break;

			case 2:// 사용자보드
				boolean done3 = true;
				while (done3) {
					// 동전 투입등 사용자 모드를 위한 while
					System.out.println("1.동전투입 99.종료");
					int num2 = scan.nextInt();

					switch (num2) {

					case 1: // 동전 투입등을 위한 switch
						break;
					case 99:
						System.out.println("종료");
						done3 = false;
						break;
					}

				}
				break;
			case 99:
				System.out.println("종료");
				done = false;
				break;
			}

		}

	}

}
