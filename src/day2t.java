/*import java.util.Scanner;

public class day2t {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 3개 입력>>");
		
		int score1 = sc.nextInt();
		int score2 = sc.nextInt();
		int score3 = sc.nextInt();
		
		if ( (score2 > score1  && score1 < score3 && score2 > score3) || (score3 > score1 && score1 < score2 && score3 > score2)) {
			System.out.println("중간값은" + score1);
		} else if ( (score1 > score2 && score2 < score3 && score1 > score3) || (score3 > score2 && score2 < score1 && score3 > score1)) 
		System.out.println("중간 값은 " + score2);
		else if ( (score1 > score3 && score3 < score2 && score1 > score2 ) || (score2 > score3 && score3 < score1 && score2 > score1))
			System.out.println("중간 값은" + score3);
		
		System.out.println("중간 값은" + score2);
		
		
		
		sc.close();
		
		
		
		
	}
}
*/

import java.util.Scanner;

public class day2t {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("정수 3개 입력>>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		System.out.println("중간 값은 " + num2);

		scanner.close();
	}

}