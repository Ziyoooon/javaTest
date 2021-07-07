package kr.co.job.exec;

import java.util.Scanner;

public class wjy {

	public static void main(String[] args) {
		// drinkName[3],drinkPrice[3],drinkGa[3]
		String drinkName[] = { "사이다", "콜라", "커피" };
		int drinkPrice[] = { 500, 500, 1000 };
		int drinkGa[] = { 2, 0, 8 };
		Scanner scan = new Scanner(System.in);

		int totalcoin = 0;

		boolean done = true;
		while (done) {
			System.out.println("----------[메뉴]----------");
			System.out.println("1.동전투입 2.음료선택 3.음료재고 4.거스름돈 99.종료");
			int menu = 0;
			menu = scan.nextInt();

			switch (menu) {
			case 1: // 동전투입
				// 얼마를 넣을지 입력하기
				// 얼마를 coin라는 변수로 선언
				// 500원 또는 100원의 동전으로만 투입가능하게
				// 돈추가는 어떻게 할 것인지
				int coin = 0;
				System.out.println("500원 또는 100원의 동전을 넣어주세요 : ");
				coin = scan.nextInt();

				if (coin == 500 || coin == 100) { // 입력값이 500원 100원 일때
					totalcoin += coin;
					System.out.println("총잔액 : " + totalcoin);
				} else {
					System.out.println("500원 또는 100원만 넣어주세요.");
				}
				break;

			case 2: // 음료선택
				// 어떤 음료가 있는지
				// 음료에 번호를 선언해주기
				// 음료가 얼마인지
				// 음료 선택
				// 음료를 몇개 출력할 것 인지
				// 500원 이상 동전을 넣었는지
				// 음료의 재고가 있는지
				System.out.println("1.사이다(500원) 2.콜라(500원) 3.커피(1000원)");
				int choice = scan.nextInt();
				for(int i=1; i<4; i++) {
					if(choice == i) {
						if(drinkGa[i-1] == 0) {
							System.out.println("재고없음");
						}else {
							if (choice == 3 && totalcoin < 1000) {
								System.out.println("잔액부족");
							} else {
								if (totalcoin >= 500) {// totalcoin이 500원 이상인지
									for (int j = 1; j < 4; j++) {
										if (choice == j) {// 선택한 음료가 맞으면 totalcoin에서 빼기
											System.out.println(drinkName[j - 1]);
											totalcoin -= drinkPrice[j - 1];
											
											drinkGa[i-1] -= 1;
									
											
											System.out.println(drinkGa[i-1]);
											System.out.println("총잔액 : "+ totalcoin);
											
										}
									}
									
								} else {
									System.out.println("잔액부족");
								}
							}
							
						}
						
						
					}
				}
				break;

			case 3: // 재고
				//최종적으로 재고가 몇개 남았는지 확인하는 창
				//
			case 4: // 동전반환
				//500원 몇개 100원 몇개 나오는지
			case 99: // 시스템 종료
				done = false;
				System.out.println("종료");
				break;
			default: // 그 외의 값 입력
				System.out.println("없는 메뉴입니다.");
			}

		}

	}

}
