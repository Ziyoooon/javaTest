package kr.co.job.oper;

public class WhileTest04 {

	public static void main(String[] args) {
		/*
		 *  While���� Mate.random() �޼ҵ带 �̿�
		 * 
		 *  1~6�� ���� ���� �ΰ��� �ֻ����� ������ ��
		 *  �ֻ��� ���� ���� (1�ֻ��� ��, 2�ֻ��� ��)���·� ����ϰ�
		 *  �ΰ��� ���� ���� �ٸ� ���̸� ��� �ֻ����� ������
		 *  �ΰ��� ���� ������ ���ߴ� �ڵ� �ۼ�
		 */
		int dice1 = 0;
		int dice2 = 0;
		boolean done =true; // =true�� �ݺ�, boolean �� ����� break; ��밡��
		
		while(done) {
			
			dice1 = (int)(Math.random()*6)+1; // 1~6������ �� �߻�
			System.out.println("ù��° �ֻ��� :"+ dice1);
			
			dice2 = (int)(Math.random()*6)+1;
			System.out.println("�ι�° �ֻ��� :"+ dice2);
			
			if(dice1 == dice2)
				done = false; //done�� ����� break; ����ϸ� ��.
			System.out.println("�ΰ��� �ֻ����� ���� �� : "+ done);
		}
		
		
		
	}

}
