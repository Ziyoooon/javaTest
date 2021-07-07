package kr.co.job.exec;

import java.util.Scanner;

public class project_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String drinkName[] = { "사이다", "콜라", "커피" };
		int drinkPrice[] = { 500, 500, 1000 };
		int drinkGa[] = { 0, 5, 5 };
		int chooce = 0;
		int totalcoin = 0;

		boolean done = true;
		while (done) {
			System.out.println("-----------------------[Menu]----------------------");
			System.out.println("1.동전투입 2.음료선택 3.음료남은개수 4.거스름돈 99.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("번호를 입력해주세요 : ");
			int menu = 0;
			menu = scan.nextInt();

			switch (menu) {

			case 1:
				// 동전투입
				// 동전이라고 정의가 되어있기 때문에 100원 또는 500원을 넣어야함.
				// 몇개의 동전을 넣었는가
				// 입력한 동전의 수가 총 얼마인가
				//
				System.out.print("500원 또는 100원의 동전을 넣어주세요 : ");
				int coin = 0;
				coin = scan.nextInt();

				if (coin == 100 || coin == 500) {
					totalcoin = totalcoin + coin; // taotalcoin += coin;
					System.out.println("총합계 :" + totalcoin + "원");

				} else {
					System.out.println("100원 또는 500원 동전을 넣어주세요");
				}
				break;

			case 2: // 음료수선택
				// 음료수가 몇번인지
				// 음료수가 얼마인지
				// 얼마 남았는지
				// 잔액이 부족할 시 동전을 넣어주세요 입력하기
				// 재고가 몇개 남았는지
				System.out.println("1.사이다(500원) 2.콜라(500원) 3.커피(1000원) 4.취소");
				System.out.println("현재 자판기에 넣은 돈 : " + totalcoin);
				System.out.print("음료의 번호를 선택하여 주세요 : ");
				chooce = scan.nextInt();

				if (chooce == 4) {
					System.out.println("종료");
					break;
				} else {

					if (totalcoin < drinkPrice[chooce - 1]) { // 돈이 부족해서 못산다
						System.out.println("돈이 부족합니다. 동전을 더 넣어주세요.");
					} else if (totalcoin >= drinkPrice[chooce - 1]) { // 살수 있다
						System.out.println("원하는 음료가 구매가능합니다.");

						if (drinkGa[chooce - 1] <= 0) { // 재고 없다
							System.out.println("현재 재고물량이 없습니다.");
						} else {
							totalcoin -= drinkPrice[chooce - 1]; // 총 금액에서 음료 금액이 뻬짐
							System.out.println("음료종류 : " + drinkName[chooce - 1] + " /  남은 금액 : " + totalcoin + "원");
							drinkGa[chooce - 1]--;// drinkGa[i-1]-1;
							System.out.println("남은 음료의 물량 : " + drinkGa[chooce - 1] + "개");
						}
					}

					break;

//				for (int i = 1; i <= drinkName.length; i++) {// 0부터 시작하니까 i=0으로 먼저 시작하는거 아닌가 근데 왜 앞에서는 i는 1로 시작했을까
//					if (totalcoin < drinkPrice[i-1]) { // 총 잔액이 음료 가격보다 작다면
//						System.out.println("돈 부족");
//					} else if (totalcoin >= drinkPrice[i-1]) { // 총 잔액이 음료 가격보다 크다면
//						if (chooce == i) {// 남은재고와 잔돈이 얼마 남았는지
//							totalcoin -= drinkPrice[i-1]; // 총 금액에서 음료 금액이 뻬짐
//							System.out.println(drinkName[i-1]+totalcoin);
//
//							drinkGa[i-1]--;// drinkGa[i-1]-1;
//							System.out.println(drinkGa[i-1]);
//						}
//					}
				}

			case 3: // 남은 음료 개수
				// 원하는 음료의 번호를 선택하면 그 번호의 음료가 몇개 남았는지
				// 그외 나머지 번호는 다른 번호로 입력을 하라고 떠야하는지
				System.out.println("1.사이다(500원) 2.콜라(500원) 3.커피(1000원)");
				System.out.print("확인하고 싶은 음료의 번호를 입력하세요 : ");
				chooce = scan.nextInt();
				if (chooce <= drinkGa.length) {
					System.out.println("남은 음료 개수 : " + drinkGa[chooce - 1] + "개");
				} else {
					System.out.println("음료의 번호를 다시 선택하세요.");// 다른 번호를 누르게 될 경우 다시 다시 위로 올라가야하는거 아닌가
				}

				break;
			case 4: // 거스름돈
				// 총 넣은 동전의 합에서 음료의 가격을 뺀 나머지 금액

				System.out.println("거스름돈 : " + totalcoin + "원");

				break;

			case 99: // 종료
				System.out.println("종료하겠습니다.");
				done = false;
				break;

			default:
				System.out.println("메뉴를 다시 선택해주세요.");
				break;

			}
		}

		// TODO Auto-generated method stub

	}

}
