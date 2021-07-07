package kr.co.job.oper;

public class WhileTest04 {

	public static void main(String[] args) {
		/*
		 *  While문과 Mate.random() 메소드를 이용
		 * 
		 *  1~6의 눈을 갖는 두개의 주사위를 던졌을 때
		 *  주사의 눈의 값을 (1주사위 눈, 2주사위 눈)형태로 출력하고
		 *  두개의 눈이 서로 다른 값이면 계속 주사위를 던지고
		 *  두개의 눈이 같으면 멈추는 코드 작성
		 */
		int dice1 = 0;
		int dice2 = 0;
		boolean done =true; // =true면 반복, boolean 을 지우고 break; 사용가능
		
		while(done) {
			
			dice1 = (int)(Math.random()*6)+1; // 1~6사이의 수 발생
			System.out.println("첫번째 주사위 :"+ dice1);
			
			dice2 = (int)(Math.random()*6)+1;
			System.out.println("두번째 주사위 :"+ dice2);
			
			if(dice1 == dice2)
				done = false; //done을 지우고 break; 사용하면 됨.
			System.out.println("두개의 주사위가 같은 수 : "+ done);
		}
		
		
		
	}

}
