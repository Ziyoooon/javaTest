/* �Լ����� ����ϱ�
 * �μ��� �Է¹޾Ƽ� ���ϱ�, ����, ���ϱ�, �����⸦ ���ϴ� �޼ҵ�
 * void plusV(int n1, int n2);
 * minusV(), mu1V, divV() => �޼ҵ�(�Լ�) �̸�
 * 
 */
package kr.co.job.func;

public class ExamFunction02 {

	public static void main(String[] args) {
		
		
//		// 3,5�� �ձ��ϱ�
//		int sum = plusV(3,5);
//		System.out.println("3+5 : "+sum);
//		
//		// 3,10�� ����
//		minusV(3,10);
//		
//		//5,4�� ����
//		mulV(5,4);
//		
//		//2, 8�� ������ 
//		divV(2,8);
//
//	    
//	}
//
//	
//	private static void divV(int i, int j) {
//		// i/j�� �������ϴµ� ���� �ȳ��� �׷��� if�� ���ǹ����
//		System.out.println("�μ��� ������ : "+(j/i));
//	}
//
//
//	private static void mulV(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println("�μ��� ���� : "+(i*j));
//	}
//
//	private static void minusV(int i, int j) {
//		// TODO Auto-generated method stub
//		System.out.println("�μ��� ���� : "+(j-i));
//		
//	}
//
//	private static int plusV(int i, int j) {
//		// return�� ����ϴ� ������ �ٽ� ����ϱ� ���ؼ� ������ return�� �Ѱ��� ��� 2���̻�ȵ�
//		// ��� �޼ҵ�� return�� ����ϴ� ���� ����
//		return i+j; //�Ǵ� private static void plusV�� sysout("i+j");�ص� ��.
		
		
//-------------------------------------------------------------------		
		/* �Լ����� ����ϱ�
		 * �μ��� �Է¹޾Ƽ� ���ϱ�, ����, ���ϱ�, �����⸦ ���ϴ� �޼ҵ�
		 * void plusV(int n1, int n2);
		 * minusV(), mu1V, divV() => �޼ҵ�(�Լ�) �̸�
		 * 
		 */
		
		
		// 3,5�� �ձ��ϱ�
		int sum = plusV(3,5);
		System.out.println("�μ��� ���� : "+sum);
        // 3,10�� ����
		int minus = minusV(3,10);
		System.out.println("�μ��� �� �������� : "+minus);
	
		// 5,4�� ����
		int multiply = mu1V(5,4);
		System.out.println("�μ��� ������ : "+multiply);
		
    	// 2, 8�� ������ 
		int division = divV(2,8);
		System.out.println("�μ��� ���� : "+division);//���� ������ �ϰ�ʹ�
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		//System.out.println("�μ��� ���� : "+(n1+n2)); //�ص� �ǰ�
		return n1+n2;
		
		
	}

	
}
