package chapitre1;

import java.util.Scanner;

public class ExempleSwitch4 {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("saisissez le nom du mois");
		String month = sc.nextLine();   // // any month
				 
		int month = sc.nextInt(); 
		int year = 2021;
		int numDays = ;

		switch (month) {
		    case 1, 3,5,  // January March May
		    7, 8 ,10  // July August October
		   12 -> 31
		        - 31;
		        break;
		    case 4 , 6:   // April June
		     9 ,  11:  // September November
		        numDays = 30;
		        break;
		    case 2 -> {  // February
		        if (((year % 4 == 0) && 
		             !(year % 100 == 0))
		             || (year % 400 == 0))
		            numDays = 29;
		        else
		            numDays = 28;
		        break;
		    default:
		        System.out.println("Invalid month.");
		        break;
		
		
		
		
		
	}

}
