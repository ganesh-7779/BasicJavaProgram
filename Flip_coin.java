import java.util.Random;
import java.util.Scanner;

public class Flip_coin {
	public static void  main (String[]args) {
		
		int HeadCount=0;
		int tailCount=0;
		
		Scanner scanner = new Scanner (System.in);
		System.out.println( "Enter Number of Flip");
		int flipCount=scanner.nextInt();
		for (int i = 0; i < flipCount; i++) {
			
		
			double random= Math.floor(Math.random()*10)%2;

		if (random > 0.5) {
			HeadCount++;
		
		}else {
			tailCount++;

		}
	
		}
		
		//System.out.println("Head Count :" +HeadCount + "Tail Count:" +tailCount );
		System.out.println("Head Count :" +HeadCount );
		System.out.println("Tail Count :" +tailCount );
		System.out.println("HeadCountPer :" +HeadCount*100/flipCount );
		System.out.println("TailCountPer :" +tailCount*100/flipCount );
	

		
	}

}
