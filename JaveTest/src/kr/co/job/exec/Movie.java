/*문제.  모바일 온라인 영화예매 사이트는 어느 영화관이든 인터넷으로 온라인 티켓예매를 할 수 있도록 하여 빠르고 간편하게 예매할 수 있도록 예매 정보시스템을 구축하기로 하였다.
 * 1. 각 회원은 회원번호로 식별되며 이름,주민번호,주소,핸드폰번호,메일주소, 좋아하는 장르에 대한 정보를 가지고 있다.
 * 완성되면 회원가입까지 만들어보자
 */

package kr.co.job.exec;

import java.util.Scanner;

public class Movie {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int number = 12345;
		String name = "위지윤";
		int birthDate = 970610;
		String address = "경기도 수원시 권선구";
		String cellPhone = "010-2606-1355";
		String mail = "m0506ji@namnam.com";
		
		String ilikeGenre = "SF";
		String lately = "콰이어트 플레이스2";
		String movieBasket = "발신제한, 블랙위도우";
		
//		String choose = scan.nextLine();
		System.out.print("[로그인]\n회원번호를 입력해주세요 : ");
		boolean movie = true;
		boolean menu2 = true;
		while (movie) {
			menu2=true;
			int menu = 0;
			
			number = scan.nextInt();
			if (number == 12345) {
//				choose = scan.nextLine();
				System.out.println("성함 : " + name + "\n회원번호 : " + number + "\n주민번호 : " + birthDate + "\n주소 : " + address
						+ "\n핸드폰번호 : " + cellPhone + "\n메일주소 : " + mail);
				System.out.println("------------------------------------------------");
				System.out
				.println("좋아하는 장르 : " + ilikeGenre + "\n최근에 본 영화 : " + lately + "\n내가 찜한 영화 : " + movieBasket);
				System.out.print("\n수정사항이 있으십니까? \n1.예 2.아니오\n=>");
				menu = scan.nextInt();
				
				while (menu2) {
					System.out.println("-------------------[수정목록]--------------------");
					System.out.println("1.이름 2.주소 3.핸드폰번호 4.메일주소 5.없음");
					System.out.println("-----------------------------------------------");
					
					switch (menu) {
					case 1:
						
						int repair = 0;
						repair = scan.nextInt();
						
						switch (repair) {
						
						case 1:
							scan.nextLine();//이해할 필요 있음
							System.out.print("기존이름 : " + name + "\n변경할 이름 : ");
							if (name.equals("위지윤")) {
								String a = name;
								a = scan.next();
								System.out.println(a);
							}
							break;
							
						case 2:
							scan.nextLine();
							System.out.print("기존주소 : " + address + "\n변경할 주소 : ");
							if (address.equals("경기도 수원시 권선구")) {
								String b = address;
								b = scan.nextLine();
								System.out.println(b);// 경기도 오산시 라고 입력하니가 경기도만 뜸 nextLine으로해도 안됨...
							}
							break;
							
						case 3:
							System.out.print("기존핸드폰 번호 : " + cellPhone + "\n변경할 번호 : ");
							if (cellPhone.equals("010-2606-1355")) {
								String c = cellPhone;
								c = scan.next();
								System.out.println(c);// 경기도 오산시 라고 입력하니가 경기도만 뜸 nextLine으로해도 안됨...
							}
							break;
							
						case 4:
							System.out.print("기존메일주소 : " + mail + "\n변경할 메일주소 : ");
							if (mail.equals("m0506ji@namnam.com")) {
								String d = mail;
								d = scan.next();
								System.out.println(d);
							}
							break;
							
						case 5:
							
							System.exit(0);//movie=false; && menu2=false;
							
							break;
							
						default :
							break;
						
							
						}
						break;
					case 2:
						System.out.println("반갑습니다." + name + "님");// 바꾼 이름(b)으로 넣고싶음
						break;
						
					default:
						System.out.println("회원번호가 옳바르지 않습니다. 다시 입력해주세요ㄱ");
					}
					
					
					
//					menu2 = false;
//					break;
					
				} 
			}
				else {
					System.out.println("회원번호가 옳바르지 않습니다. 다시 입력해주세요");// 회원번호가 다른번호일경우 다시 로그인창이 떠야하는데 안뜸
					break;
				} // 다시 로그인하면 바뀐 정보들이 나와야함
			
		}
	}
}