package kr.co.job.oper;

public class WhileTest02 {

	public static void main(String[] args) {
		//1부터 10까지의 합 ①방법
		int i =1;
		int sum = 0;
		while(true) {
			sum += i; // sum = sum + i
			i++;
			if(i>=10) { // if(i==10) , if(i>=9)경우이면 9보다 크거나 같을때 멈춘다는 뜻이니까 9까지만 합이 구해짐. 
				break;
			}
		}
		
		System.out.println("i = "+ i +" sum = " + sum);
		
		/*System.out.println("---------------------------------");
		//1부터 10까지의 합을 구하자
		//단 while을 사용할 것 ②방법
		
		int i = 1;
		int sum = 0;
		
		while(i<=10) {
			sum += i;
			System.out.println(i);
			i++; // 이거 중요
			
		}
		System.out.println("합 : " + sum);
		*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
