/*
 *10개 배열을 생성하여 배열의 값을 0~9까지 순차적을 ㅗ초기화하고
 *해당 배열값을 섞어보기 
 */
package kr.co.job.array;

import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] num = new int[10];
//		for(int i=0; i<num.length; i++) {
//			num[i]=i; //배영ㄹ을 0~9 숫자로 초기화
//			System.out.println(num[i]);
//		}

		// 1.임의의 인덱스값 추출-> n(배열의 몇번째인지)
		// 2numArr[n](배열의 번째) 0번째 인덱스 배열을 tmp에 옮기고 0번째 인덱스 배열에 추출된 n배값을 대입
		// n배열값에 tmp대입
		// 3.1번2번을 100번정도 반복함

		// int[] numArr = new int[10];//10개의 칸을 만들라고 하시는줄은 몰랐네....ㅠㅠ
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

		// 1. 임의의 인덱스값 추출-> n(배열의 몇번째인지)
		// 2. numArr[n](배열의 n번째안에 있는 숫자), 0번째 인덱스 배열을 tmp에 옮기고 0번째 인덱스 배열에 추출된 n배값을 대입
		// n배열값에 tmp대입
		// 3. 1번2번을 100번정도 반복함

//		int[] numArr = new int[10]; //10개의 배열을 가지고 있음
//		int n= 0; //n번째
//		int temp = 0; //바구니
//		
//		
//		for(int i=0; i<numArr.length; i++) {
//			numArr[i]=i; // i는 숫자 0~9까지 배열의 n째를 나타내줌 순서대로(i++ 하나씩 늘어나므로) 
//			System.out.println(numArr[i]);
//		}
//		for(int i=1; i<100; i++) {
//			n=(int)(Math.random()*10);//10개의 n번째를 100번 섞어서 새로운n번째 탄생
//			
//			temp=numArr[0];
//			numArr[0]=numArr[n];
//			numArr[n]=temp;
//			
//		}
//		System.out.println(Arrays.toString(numArr));//Arrays.toString을 사용하지않는 이상 numArr의 값은 나오지 않음. 왜지?

		int[] numArr = new int[100]; 
		int n = 0; 
		int temp = 0;
		int cnt = 0, line=10;
		// 한줄당 10개씩 출력
		for (int i = 0; i < numArr.length; i++) {
			   numArr[i] = i; //배열을 0~9 숫자로 초기화
			   System.out.print(numArr[i]+",");
			   cnt++;
			   if(cnt == line) {
				   System.out.println();
				   cnt=0;
			   }
			
		}
		for (int i = 1; i < 1000; i++) { // 1000회
			n = (int) (Math.random() * 100);

			temp = numArr[0];
			numArr[0] = numArr[n];
			numArr[n] = temp;

		}
		System.out.println(Arrays.toString(numArr));// Arrays.toString을 사용하지않는 이상 numArr의 값은 나오지 않음. 왜지?

	}

}
