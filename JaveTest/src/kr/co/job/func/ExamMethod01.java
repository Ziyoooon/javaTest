/*[메소드 호출]
 * 기능 : 특정문자를 횟수만큼 출력하는 메소드 만들기
 * 1.특정문자 2.횟수
 * 메소드 이름 : void printCharacter(char ch, int num); 메소드원형
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
		System.out.println("안녕 10개 반복");
		for (int i = 0; i < num; i++) {
			System.out.println(str);
		}
		System.out.println("종료");
	}

	private static void printCharacter(char ch, int num) {
		System.out.println("반복출력 임무 시작");
		for (int i = 0; i < num; i++) {
			System.out.println(ch);
		}
		System.out.println("\n반복출력 임무 종료");

	}

}
