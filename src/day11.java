import java.util.Scanner;

public class day11 {
	/*public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է����ּ���.");
		
		int score = scanner.nextInt();
		
		if( score % 6 == 0) {
			System.out.println("6�ǹ��");
		} else if ( score % 6 == 1) {
			System.out.println("Ȧ��");
		} else 
		{ 
			System.out.println("00");
		}
		scanner.close();
	}*/
	
	public static void main(String[] args) {
		
	/*	Scanner scanner = new Scanner(System.in);
		
		System.out.println("���������� �����Դϴ�. ����,����,�� �߿� �Է����ּ���.");
		System.out.println("ö�� >>");
		System.out.println("���� >>");
		
		int score;
		
		int num;
		int scanValue = 0; // �Է� ���� ���������������� ���ڷ� �ٲ� ����
		String scanString; // �Է� ���� ����������
		
		int victory = scanner.nextInt();

		if (scanString.equals("����")) {
			scanValue = 0;
		} else if (scanString.equals("����")) {
			scanValue = 1;
		} else if (scanString.equals("��")) {
			scanValue = 2;
		}
		
		if ( num == 0) {
			System.out.println("����");
		} else if ( num == 1) {
			System.out.println("����");
		} else if ( num == 2) {
			System.out.println("��");
		}
	System.out.println(""+"�� �̰���ϴ�.");
	}*/
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� ���� �� �����Դϴ�. ����,����,�� �߿��� �Է��ϼ���");
		
		System.out.println("ö�� >>");
		String su = scanner.next();
		
		System.out.println("���� >>");
		String hi = scanner.next();
		
		if(su.equals("����") && hi.equals("��")) ||
		(su.equals("����") && hi.equals("����")) ||
		(su.equals("��") && hi.equals("����")) {
			System.out.println("ö���� �̰���ϴ�");
			
		}
		else if (hi.equals("����") && su.equals("��")) ||
				(hi.equals("����") && su.equals("����")) ||
				(hi.equals("��") && su.equals("����")
		System.out.println("���� �̰���ϴ�.");
				
				else
					
					System.out.println("�����ϴ�.");*/
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("���� ���� �� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		  
		  System.out.print("ö�� >>");
		  String chul = sc.next();
		  
		  System.out.print("���� >> ");
		  String yung = sc.next();
		  
		  if(chul.equals("����") && yung.equals("��") ||
		     chul.equals("����") && yung.equals("����") ||
		     chul.equals("��") && yung.equals("����") )

		   System.out.println("ö���� �̰���ϴ�.");

		  else if(yung.equals("����") && chul.equals("��")||
		    yung.equals("����") && chul.equals("����") ||
		    yung.equals("��") && chul.equals("����") )

		   System.out.println("���� �̰���ϴ�.");

		  else
		   System.out.println("�����ϴ�.");

		 }
		}



