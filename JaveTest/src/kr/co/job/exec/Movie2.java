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
	      String name = "������";
	      String address = "��⵵ ������ �Ǽ���";
	      String cellPhone = "010-2606-1355";
	      String mail = "m0506ji@namnam.com";

	      String ilikeGenre = "SF";
	      String lately = "���̾�Ʈ �÷��̽�2";
	      String movieBasket = "�߽�����, ��������";

//	      String choose = scan.nextLine();
	      boolean movie = true;
	      boolean movie2 =true;
	      
	      while (movie) {
	          movie2=true;
	         System.out.print("[�α���]\nȸ����ȣ�� �Է����ּ��� : ");
	         number = scan.nextInt();
	         
	         if (number == number2) {
//	            choose = scan.nextLine();
	            System.out.println("���� : " + name + "\nȸ����ȣ : " + number + "\n�ֹι�ȣ : " + birthDate + "\n�ּ� : " + address
	                  + "\n�ڵ�����ȣ : " + cellPhone + "\n�����ּ� : " + mail);
	            System.out.println("------------------------------------------------");
	            System.out.println("�����ϴ� �帣 : " + ilikeGenre + "\n�ֱٿ� �� ��ȭ : " + lately + "\n���� ���� ��ȭ : " + movieBasket);
	            System.out.print("\n���������� �����ʴϱ�? \n1.�� 2.�ƴϿ�\n=>");
	            menu = scan.nextInt();
	            
	            switch (menu) {
	            case 1:
	               while(movie2) {
	               
	               System.out.println("-------------------[�������]--------------------");
	               System.out.println("1.�̸� 2.�ּ� 3.�ڵ�����ȣ 4.�����ּ� 5.ȸ����ȣ �ٲٱ� 6. ���ư���");
	               System.out.println("-----------------------------------------------");
	               repair = scan.nextInt(); //repair = Integer.parseInt(scan.next());
	            
	               switch (repair) {

	               case 1:
	                 scan.nextLine();
	                  System.out.print("�����̸� : "+name+"\n������ �̸� : ");
	                  if (name.equals("������"))
	                  {
	                    name = scan.nextLine();
	                     System.out.println(name);
	                  }
	                  break;

	               case 2:
	                 scan.nextLine();
	                 
	                 System.out.print("�����ּ� : "+address+"\n������ �ּ� : ");
	                  if (address.equals("��⵵ ������ �Ǽ���")) 
	                  {
	                     address = scan.nextLine();
	                     System.out.println(address);//��⵵ ����� ��� �Է��ϴϰ� ��⵵�� �� nextLine�����ص� �ȵ�...
	                  }
	                  break;
	                  
	               case 3:
	                 
	                 System.out.print("�����ڵ��� ��ȣ : "+cellPhone+"\n������ ��ȣ : ");
	                  if (cellPhone.equals("010-2606-1355")) 
	                  {
	                     cellPhone = scan.next();
	                     System.out.println(cellPhone);//��⵵ ����� ��� �Է��ϴϰ� ��⵵�� �� nextLine�����ص� �ȵ�...
	                  }
	                  break;
	                  
	               case 4:
	                  System.out.print("���������ּ� : "+mail+"\n������ �����ּ� : ");
	                  if (mail.equals("m0506ji@namnam.com")) 
	                  
	                  {
	                     mail = scan.next();
	                     System.out.println(mail);
	                  }
	                  break;
	                  
	               case 5:
	                  
	                 scan.nextLine();
	                  System.out.println("���� ȸ����ȣ:"+number+"\n������ ȸ����ȣ:");
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
	              
	            System.out.println("�ݰ����ϴ�." + name + "��");//�ٲ� �̸�(b)���� �ְ����
	            
	            break;

	           default :
	         
	               
	               
	            }
	         } 
	        else {
	            System.out.println("ȸ����ȣ�� �ǹٸ��� �ʽ��ϴ�. �ٽ� �Է����ּ���");// ȸ����ȣ�� �ٸ���ȣ�ϰ�� �ٽ� �α���â�� �����ϴµ� �ȶ�
	            
	         }// �ٽ� �α����ϸ� �ٲ� �������� ���;���
	      }

	}

}
