package kr.co.job.oper;

import java.util.Scanner;

public class SwitchTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 0;
		Scanner scan = new Scanner(System.in);
		boolean done = true; // done이 참이면 실행, 거짓이면 종료				
		while(done) {
			System.out.println("--------------[메뉴]--------------");
			System.out.println("1.   2.   3.      99. 종료.");
			System.out.println("-----------------------------------");
			System.out.print("숫자 입력 : ");
			num = scan.nextInt();
			
			
			//두수의 합
			switch(num) {
			case 1:
				
				
				int a = 0;
				int b = 0;
				int able =0;
				
				System.out.println("첫번째 수 : ");
				a = scan.nextInt();
				
				System.out.println("두번째 수 : ");
				b = scan.nextInt();
				
				able= a+b;
				System.out.println("두수의 합 : " + able);
				break;
				
			// 단을 구하시오.	
			case 2:
				
				
				int dan = 0;
				int sum = 1;
				
				System.out.println("구할 단 : ");
				dan = scan.nextInt();
				
				for(int i=1; i<10; i++) {
					sum=dan*i;
					System.out.println(dan+"*"+i+"="+sum);
					
				}
				break;
			
			//입력받은수까지의 합	
			case 3:
				int num1=0;
				int sum2=0;
				System.out.print("숫자를 입력하세여:");
				num1 = scan.nextInt();
				
				for(int i=1; i<=num1; i++) {
					sum2=sum2+i;
				}
				System.out.println(sum2);
				break;
				
				
			//case3 = 입력한 수까지의 합을 구하시오.	
			case 4:
				int bin =0;
				int sum3 =0;
				
				System.out.println("입력한 수 :");
				bin = scan.nextInt();

				for(int i=1; i<=bin; i++) {
					sum3=sum3+i;
				}
				System.out.println(sum3);
				
				break;
				
			case 5:
				int x = 0;
				int y = 0;
				
				System.out.println("입력한 수 :");
				x = scan.nextInt();
				
				while(x<y) {
					
				}
				
			case 99:
				System.out.println("종료합니다.");
				done = false;
				break;
				
			default : // case 1,2,3 나머지
				System.out.println("넌 누구니~?");
				
			}
		}
	}

}
