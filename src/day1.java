import java.util.Scanner;

public class day1 {
	public static void main(String[] args) {
/*		int n = 20;
		int i = 30;
				System.out.println("Kitae Hwang");
				System.out.println(n + "year old");
				System.out.println("Department of Computer Enginerring");
				System.out.println("Welcome");
				System.out.println("�ڹ� ����� ���� ���� ȯ���մϴ�.");
				System.out.println("Sorry~~");
				System.out.println("��վ �̾��մϴ�~~");*/
				
		Scanner scanner = new Scanner(System.in);
 		System.out.println("������ �Է��ϼ���");
 		int time = scanner.nextInt();
 		int second = time % 60;
 		int minute = (time/60) % 60;
 		int hour = (time/60) / 60;
 		
 		System.out.println(time + "�ʴ�");
 		System.out.println(hour + "�ð�");
 		System.out.println(minute + "��,");
 		System.out.println(second + "���Դϴ�.");
 		
 	
 		
 		int x = 2, y = 10, z = 0;
 		z = x++*2+--y-5+x*(y%2);
 		
 		System.out.println(z);

 		/////////////////////
 		System.out.println("������ �Է��ϼ���.");
		int score = scanner.nextInt();
		if (score >= 80) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ��Դϴ�");
			scanner.close();
		}
		}
		
	}
