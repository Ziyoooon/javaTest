
package kr.co.job.exec;

import java.util.Scanner;

public class ChpFour03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
//		char ch = 'c';
//		System.out.println("ÀÔ·ÂÇÏ½Ã¿À : ");
//		ch = scan.nextLine().charAt(0);
//
//		if (ch == 'x' || ch == 'X') {
//			System.out.println("ture");
//		} else {
//			System.out.println("false");
//		}

		// 4-2¹ø 1ºÎÅÍ 20±îÁöÀÇ Á¤¼ö Áß¿¡¼­ 2¶Ç´Â 3ÀÇ ¹è¼ö°¡ ¾Æ´Ñ ¼öÀÇ ÃÑÇÕÀ» ±¸ÇÏ½Ã¿À.
		// int sum = 0;
		// for(i=0; i<=20; i++) {
		// if(!%2 !=0 && !%3 !=0) {
		// sum = sum + i;

		// }
		// }

		// 4-3¹ø 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+...+10))ÀÇ °á°ú¸¦ ³ªÅ¸³»½Ã¿À.
//		int sum = 0;
//		int totalsum = 0;
//		
//		for(int i=1; i<=9; i++) {//i´Â 1ºÎÅÍ 9±îÁö´Ï±î 1¾¿ ´Ã¾î°¡¸é¼­ 9±îÁö ´Ã¾î³². 
//			sum = sum+i; //1=0+1, 3=1+2, 6=3+3, 10=6+4...
//			totalsum += sum; // À§¿¡ ³ª¿Â °è»êÀÇ ÃÑÇÕ
//		}
//		System.out.println(sum);
//		System.out.println(totalsum);
//		System.out.println(sum+totalsum);
		// ?? ´äÀÌ ¿Ç¹Ù¸£Áö ¾ÊÀº °Í °°À½

		// 4-4¹®Á¦ 1+(-2)+3+(-4)+...°ú °°Àº ½ÄÀ¸·Î °è¼Ó ´õÇØ³ª°¬À» ¶§, ¸î±îÁö ´õÇØ¾ß ÃÑÇÕÀÌ 100ÀÌ»óÀÌ µÇ´ÂÁö ±¸ÇÏ½Ã¿À.
//		int sum=0;
//		int i=0;
//		
//		while (sum<100) {//for¹®=>int i=0, sum=0, s=-1 // for(i=1; sum>=100; i++){ // sum=sum+i *(s*(-1)); // if(sum>100) // break; // } // sysout(i);
//			i++;//Ã³¸® Àü, ÈÄ ¿¡µû¶ó °ªÀÌ ´Ş¶óÁü
//			if(i%2==1) {
//				sum += i; // i°¡ È¦¼ö¶ó¸é
//			}else{
//				sum -= i; // i°¡ Â¦¼ö¶ó¸é
//			}
//			
//		} System.out.println(sum);
//		System.out.println(i);

		// 4-6¹®Á¦ µÎ °³ÀÇ ÁÖ»çÀ§¸¦ ´øÁ³À» ¶§, ´«ÀÇ ÇÕÀÌ 6ÀÌ µÇ´Â ¸ğµç °æ¿ìÀÇ ¼ö¸¦ Ãâ·ÂÇÏ´Â ÇÁ·Î±×·¥À» ÀÛ¼ºÇÏ½Ã¿À. //random»ç¿ë?
//		int dice1 = 0;
//		int dice2 = 0;
//		int sum = 0;
//		
//		
//		//ÁÖ»çÀ§´Â 1~6±îÁöÀÇ ¼ıÀÚ¸¦ °¡Áö°í ÀÖÀ½
//		for(dice1=1; dice1<=6; dice1++) {
//			for(dice2=1; dice2<=6; dice2++) {
//				if(dice1+dice2==6) {
//					System.out.print("Ã¹¹øÂ° ÁÖ»çÀ§ÀÇ ¼ö : "+dice1);
//					System.out.print("\nµÎ¹øÂ° ÁÖ»çÀ§ÀÇ ¼ö : "+dice2);
//					sum = dice1+dice2;
//					System.out.println("\n"+dice1+"+"+dice2+"="+sum);
//				}					
//				}
//				

