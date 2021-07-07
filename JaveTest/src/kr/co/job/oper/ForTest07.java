package kr.co.job.oper;

public class ForTest07 {

	public static void main(String[] args) {
		System.out.println("------줄칸 또는 행열에 대하여------");
		for(int i=1; i<=4; i++) { //i : 줄
		
			for(int j=1; j<=i; j++) { //j : 별의 갯수
				System.out.print("*");
			}
			System.out.println();
	}
	
		//난수 발생 : Math.random()-0~0.9999의 임의의 수를 하나 발생시킴.
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		int num = 0;
		num = (int)(Math.random()*10); //0~9
		System.out.println(num);
		
		//1~10사이의 수 발생
		num = (int)(Math.random()*10)+1; // 궁금한점 (int) 왜 따로 가로를 만들어서 int를 써주어야 하며/ 맨 마지막 +1은 왜 넣는가(0부터 시작하기 때문에)
		System.out.println(num);
		
		//1~45사이의 수 발생
		num = (int)(Math.random()*45)+1;
		System.out.println(num);
		
		//11~13사이의 수 발생
		for( int i=1; i<=10; i++) { //왜 for문이 나오는가 ==> 11에서 13사이에값이 정말나오는지 10회 돌려봄 =while(i<=10)
			num = (int)(Math.random()*3)+11;
			System.out.println(num);
			
		}
				
		
}
}