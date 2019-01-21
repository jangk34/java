import java.util.Scanner;

public class day11 {
	/*public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력해주세요.");
		
		int score = scanner.nextInt();
		
		if( score % 6 == 0) {
			System.out.println("6의배수");
		} else if ( score % 6 == 1) {
			System.out.println("홀수");
		} else 
		{ 
			System.out.println("00");
		}
		scanner.close();
	}*/
	
	public static void main(String[] args) {
		
	/*	Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위바위보 게임입니다. 가위,바위,보 중에 입력해주세요.");
		System.out.println("철수 >>");
		System.out.println("영희 >>");
		
		int score;
		
		int num;
		int scanValue = 0; // 입력 받은 가위바위바위보를 숫자로 바꾼 변수
		String scanString; // 입력 받은 가위바위보
		
		int victory = scanner.nextInt();

		if (scanString.equals("가위")) {
			scanValue = 0;
		} else if (scanString.equals("바위")) {
			scanValue = 1;
		} else if (scanString.equals("보")) {
			scanValue = 2;
		}
		
		if ( num == 0) {
			System.out.println("가위");
		} else if ( num == 1) {
			System.out.println("바위");
		} else if ( num == 2) {
			System.out.println("보");
		}
	System.out.println(""+"가 이겼습니다.");
	}*/
		
		/*Scanner scanner = new Scanner(System.in);
		
		System.out.println("가위 바위 보 게임입니다. 가위,바위,보 중에서 입력하세요");
		
		System.out.println("철수 >>");
		String su = scanner.next();
		
		System.out.println("영희 >>");
		String hi = scanner.next();
		
		if(su.equals("가위") && hi.equals("보")) ||
		(su.equals("바위") && hi.equals("가위")) ||
		(su.equals("보") && hi.equals("바위")) {
			System.out.println("철수가 이겼습니다");
			
		}
		else if (hi.equals("가위") && su.equals("보")) ||
				(hi.equals("바위") && su.equals("가위")) ||
				(hi.equals("보") && su.equals("바위")
		System.out.println("영희가 이겼습니다.");
				
				else
					
					System.out.println("비겼습니다.");*/
		
		  Scanner sc = new Scanner(System.in);
		  
		  System.out.println("가위 바위 보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		  
		  System.out.print("철수 >>");
		  String chul = sc.next();
		  
		  System.out.print("영희 >> ");
		  String yung = sc.next();
		  
		  if(chul.equals("가위") && yung.equals("보") ||
		     chul.equals("바위") && yung.equals("가위") ||
		     chul.equals("보") && yung.equals("바위") )

		   System.out.println("철수가 이겼습니다.");

		  else if(yung.equals("가위") && chul.equals("보")||
		    yung.equals("바위") && chul.equals("가위") ||
		    yung.equals("보") && chul.equals("바위") )

		   System.out.println("영희가 이겼습니다.");

		  else
		   System.out.println("비겼습니다.");

		 }
		}



