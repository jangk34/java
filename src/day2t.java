/*import java.util.Scanner;

public class day2t {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� 3�� �Է�>>");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		if ( (score2 > score1  && score1 < score3 && score2 > score3) || (score3 > score1 && score1 < score2 && score3 > score2)) {
			System.out.println("�߰�����" + score1);
		} else if ( (score1 > score2 && score2 < score3 && score1 > score3) || (score3 > score2 && score2 < score1 && score3 > score1)) 
		System.out.println("�߰� ���� " + score2);
		else if ( (score1 > score3 && score3 < score2 && score1 > score2 ) || (score2 > score3 && score3 < score1 && score2 > score1))
			System.out.println("�߰� ����" + score3);
		
		System.out.println("�߰� ����" + score2);
		
		
		
		sc.close();
		
		
		
		
	}
}
*/

import java.util.Scanner;

public class day2t {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("���� 3�� �Է�>>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		System.out.println("�߰� ���� " + num2);

		scanner.close();
	}

}