//			}
//		
		// 4-7 Math.random()À» ÀÌ¿ëÇØ¼­ 1ºÎÅÍ 6»çÀÌÀÇ ÀÓÀÇÀÇ Á¤¼ö¸¦ º¯¼ö value¿¡ ÀúÀåÇÏ´Â ÄÚµå¸¦ ¿Ï¼ºÇÏ¶ó.

//		int value = (int) (Math.random() * 6) + 1; // 0ÀÌ ¿Ö ³ª¿À´Â°¡==? +1 , 6Àº ¿Ö ¾È³ª¿À´Â°ÅÁÒ..?
//		System.out.println(value); 
//		//The end

		// 4-8 ¹æÁ¤½Ä 2x+4y=10ÀÇ ¸ğµç ÇØ¸¦ ±¸ÇÏ½Ã¿À.
		// ´Ü, x¿Í y´Â Á¤¼öÀÌ°í °¢°¢ÀÇ ¹üÀ§´Â 0<=x<=10, 0<=y<=10 ÀÌ´Ù.
//		int x = 0;
//		int y = 0;
//		
//		for(x=0; x<=10; x++) {
//			for(y=0; y<=10; y++) {
//				if((2*x)+(4*y)==10) {
//					System.out.print("x : "+x);
//					System.out.println(", y : "+y);
//				}
//			}
//		}

		// 4-9 ¼ıÀÚ·Î ÀÌ·ç¾îÁø ¹®ÀÚ¿­ strÀÌ ÀÖÀ» ¶§, °¢ ÀÚ¸®ÀÇ ÇÕÀ» ´õÇÑ °á°ú¸¦ Ãâ·ÂÇÏ´Â ÄÚµå¸¦ ¿Ï¼ºÇÏ¶ó.
		// ¸¸¾à ¹®ÀÚ¿­ÀÌ '12345' ¶ó¸é 1+2+3+4+5ÀÇ °á°úÀÎ 15¸¦ Ãâ·ÂÀÌ µÇ¾î¾ßÇÑ´Ù.
//		String str = "12345";
//		int sum = 0;
//		for(int i=0; i<str.length(); i++) {
//			sum = sum + str.charAt(i)-48; //sum = sum + i
//			//charAt "12345"0¹øÂ° À§Ä¡¸¦ Ã£¾ÆÁÜ
//			//strÀÇ . ºÙ¿©ÁÖ¸é charAtÇÔ¼ö¸¦ ºÒ·¯µå¸±¼ö ÀÖÀ½
//		}
//		System.out.println(sum);

		// 4-10 intÅ¸ÀÔÀÇ º¯¼önumÀÌ ÀÖÀ» ¶§, °¢ ÀÚ¸®ÀÇ ÇÕÀ» ´õÇÑ °á°ú¸¦ Ãâ·ÂÇÏ¶ó.
		// num°ªÀÌ 12345 1+2+3+4+5ÀÇ °á°úÀÎ 15¸¦ Ãâ·ÂÇÏ¶ó
//		int num = 12345;
//		int sum = 0;
//		int temp = 0; //¸¸¾à ÃÊ±â°ª 12345¸¦ ±×´ë·Î Ãâ·ÂÇÏ°í ½ÍÀ¸¸é º¯¼ö¸¦ ÇÏ³ª´õ ¼±¾ğÇØ ÁØ´Ù.
//		
//		temp = num;//numÀÌ tempÀÌ´Ù.
//		
//		while(temp!=0) {//(num>0) numÀÚ¸®¿¡ temp·Î ´Ù ³Ö¾îÁØ´Ù.
//			sum += temp%10;
//			temp /= 10; 
//			
//		}//while¼ö½Ä ¹Û¿¡¼­´Â numÀ¸·Î ÀÔ·ÂÇØÁØ´Ù.
//		
//		System.out.println("sum= "+sum);
//		System.out.println("num= "+num);
//		
//		 4-11 ÇÇº¸³ªÄ¡ ¼ö¿­Àº ¾ÕÀ» µÎ ¼ö¸¦ ´õÇØ¼­ ´ÙÀ½ ¼ö¸¦ ¸¸µé¾î ³ª°¡´Â ¼ö¿­ÀÌ´Ù.
//		 1°ú 1ºÎÅÍ ½ÃÀÛÇÏ´Â ÇÇº¸³ªÄ¡ ¼ö¿­ÀÇ 10¹øÂ° ¼ö´Â ¹«¾ùÀÎ°¡ (Áß¿ä!!!) - ´Ù½Ã Ç®¾ûº¸±â!
//		 1,1,2,3,5,8,13,21...
//		int num1 = 1;
//		int num2 = 1;
//		int num3 = 0;
//		System.out.print(num1+","+num2);
//		
//		for(int i=0; i<8; i++) {
//			num3 = num1+num2;
//			num1=num2;
//			num2=num3;
//						
//			System.out.print(","+num3);
//		}System.out.println("\n10¹øÂ° ¼ö´Â : "+num3);
		
		
		

		// 4-13 ÁÖ¾îÁø ¹®ÀÚ¿­ÀÌ ¼ıÀÚÀÎÁö¸¦ ÆÇº°ÇÏ¶ó.- ´Ù½Ã Ç®¾ûº¸±â!
