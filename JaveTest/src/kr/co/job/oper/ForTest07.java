package kr.co.job.oper;

public class ForTest07 {

	public static void main(String[] args) {
		System.out.println("------��ĭ �Ǵ� �࿭�� ���Ͽ�------");
		for(int i=1; i<=4; i++) { //i : ��
		
			for(int j=1; j<=i; j++) { //j : ���� ����
				System.out.print("*");
			}
			System.out.println();
	}
	
		//���� �߻� : Math.random()-0~0.9999�� ������ ���� �ϳ� �߻���Ŵ.
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		int num = 0;
		num = (int)(Math.random()*10); //0~9
		System.out.println(num);
		
		//1~10������ �� �߻�
		num = (int)(Math.random()*10)+1; // �ñ����� (int) �� ���� ���θ� ���� int�� ���־�� �ϸ�/ �� ������ +1�� �� �ִ°�(0���� �����ϱ� ������)
		System.out.println(num);
		
		//1~45������ �� �߻�
		num = (int)(Math.random()*45)+1;
		System.out.println(num);
		
		//11~13������ �� �߻�
		for( int i=1; i<=10; i++) { //�� for���� �����°� ==> 11���� 13���̿����� ������������ 10ȸ ������ =while(i<=10)
			num = (int)(Math.random()*3)+11;
			System.out.println(num);
			
		}
				
		
}
}