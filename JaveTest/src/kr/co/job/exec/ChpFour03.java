
package kr.co.job.exec;

import java.util.Scanner;

public class ChpFour03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		char ch = 'c';
//		System.out.println("�Է��Ͻÿ� : ");
//		ch = scan.nextLine().charAt(0);
//
//		if (ch == 'x' || ch == 'X') {
//			System.out.println("ture");
//		} else {
//			System.out.println("false");
//		}

		// 4-2�� 1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
		// int sum = 0;
		// for(i=0; i<=20; i++) {
		// if(!%2 !=0 && !%3 !=0) {
		// sum = sum + i;

		// }
		// }

		// 4-3�� 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10))�� ����� ��Ÿ���ÿ�.
//		int sum = 0;
//		int totalsum = 0;
//		
//		for(int i=1; i<=9; i++) {//i�� 1���� 9�����ϱ� 1�� �þ�鼭 9���� �þ. 
//			sum = sum+i; //1=0+1, 3=1+2, 6=3+3, 10=6+4...
//			totalsum += sum; // ���� ���� ����� ����
//		}
//		System.out.println(sum);
//		System.out.println(totalsum);
//		System.out.println(sum+totalsum);
		// ?? ���� �ǹٸ��� ���� �� ����

		// 4-4���� 1+(-2)+3+(-4)+...�� ���� ������ ��� ���س����� ��, ����� ���ؾ� ������ 100�̻��� �Ǵ��� ���Ͻÿ�.
//		int sum=0;
//		int i=0;
//		
//		while (sum<100) {//for��=>int i=0, sum=0, s=-1 // for(i=1; sum>=100; i++){ // sum=sum+i *(s*(-1)); // if(sum>100) // break; // } // sysout(i);
//			i++;//ó�� ��, �� ������ ���� �޶���
//			if(i%2==1) {
//				sum += i; // i�� Ȧ�����
//			}else{
//				sum -= i; // i�� ¦�����
//			}
//			
//		} System.out.println(sum);
//		System.out.println(i);

		// 4-6���� �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. //random���?
//		int dice1 = 0;
//		int dice2 = 0;
//		int sum = 0;
//		
//		
//		//�ֻ����� 1~6������ ���ڸ� ������ ����
//		for(dice1=1; dice1<=6; dice1++) {
//			for(dice2=1; dice2<=6; dice2++) {
//				if(dice1+dice2==6) {
//					System.out.print("ù��° �ֻ����� �� : "+dice1);
//					System.out.print("\n�ι�° �ֻ����� �� : "+dice2);
//					sum = dice1+dice2;
//					System.out.println("\n"+dice1+"+"+dice2+"="+sum);
//				}					
//				}
//				

//			}
//		
		// 4-7 Math.random()�� �̿��ؼ� 1���� 6������ ������ ������ ���� value�� �����ϴ� �ڵ带 �ϼ��϶�.

//		int value = (int) (Math.random() * 6) + 1; // 0�� �� �����°�==? +1 , 6�� �� �ȳ����°���..?
//		System.out.println(value); 
//		//The end

		// 4-8 ������ 2x+4y=10�� ��� �ظ� ���Ͻÿ�.
		// ��, x�� y�� �����̰� ������ ������ 0<=x<=10, 0<=y<=10 �̴�.
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

		// 4-9 ���ڷ� �̷���� ���ڿ� str�� ���� ��, �� �ڸ��� ���� ���� ����� ����ϴ� �ڵ带 �ϼ��϶�.
		// ���� ���ڿ��� '12345' ��� 1+2+3+4+5�� ����� 15�� ����� �Ǿ���Ѵ�.
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i<str.length(); i++) {
//			sum = sum + str.charAt(i)-48; //sum = sum + i
//			//charAt "12345"0��° ��ġ�� ã����
//			//str�� . �ٿ��ָ� charAt�Լ��� �ҷ��帱�� ����
//		}
//		System.out.println(sum);

		// 4-10 intŸ���� ����num�� ���� ��, �� �ڸ��� ���� ���� ����� ����϶�.
		// num���� 12345 1+2+3+4+5�� ����� 15�� ����϶�
//		int num = 12345;
//		int sum = 0;
//		int temp = 0; //���� �ʱⰪ 12345�� �״�� ����ϰ� ������ ������ �ϳ��� ������ �ش�.
//		
//		temp = num;//num�� temp�̴�.
//		
//		while(temp!=0) {//(num>0) num�ڸ��� temp�� �� �־��ش�.
//			sum += temp%10;
//			temp /= 10; 
//			
//		}//while���� �ۿ����� num���� �Է����ش�.
//		
//		System.out.println("sum= "+sum);
//		System.out.println("num= "+num);
//		
//		 4-11 �Ǻ���ġ ������ ���� �� ���� ���ؼ� ���� ���� ����� ������ �����̴�.
//		 1�� 1���� �����ϴ� �Ǻ���ġ ������ 10��° ���� �����ΰ� (�߿�!!!) - �ٽ� Ǯ������!
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
//		}System.out.println("\n10��° ���� : "+num3);
		
		
		

		// 4-13 �־��� ���ڿ��� ���������� �Ǻ��϶�.- �ٽ� Ǯ������!
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		int sum = 0;
//
//		// �ݺ����� charAt(i)�� �̿��ؼ� ���ڿ��� ���ڸ�
//		// �ϳ��� �о �˻��Ѵ�.
//		for (int i = 0; i < value.length(); i++) {
//			ch = value.charAt(i);	
			
//		}
		
		
		// 4-14 ���ڸ��߱� ����.- �ٽ� Ǯ������!
		// 1�� 100������ ���� �ݺ������� �Է��ؼ� ��ǻ�Ͱ� ������ ���� ���߸� ������ ����.
		// ����ڰ� ���� �Է��ϸ�, ��ǻ�ʹ� �ڽ��� ������ ���� ���ؼ� ����� �˷���.
		// ����ڰ� ��ǻ�Ͱ� ������ ���ڸ� ���߸� ������ ������ �� �� ���� ���ڸ� �­����� �˷���.
		
		
//		int number = 12321;
//		// number => ���ڿ��� �����Ѵ�.str
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
		  
		  
		  
		 
		
		
		
		
		
		// 4-15 ȸ������ ���Ͻÿ�- �ٽ� Ǯ������!
		// ȸ������ ���ڸ� �Ųٷ� ����� ������ �д� �Ͱ� ���� ���� ���Ѵ�.
		// ex)12321�̳� 13531���� ���� ���Ѵ�.
		int number = 12321;
		// number => ���ڿ��� �����Ѵ�.str
		String str = number + "";
		String str2 = "";
		
		// ������ ���ڿ��� �������� ����(����)�Ѵ�. str2
		for(int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
			System.out.println(str2);
		}	
		//str.equals(str2)
		if(str.equals(str2)) {
			System.out.println(number+"�� ȸ�����Դϴ�.");
		}else {
		System.out.println(number+"�� ȸ������ �ƴմϴ�.");
		}
		
		
	}

}
