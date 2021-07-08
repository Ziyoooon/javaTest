package kr.co.job.array;

import java.util.Scanner;

public class ArrayTest06 {

	public static void main(String[] args) {
		final int SIZE = 5; //final 고정이라는 뜻 변수가 바뀌지 않음
		String[] name = new String[SIZE];//final은 대문자
		Scanner scan = new Scanner(System.in);
		
		// 이름 입력받기
		
		for(int i=0; i<SIZE; i++) {
			System.out.print("이름: ");
			name[i]=scan.next();
		}
		// 배열값 출력하기 -(랜덤)한개만
		int r=(int)(Math.random()*SIZE);
			System.out.println(name[r]);
	}

}
