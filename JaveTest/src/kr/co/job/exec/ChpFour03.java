
package kr.co.job.exec;

import java.util.Scanner;

public class ChpFour03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		char ch = 'c';
//		System.out.println("입력하시오 : ");
//		ch = scan.nextLine().charAt(0);
//
//		if (ch == 'x' || ch == 'X') {
//			System.out.println("ture");
//		} else {
//			System.out.println("false");
//		}

		// 4-2번 1부터 20까지의 정수 중에서 2또는 3의 배수가 아닌 수의 총합을 구하시오.
		// int sum = 0;
		// for(i=0; i<=20; i++) {
		// if(!%2 !=0 && !%3 !=0) {
		// sum = sum + i;

		// }
		// }

		// 4-3번 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10))의 결과를 나타내시오.
//		int sum = 0;
//		int totalsum = 0;
//		
//		for(int i=1; i<=9; i++) {//i는 1부터 9까지니까 1씩 늘어가면서 9까지 늘어남. 
//			sum = sum+i; //1=0+1, 3=1+2, 6=3+3, 10=6+4...
//			totalsum += sum; // 위에 나온 계산의 총합
//		}
//		System.out.println(sum);
//		System.out.println(totalsum);
//		System.out.println(sum+totalsum);
		// ?? 답이 옳바르지 않은 것 같음

		// 4-4문제 1+(-2)+3+(-4)+...과 같은 식으로 계속 더해나갔을 때, 몇까지 더해야 총합이 100이상이 되는지 구하시오.
//		int sum=0;
//		int i=0;
//		
//		while (sum<100) {//for문=>int i=0, sum=0, s=-1 // for(i=1; sum>=100; i++){ // sum=sum+i *(s*(-1)); // if(sum>100) // break; // } // sysout(i);
//			i++;//처리 전, 후 에따라 값이 달라짐
//			if(i%2==1) {
//				sum += i; // i가 홀수라면
//			}else{
//				sum -= i; // i가 짝수라면
//			}
//			
//		} System.out.println(sum);
//		System.out.println(i);

		// 4-6문제 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오. //random사용?
//		int dice1 = 0;
//		int dice2 = 0;
//		int sum = 0;
//		
//		
//		//주사위는 1~6까지의 숫자를 가지고 있음
//		for(dice1=1; dice1<=6; dice1++) {
//			for(dice2=1; dice2<=6; dice2++) {
//				if(dice1+dice2==6) {
//					System.out.print("첫번째 주사위의 수 : "+dice1);
//					System.out.print("\n두번째 주사위의 수 : "+dice2);
//					sum = dice1+dice2;
//					System.out.println("\n"+dice1+"+"+dice2+"="+sum);
//				}					
//				}
//				

//			}
//		
		// 4-7 Math.random()을 이용해서 1부터 6사이의 임의의 정수를 변수 value에 저장하는 코드를 완성하라.

//		int value = (int) (Math.random() * 6) + 1; // 0이 왜 나오는가==? +1 , 6은 왜 안나오는거죠..?
//		System.out.println(value); 
//		//The end

		// 4-8 방정식 2x+4y=10의 모든 해를 구하시오.
		// 단, x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10 이다.
//		int x = 0;
//		int y = 0;
//		
//		for(x=0; x<=10; x++) {
//			for(y=0; y<=10; y++) {
//				if((2*x)+(4*y)==10) {
//					System.out.print("x : "+x);
//					System.out.println(", y : "+y);
//				}
//			}
//		}

		// 4-9 숫자로 이루어진 문자열 str이 있을 때, 각 자리의 합을 더한 결과를 출력하는 코드를 완성하라.
		// 만약 문자열이 '12345' 라면 1+2+3+4+5의 결과인 15를 출력이 되어야한다.
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i<str.length(); i++) {
//			sum = sum + str.charAt(i)-48; //sum = sum + i
//			//charAt "12345"0번째 위치를 찾아줌
//			//str의 . 붙여주면 charAt함수를 불러드릴수 있음
//		}
//		System.out.println(sum);

		// 4-10 int타입의 변수num이 있을 때, 각 자리의 합을 더한 결과를 출력하라.
		// num값이 12345 1+2+3+4+5의 결과인 15를 출력하라
//		int num = 12345;
//		int sum = 0;
//		int temp = 0; //만약 초기값 12345를 그대로 출력하고 싶으면 변수를 하나더 선언해 준다.
//		
//		temp = num;//num이 temp이다.
//		
//		while(temp!=0) {//(num>0) num자리에 temp로 다 넣어준다.
//			sum += temp%10;
//			temp /= 10; 
//			
//		}//while수식 밖에서는 num으로 입력해준다.
//		
//		System.out.println("sum= "+sum);
//		System.out.println("num= "+num);
//		
//		 4-11 피보나치 수열은 앞을 두 수를 더해서 다음 수를 만들어 나가는 수열이다.
//		 1과 1부터 시작하는 피보나치 수열의 10번째 수는 무엇인가 (중요!!!) - 다시 풀엉보기!
//		 1,1,2,3,5,8,13,21...
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1+","+num2);
//		
//		for(int i=0; i<8; i++) {
//			num3 = num1+num2;
//			num1=num2;
//			num2=num3;
//						
//			System.out.print(","+num3);
//		}System.out.println("\n10번째 수는 : "+num3);
		
		
		

		// 4-13 주어진 문자열이 숫자인지를 판별하라.- 다시 풀엉보기!
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		int sum = 0;
//
//		// 반복문과 charAt(i)를 이용해서 문자열의 문자를
//		// 하나씩 읽어서 검사한다.
//		for (int i = 0; i < value.length(); i++) {
//			ch = value.charAt(i);	
			
//		}
		
		
		// 4-14 숫자맞추기 게임.- 다시 풀엉보기!
		// 1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값을 맞추면 게임이 끝남.
		// 사용자가 값을 입력하면, 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려줌.
		// 사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췃는지 알려줌.
		
		
//		int number = 12321;
//		// number => 문자열로 변경한다.str
//		String str = number + "";
//		String str2 = "";
//		
//		  int i = str.length();
//		  while(i == 0){
//			 
//		  
//		  i--;
//		  
//		  }
//		  
		  
		  
		  
		 
		
		
		
		
		
		// 4-15 회문수를 구하시오- 다시 풀엉보기!
		// 회문수란 숫자를 거꾸로 ㅇ릭어도 앞으로 읽는 것과 같은 수를 말한다.
		// ex)12321이나 13531같은 수를 말한다.
		int number = 12321;
		// number => 문자열로 변경한다.str
		String str = number + "";
		String str2 = "";
		
		// 변경한 문자열을 역순으로 저장(대입)한다. str2
		for(int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
			System.out.println(str2);
		}	
		//str.equals(str2)
		if(str.equals(str2)) {
			System.out.println(number+"는 회문수입니다.");
		}else {
		System.out.println(number+"는 회문수가 아닙니다.");
		}
		
		
	}

}
