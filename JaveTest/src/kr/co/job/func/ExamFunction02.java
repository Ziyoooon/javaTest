/* 함수만들어서 사용하기
 * 두수를 입력받아서 더하기, 빼기, 곱하기, 나누기를 구하는 메소드
 * void plusV(int n1, int n2);
 * minusV(), mu1V, divV() => 메소드(함수) 이름
 * 
 */
package kr.co.job.func;

public class ExamFunction02 {

	public static void main(String[] args) {
		
		
//		// 3,5의 합구하기
//		int sum = plusV(3,5);
//		System.out.println("3+5 : "+sum);
//		
//		// 3,10의 뺄샘
//		minusV(3,10);
//		
//		//5,4의 곱셈
//		mulV(5,4);
//		
//		//2, 8의 나누셈 
//		divV(2,8);
//
//	    
//	}
//
//	
//	private static void divV(int i, int j) {
//		// i/j로 나눠야하는데 값이 안나옴 그러면 if로 조건문사용
//		System.out.println("두수의 나눗셈 : "+(j/i));
//	}
//
//
//	private static void mulV(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println("두수의 곱셈 : "+(i*j));
//	}
//
//	private static void minusV(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println("두수를 빼기 : "+(j-i));
//		
//	}
//
//	private static int plusV(int i, int j) {
//		// return을 사용하는 이유는 다시 사용하기 위해서 하지만 return은 한개만 사용 2개이상안됨
//		// 모든 메소드는 return을 사용하는 것이 좋다
//		return i+j; //또는 private static void plusV로 sysout("i+j");해도 됨.
		
		
//-------------------------------------------------------------------		
		/* 함수만들어서 사용하기
		 * 두수를 입력받아서 더하기, 빼기, 곱하기, 나누기를 구하는 메소드
		 * void plusV(int n1, int n2);
		 * minusV(), mu1V, divV() => 메소드(함수) 이름
		 * 
		 */
		
		
		// 3,5의 합구하기
		int sum = plusV(3,5);
		System.out.println("두수의 합은 : "+sum);
        // 3,10의 뺄샘
		int minus = minusV(3,10);
		System.out.println("두수의 뺀 나머지는 : "+minus);
	
		// 5,4의 곱셈
		int multiply = mu1V(5,4);
		System.out.println("두수의 곱셈값 : "+multiply);
		
    	// 2, 8의 나누셈 
		int division = divV(2,8);
		System.out.println("두수의 몫은 : "+division);//몫이 나오게 하고싶다
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//end

	private static int divV(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1/n2;
	}

	private static int mu1V(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1*n2;
		
	}

	private static int minusV(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
		
	}

	private static int plusV(int n1, int n2) {
		// TODO Auto-generated method stub
		//System.out.println("두수의 합은 : "+(n1+n2)); //해도 되고
		return n1+n2;
		
		
	}

	
}
