package chapitre1;

import java.util.Scanner;

public class ExempleSwitch {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner un nombre");
		int nb ;
		System.out.print("Saisir un entier : ");
		nb = sc.nextInt(); //saisie d'un int et affectation de l'entier saisi dans nb
		switch (nb) //
		{
		case 1 : // exécuté si nb vaut 1
		 System.out.println("nb vaut 1.");
		 break; //signifie : sortir du block
		case 2 : // exécuté si nb vaut 2
		 System.out.println("nb vaut 2.");
		 break;
		case 3 : // exécuté si nb vaut 3
		 System.out.print("nb");
		 System.out.println(" vaut 3.");
		 break;
		case 10:
		case 11:
		case 12:
		case 13:
			break;
		default : // exécuté si nb est différent 1, 2 et 3
		 System.out.println("nb est différent des valeurs testées dans les case.");
		}
		System.out.println("Fin du programme.");
		/////
		sc close();
		
		
	

	}

}
