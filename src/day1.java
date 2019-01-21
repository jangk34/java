import java.util.Scanner;

public class day1 {
	public static void main(String[] args) {
/*		int n = 20;
		int i = 30;
				System.out.println("Kitae Hwang");
				System.out.println(n + "year old");
				System.out.println("Department of Computer Enginerring");
				System.out.println("Welcome");
				System.out.println("자바 세계로 오신 것을 환영합니다.");
				System.out.println("Sorry~~");
				System.out.println("재밌어서 미안합니다~~");*/
				
		Scanner scanner = new Scanner(System.in);
 		System.out.println("정수를 입력하세요");
 		int time = scanner.nextInt();
 		int second = time % 60;
 		int minute = (time/60) % 60;
 		int hour = (time/60) / 60;
 		
 		System.out.println(time + "초는");
 		System.out.println(hour + "시간");
 		System.out.println(minute + "분,");
 		System.out.println(second + "초입니다.");
 		
 	
 		
 		int x = 2, y = 10, z = 0;
 		z = x++*2+--y-5+x*(y%2);
 		
 		System.out.println(z);

 		/////////////////////
 		System.out.println("점수를 입력하세요.");
		int score = scanner.nextInt();
		if (score >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격입니다");
			scanner.close();
		}
		}
		
	}
