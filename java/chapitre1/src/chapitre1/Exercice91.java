package chapitre1;

import java.util.Scanner;

public class Exercice91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("saisissez la longueur");
		int lg = sc.nextInt();
		System.out.println("saisissez la largeur");
		int larg = sc.nextInt();
		System.out.println("l'aire du rectangle est:");
		long res = lg * larg ;
		System.out.println("le resultat est:" +res);
	}

}
