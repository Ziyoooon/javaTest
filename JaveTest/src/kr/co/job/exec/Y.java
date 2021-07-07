package kr.co.job.exec;


import java.util.*;
import java.math.*;
public class Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int num = 0;
		Scanner scan = new Scanner(System.in);
//		boolean done = true;
//		int coin = 0;
//		System.out.println("돈을 넣어주세요 : ");
//		
//		while(done) {
//			System.out.println("------------------[MENU]------------------");
//			System.out.println("1.콜라[500] 2.사이다[500] 3.커피[1,000] 1.취소");
//			System.out.println("------------------------------------------");
//			System.out.println("음료선택 : ");
//			num = scan.nextInt();
//		
//			switch(num) {
//			
//			}
//		}
		int num = 0;
		String[] coffee = new String[3];
		for(int i =0; i<3; i++) {
			System.out.print((i+1)+"번째 커피종류: ");
			coffee[i] = scan.nextLine();
		}
		System.out.println("몇번째 커피 보여줄까?");
		num = scan.nextInt();
		System.out.println("너가 고른 커피는:"+coffee[num-1]);
		
	}

}
