/*[�޼ҵ� ȣ��]
 * ��� : Ư�����ڸ� Ƚ����ŭ ����ϴ� �޼ҵ� �����
 * 1.Ư������ 2.Ƚ��
 * �޼ҵ� �̸� : void printCharacter(char ch, int num); �޼ҵ����
 *   
 */
package kr.co.job.func;

public class ExamMethod01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printCharacter('*', 3);
		printCharacter('$', 10);
		printCharacter("hello", 10);

	}

	private static void printCharacter(String str, int num) {
		System.out.println("�ȳ� 10�� �ݺ�");
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
		System.out.println("����");
	}

	private static void printCharacter(char ch, int num) {
		System.out.println("�ݺ���� �ӹ� ����");
		for (int i = 0; i < num; i++) {
			System.out.println(ch);
		}
		System.out.println("\n�ݺ���� �ӹ� ����");

	}

}
