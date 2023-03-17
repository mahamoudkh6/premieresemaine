package chapitre1;

import java.util.Scanner;

public class ExempleiI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Saisie d'un nombre et verification s'il est compris entre 0 et 20
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner un nombre");
		int n = sc.nextInt();
		// 1ere solution 
		if (n>=0)  {
			if (n<=0) {
				System.out.println("le nombre "+n+" est bien dans l'intervalle.");
			}
			else System.out.println("le nombre est superieur à 20");
		}
		else System.out.println("le nombre est negatif");
	System.out.println("fin du 1er test");
			
	// 2eme condition 
	if (n>=0 && n<=20){
		System.out.println(" le nombre "+n+" est  bien dans intervalle.");
	}
	else { System.out.println("le nombre n'est pas dans l'intervalle");
	}
	System.out.println("Fin du 2e test");
	/// 3e solution
	if (n<0|| n>20) {
		System.out.println("le nombre n'est pas dans l'intervalle");
	}
	else { 
		System.out.println("3. le nombre "+n+" est bien dans l'intervalle.");
	}	System.out.println("fin du 3e test");
	System.out.println("n>=0");
	System.out.println("n<=20");
	System.out.println("n>=0 && n<=20:" +(n<0|| n>20));
	
	}
		
		
	}

