/* ���๮1
 * while(����){
 * 		���๮2 => ������ ���̸� �����.
 * }
 * ���๮3
 * 
 */
package kr.co.job.oper;

public class WhileTest01 {

	public static void main(String[] args) {
		// 1���� 10������ ��
		int i = 1;
		int sum = 0;
		
		while(i<=10) {// = for(int i=1; i<=10; i++ �� ����
			sum += i; //sum = sum + i
			System.out.println(i);
			
			i++; // i++�� ������ �߿��ϴ�.
			
		}

		System.out.println("sum =" + sum);
	}

}