//		String value = "12o34";
//		char ch = ' ';
//		boolean isNumber = true;
//		int sum = 0;
//
//		// ¹İº¹¹®°ú charAt(i)¸¦ ÀÌ¿ëÇØ¼­ ¹®ÀÚ¿­ÀÇ ¹®ÀÚ¸¦
//		// ÇÏ³ª¾¿ ÀĞ¾î¼­ °Ë»çÇÑ´Ù.
//		for (int i = 0; i < value.length(); i++) {
//			ch = value.charAt(i);	
			
//		}
		
		
		// 4-14 ¼ıÀÚ¸ÂÃß±â °ÔÀÓ.- ´Ù½Ã Ç®¾ûº¸±â!
		// 1°ú 100»çÀÌÀÇ °ªÀ» ¹İº¹ÀûÀ¸·Î ÀÔ·ÂÇØ¼­ ÄÄÇ»ÅÍ°¡ »ı°¢ÇÑ °ªÀ» ¸ÂÃß¸é °ÔÀÓÀÌ ³¡³².
		// »ç¿ëÀÚ°¡ °ªÀ» ÀÔ·ÂÇÏ¸é, ÄÄÇ»ÅÍ´Â ÀÚ½ÅÀÌ »ı°¢ÇÑ °ª°ú ºñ±³ÇØ¼­ °á°ú¸¦ ¾Ë·ÁÁÜ.
		// »ç¿ëÀÚ°¡ ÄÄÇ»ÅÍ°¡ »ı°¢ÇÑ ¼ıÀÚ¸¦ ¸ÂÃß¸é °ÔÀÓÀÌ ³¡³ª°í ¸î ¹ø ¸¸¿¡ ¼ıÀÚ¸¦ ¸Â­Ÿ´ÂÁö ¾Ë·ÁÁÜ.
		
		
//		int number = 12321;
//		// number => ¹®ÀÚ¿­·Î º¯°æÇÑ´Ù.str
//		String str = number + "";
//		String str2 = "";
//		
//		  int i = str.length();
//		  while(i == 0){
//			 
//		  
//		  i--;
//		  
//		  }
//		  
		  
		  
		  
		 
		
		
		
		
		
		// 4-15 È¸¹®¼ö¸¦ ±¸ÇÏ½Ã¿À- ´Ù½Ã Ç®¾ûº¸±â!
		// È¸¹®¼ö¶õ ¼ıÀÚ¸¦ °Å²Ù·Î ¤·¸¯¾îµµ ¾ÕÀ¸·Î ÀĞ´Â °Í°ú °°Àº ¼ö¸¦ ¸»ÇÑ´Ù.
		// ex)12321ÀÌ³ª 13531°°Àº ¼ö¸¦ ¸»ÇÑ´Ù.
		int number = 12321;
		// number => ¹®ÀÚ¿­·Î º¯°æÇÑ´Ù.str
		String str = number + "";
		String str2 = "";
		
		// º¯°æÇÑ ¹®ÀÚ¿­À» ¿ª¼øÀ¸·Î ÀúÀå(´ëÀÔ)ÇÑ´Ù. str2
		for(int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
			System.out.println(str2);
		}	
		//str.equals(str2)
		if(str.equals(str2)) {
			System.out.println(number+"´Â È¸¹®¼öÀÔ´Ï´Ù.");
		}else {
		System.out.println(number+"´Â È¸¹®¼ö°¡ ¾Æ´Õ´Ï´Ù.");
		}
		
		
	}

}
