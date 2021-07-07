package kr.co.job.exec;

import java.util.Scanner;

public class Movie2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		   
	      int repair =0;
	      int menu =0;
	      int number =12345;
	      int number2 =12345;
	      int birthDate = 970610;
	      String name = "위지윤";
	      String address = "경기도 수원시 권선구";
	      String cellPhone = "010-2606-1355";
	      String mail = "m0506ji@namnam.com";

	      String ilikeGenre = "SF";
	      String lately = "콰이어트 플레이스2";
	      String movieBasket = "발신제한, 블랙위도우";

//	      String choose = scan.nextLine();
	      boolean movie = true;
	      boolean movie2 =true;
	      
	      while (movie) {
	          movie2=true;
	         System.out.print("[로그인]\n회원번호를 입력해주세요 : ");
	         number = scan.nextInt();
	         
	         if (number == number2) {
//	            choose = scan.nextLine();
	            System.out.println("성함 : " + name + "\n회원번호 : " + number + "\n주민번호 : " + birthDate + "\n주소 : " + address
	                  + "\n핸드폰번호 : " + cellPhone + "\n메일주소 : " + mail);
	            System.out.println("------------------------------------------------");
	            System.out.println("좋아하는 장르 : " + ilikeGenre + "\n최근에 본 영화 : " + lately + "\n내가 찜한 영화 : " + movieBasket);
	            System.out.print("\n수정사항이 있으십니까? \n1.예 2.아니오\n=>");
	            menu = scan.nextInt();
	            
	            switch (menu) {
	            case 1:
	               while(movie2) {
	               
	               System.out.println("-------------------[수정목록]--------------------");
	               System.out.println("1.이름 2.주소 3.핸드폰번호 4.메일주소 5.회원번호 바꾸기 6. 돌아가기");
	               System.out.println("-----------------------------------------------");
	               repair = scan.nextInt(); //repair = Integer.parseInt(scan.next());
	            
	               switch (repair) {

	               case 1:
	                 scan.nextLine();
	                  System.out.print("기존이름 : "+name+"\n변경할 이름 : ");
	                  if (name.equals("위지윤"))
	                  {
	                    name = scan.nextLine();
	                     System.out.println(name);
	                  }
	                  break;

	               case 2:
	                 scan.nextLine();
	                 
	                 System.out.print("기존주소 : "+address+"\n변경할 주소 : ");
	                  if (address.equals("경기도 수원시 권선구")) 
	                  {
	                     address = scan.nextLine();
	                     System.out.println(address);//경기도 오산시 라고 입력하니가 경기도만 뜸 nextLine으로해도 안됨...
	                  }
	                  break;
	                  
	               case 3:
	                 
	                 System.out.print("기존핸드폰 번호 : "+cellPhone+"\n변경할 번호 : ");
	                  if (cellPhone.equals("010-2606-1355")) 
	                  {
	                     cellPhone = scan.next();
	                     System.out.println(cellPhone);//경기도 오산시 라고 입력하니가 경기도만 뜸 nextLine으로해도 안됨...
	                  }
	                  break;
	                  
	               case 4:
	                  System.out.print("기존메일주소 : "+mail+"\n변경할 메일주소 : ");
	                  if (mail.equals("m0506ji@namnam.com")) 
	                  
	                  {
	                     mail = scan.next();
	                     System.out.println(mail);
	                  }
	                  break;
	                  
	               case 5:
	                  
	                 scan.nextLine();
	                  System.out.println("기존 회원번호:"+number+"\n변경할 회원번호:");
	                  if(number==number2) 
	                  {
	                  number=scan.nextInt();
	                  number2=number;
	                  }
	                  System.out.println(number2);
	            
	                  break;
	                  
	               case 6:
	                  
	                  movie2=false;
	                  break;
	               
	               default :
	               }
	             
	             }
//	               break;
	            case 2:
	              
	            System.out.println("반갑습니다." + name + "님");//바꾼 이름(b)으로 넣고싶음
	            
	            break;

	           default :
	         
	               
	               
	            }
	         } 
	        else {
	            System.out.println("회원번호가 옳바르지 않습니다. 다시 입력해주세요");// 회원번호가 다른번호일경우 다시 로그인창이 떠야하는데 안뜸
	            
	         }// 다시 로그인하면 바뀐 정보들이 나와야함
	      }

	}

}
