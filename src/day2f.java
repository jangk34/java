/*import java.util.Scanner;

public class day2f {
	public static void main(String[] args) {

		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>");
		
		Scanner sc = new Scanner(System.in);
		
		int i = sc.nextInt();
		
		if ( i % 10 ==3 || i % 10 == 3 || i % 10 == 3) {
			System.out.println("�ڼ�¦");
		} el
	
		
		
}
}*/

import java.util.Scanner;

public class day2f {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		int i = scanner.nextInt();

		if (i % 10 == 3 || i % 10 == 3 || i % 10 == 3) {
			System.out.println("�ڼ�¦");
		} else if ((i % 10 == 3 || i % 10 == 6 || i % 10 == 9) && (i / 10 == 3 || i / 10 == 6 || i / 10 == 9)) {
			System.out.println("�ڼ�¦¦");
		}

		scanner.close();
	}

}
