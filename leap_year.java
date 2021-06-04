import java.util.Scanner;

public class leap_year{
	
	public static void main (String[]args) {

	System.out.println("enter year: " );
	
	Scanner user_year = new Scanner(System.in);
	
	int Year = user_year.nextInt();

	if (((Year%400==0) || (Year%4==0)) && (Year%100 != 0)){
		
		System.out.println("This Is Leap Year : " +Year);
	}
		else {
		System.out.println("This Is Not A Leap Year : " +Year);
	}
	}
	}
