/*
 *10�� �迭�� �����Ͽ� �迭�� ���� 0~9���� �������� ���ʱ�ȭ�ϰ�
 *�ش� �迭���� ����� 
 */
package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = new int[10];
//		for(int i=0; i<num.length; i++) {
//			num[i]=i; //�迵���� 0~9 ���ڷ� �ʱ�ȭ
//			System.out.println(num[i]);
//		}

		// 1.������ �ε����� ����-> n(�迭�� ���°����)
		// 2numArr[n](�迭�� ��°) 0��° �ε��� �迭�� tmp�� �ű�� 0��° �ε��� �迭�� ����� n�谪�� ����
		// n�迭���� tmp����
		// 3.1��2���� 100������ �ݺ���

		// int[] numArr = new int[10];//10���� ĭ�� ������ �Ͻô����� ������....�Ф�
//		int[] numArr = new int[10];//int numArr[] = {0,1,2,3,4,5,6,7,8,9};
//		int n =0;
//		int tmp = 0;
//		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i]=i;
//			System.out.println(numArr[i]);
//		}
//		for(int i=1; i<100; i++) {
//			n=(int)(Math.random()*10);
//			
//			tmp = numArr[0];
//			numArr[0]=numArr[n];
//			numArr[n]=tmp;
//			
//		}
//		System.out.println(Arrays.toString(numArr));

		// 1. ������ �ε����� ����-> n(�迭�� ���°����)
		// 2. numArr[n](�迭�� n��°�ȿ� �ִ� ����), 0��° �ε��� �迭�� tmp�� �ű�� 0��° �ε��� �迭�� ����� n�谪�� ����
		// n�迭���� tmp����
		// 3. 1��2���� 100������ �ݺ���

//		int[] numArr = new int[10]; //10���� �迭�� ������ ����
//		int n= 0; //n��°
//		int temp = 0; //�ٱ���
//		
//		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i]=i; // i�� ���� 0~9���� �迭�� n°�� ��Ÿ���� �������(i++ �ϳ��� �þ�Ƿ�) 
//			System.out.println(numArr[i]);
//		}
//		for(int i=1; i<100; i++) {
//			n=(int)(Math.random()*10);//10���� n��°�� 100�� ��� ���ο�n��° ź��
//			
//			temp=numArr[0];
//			numArr[0]=numArr[n];
//			numArr[n]=temp;
//			
//		}
//		System.out.println(Arrays.toString(numArr));//Arrays.toString�� ��������ʴ� �̻� numArr�� ���� ������ ����. ����?

		int[] numArr = new int[100]; 
		int n = 0; 
		int temp = 0;
		int cnt = 0, line=10;
		// ���ٴ� 10���� ���
		for (int i = 0; i < numArr.length; i++) {
			   numArr[i] = i; //�迭�� 0~9 ���ڷ� �ʱ�ȭ
			   System.out.print(numArr[i]+",");
			   cnt++;
			   if(cnt == line) {
				   System.out.println();
				   cnt=0;
			   }
			
		}
		for (int i = 1; i < 1000; i++) { // 1000ȸ
			n = (int) (Math.random() * 100);

			temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;

		}
		System.out.println(Arrays.toString(numArr));// Arrays.toString�� ��������ʴ� �̻� numArr�� ���� ������ ����. ����?

	}

}
