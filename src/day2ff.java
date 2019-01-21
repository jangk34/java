
public class day2ff {

	public static void main(String[] args) {
	
		int sum = 0;
		
		/*for (int i = 0; i<=100; i++) {  //1~100까지합
			sum += i;
			System.out.println(sum);
		}*/
		
		
	  /* for (int i = 100; i>=1; i--) {    // 1~100까지합
		   sum += i;
		   System.out.println(sum);
	   }*/
		
		int i = 0; 
		
		for (i=1; i<=10; i++) {
			sum += i;
			System.out.print(i);
		
			if ( i<=9 ) 
				System.out.print("+");
		 else {
				System.out.print("=");
				System.out.print(sum);
			}
	}
}
}

