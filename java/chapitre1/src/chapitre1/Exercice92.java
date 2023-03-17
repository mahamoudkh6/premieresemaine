package chapitre1;

import java.util.Scanner;

public class Exercice92 {
/*
 * mes besoins en francais
 *  afficher un texte 
 *  utiliusateur doit pouvoir faire une saisie d'un entier 
 *  comparer avec la valeur 16
 *  afficher 2 message different selon l'heure saisie
 *  
 *  
 *   mes besoins en technique informatique
 *    composant de saisie d'un entier pour l'heure^
 *   composant d'affiche vers un ecran que l'utilisateur peut voir (differents messages)
 *   des instructions de comparaison pour un entier (16 heures)
 *  
 * mes besoins en langage de programmation java
 * scanner + scanner.nextInt()
 * systeme.out.println()
if
else
 *
 * */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("entrez l'heure sans la minute");
		int heure = sc.nextInt();
		System.out.println("il est: "+heure+"h");
		if ( heure <= 16 )
		System.out.println("bonjour monsieur / madame");
		else {
		System.out.println("bonsoir monsieur / madame");
		}

	}

}
