package kr.co.job.array;

public class ArrayTest07 {

	public static void main(String[] args) {
		// 문자에 맞는 바이너리코드값 찾기
		//p208 예제5-13문제
		char[] hex = { 'C', 'A', 'F', 'E', '8'};

		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };

		String result = "";

		for (int i = 0; i < hex.length; i++) {
			if (hex[i] >= '0' && hex[i] <= '9') {
				result += binary[hex[i] - '0'];
			} else {
				result += binary[hex[i] - 'A' + 10];
			}
		}
		System.out.println("hex : "+new String(hex));
		System.out.println("binary : "+result);
		
		
//		char[] hex = { 'C', 'A', 'F', 'E' };
//
//		String[] binary = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
//				"1011", "1100", "1101", "1110", "1111" };
//
//		String result = "";
//		int index = 0;
//		
//		for (int i = 0; i < hex.length; i++) {
//			if (hex[i] >= '0' && hex[i] <= '9') {
//				index = hex[i]-'0';
//			} else {
//				index = hex[i] - 'A' + 10;
//			}
//			result = result + binary[index];
//		}
//		System.out.println("hex : "+new String(hex));
//		System.out.println("binary : "+result);
		
		
		
		
		
		
		
		
		
	}

}
