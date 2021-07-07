package kr.co.job.exec;

import java.util.Scanner;

public class ddd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String drinkKind[] = { "사이다", "콜라", "커피" };
		int drinkMoney[] = { 1000, 1500, 2000 };
		int drinkCount[] = { 10, 10, 10 };

		boolean whole = true;
		while (whole) {
			System.out.println("-------------[전체메뉴]--------------");
			System.out.println("1.관리자 2.사용자 3.취소");
			System.out.println("--------------------------------");

			int wholeMenu = scan.nextInt();
			switch (wholeMenu) {

			case 1:// 관리자
				boolean admin = true;
				while (admin) {
					System.out.println("----------------[관리자 메뉴]-----------------");
					System.out.println("1.음료확인 2.재고 3.가격 99.취소");
					System.out.println("-------------------------------------------");

					int adminMenu = scan.nextInt();
					switch (adminMenu) {

					case 1: // 음료확인
						break;

					case 2: // 재고
						break;

					case 3: // 가격
						break;

					case 99: // 취소
						System.out.println("종료");
						admin = false;
						break; // 종료를 99번을 누르면 다시 전체메뉴가 나와야 되는거 아닌가요???

					default:
						System.out.println("다시 선택해주세요");
						break;
					}
				}
				break;

			case 2:// 사용자
				boolean don = true;
				int totalmoney = 0;

				while (don) {
					System.out.println("---------------[사용자 메뉴]-------------");
					System.out.println("1.돈투입 2.음료메뉴 3.재고 4.거스름돈 99.취소");
					System.out.println("--------------------------------------");

					int userMenu = scan.nextInt();

					switch (userMenu) {

					case 1: // 돈 투입
						// 돈을 얼마 넣을지 입력
						// 돈을 더 추가 적으로 입력할시 예 아니오로 작성할것
						// 예면 추가할 금액을 입력하고 합한 돈이 나와야함
						// 아니면 빠져나오기
						int money = 0;

						System.out.print("돈을 넣어주세요 : ");
						money = scan.nextInt();
						totalmoney += money;

						System.out.println("추가로 돈을 더 넣겠습니까?(예로 입력하시오) : ");
						String choose = scan.next();

						if (choose.equals("예")) {// 확인필요
							System.out.println("돈을 넣어주세요 :");
							money = scan.nextInt();
							totalmoney += money;
							System.out.println("총 자판기에 넣은 돈 : " + totalmoney + "원");

						} else {
							System.out.println("총 자판기에 넣은 돈 : " + totalmoney + "원");
						}
						//
						break;

					case 2: // 음료메뉴
						// 음료 메뉴가 나와야함(음료옆에 가격,재고 함께)
						// 원하는 종류와 개수를 선택한후 잔돈이 남아있다면 더 살 것 인가
						// yes하면 반복되게하고 no 빠져나오고
						// 빠져나오면 총 합이 나와야함
						// 예를 들어 사이다를 사고 잔돈이 남으면 다른 음료를 구매할 것 인가
						System.out.println("------------[음료 메뉴]-------------");

						for (int i = 0; i < drinkKind.length; i++) {
							System.out.print(
									(i + 1) + drinkKind[i] + "[" + drinkMoney[i] + "]" + "(" + drinkCount[i] + ") ");
						}
						System.out.println();

						System.out.println("원하는 음료를 선택해주세요 : ");
						int num = scan.nextInt();
						System.out.println("원하는 개수를 적어주세요 : ");
						int number = scan.nextInt();

						System.out.println("총 금액 : " + (drinkMoney[num - 1] * number));
						drinkCount[num - 1] -= number;

						totalmoney -= (drinkMoney[num - 1] * number);
						boolean boo = true;
						while (boo) {
							System.out.println("더 살거? 예 아니오");
							String chooce2 = scan.next();

							if (chooce2.equals("예")) {// chooce2.equals=="예"불가능한가?
								System.out.println("원하는 음료를 선택해주세요 : ");
								num = scan.nextInt();
								System.out.println("원하는 개수를 적어주세요 : ");
								number = scan.nextInt();

								System.out.println("총 금액 : " + (drinkMoney[num - 1] * number));
								drinkCount[num - 1] -= number;
								totalmoney -= (drinkMoney[num - 1] * number);
								System.out.println("총 남은 금액 : " + (totalmoney));
							} else if (chooce2.equals("아니오")) {
								// 내가 구매한 음료의 종류와 개수가 나와야한다 그리고 잔돈까지
								System.out.println("내가 산 음료의 종류, 개수 : ");
								
								boo = false;

							} else {
								System.out.println("다시 입력하여주세요");
							}
						}

						/*
						 * if(chooce2.equals("예")) {//chooce2.equals=="예"불가능한가?
						 * System.out.println("원하는 음료를 선택해주세요 : "); num = scan.nextInt();
						 * System.out.println("원하는 개수를 적어주세요 : "); number = scan.nextInt();
						 * 
						 * 
						 * System.out.println("총 금액 : "+(drinkMoney[num-1] * number));
						 * drinkCount[num-1]-=number; totalmoney -= (drinkMoney[num-1] * number);
						 * System.out.println("총 남은 금액 : "+(totalmoney)); }else
						 * if(chooce2.equals("아니오")) { //내가 구매한 음료의 종류와 개수가 나와야한다
						 * 
						 * }else { System.out.println("다시 입력하여주세요"); }
						 * 
						 */

						break;

					case 3: // 재고
						break;

					case 4: // 거스름돈
						break;

					case 99: // 취소
						System.out.println("취소");
						don = false;
						break;

					default:
						System.out.println("다시 입력해주세요");

					}
				}

				break;

			case 3:// 취소
				break;

			default:
				break;
			}

		}

	}

}
