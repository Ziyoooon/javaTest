package kr.co.job.oper;

public class WhileTest02 {

	public static void main(String[] args) {
		//1���� 10������ �� ����
		int i =1;
		int sum = 0;
		while(true) {
			sum += i; // sum = sum + i
			i++;
			if(i>=10) { // if(i==10) , if(i>=9)����̸� 9���� ũ�ų� ������ ����ٴ� ���̴ϱ� 9������ ���� ������. 
				break;
			}
		}
		
		System.out.println("i = "+ i +" sum = " + sum);
		
		/*System.out.println("---------------------------------");
		//1���� 10������ ���� ������
		//�� while�� ����� �� ����
		
		int i = 1;
		int sum = 0;
		
		while(i<=10) {
			sum += i;
			System.out.println(i);
			i++; // �̰� �߿�
			
		}
		System.out.println("�� : " + sum);
		*/	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
