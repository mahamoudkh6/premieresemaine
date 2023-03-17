package chapitre1;

import java.util.Scanner;

public class Exercice93 {
	
	/*
	 * mes besoins en francais
	 *  
	 *  afficher un texte qui demande a l'utilisateur de saisie le montant de l'achat
	 *  l'utilisateur doit pouvoir saisie un entier
	 *  comparer le texte saisie avec 350 €
	 *  comparer le texte saisie avec  600€
	 *  calculer la reduction
	 *  appliquer la reduction
	 *  calculer le prix net a payer et l'affiche
	 *  afficher 1 message
	 *  
	 *  
	 *   mes besoins en technique informatique
	 *    composant de saisie d'un entier pour le montant de l'achat^
	 *   composant d'affiche vers un ecran que l'utilisateur peut voir (differents messages)
	 *   des instructions de comparaison pour un entier (350€ et 600€)
	 *  
	 * mes besoins en langage de programmation java
	 * scanner + scanner.nextInt()
	 * systeme.out.println() , int, * , 
	if
	else
	 *
	 * */	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("quel est le montant de votre achat");
		double montant = sc.nextDouble(); // un montant
		int remise = -1 ;
		
		if (montant  < 350) {
			//cest le 1er cas 
			
			 remise = 0 ;
		}
		
		
		if (montant >= 350 && montant < 600) { 
			// cest le 2e cas
			
			montant *=0.97 ;
			remise = 3 ;
			
		}
		if (montant  >= 600) {  
			//cest le 3e cas
			montant *=0.95 ;
			remise = 5 ;
		}
		// fin du programme
		
		if (remise == 0)
			System.out.println("Espece de radin, pas de remise ");
		else 
			System.out.println("parfait vous avez une remise de: " +remise );
		}
				
		

	

}
