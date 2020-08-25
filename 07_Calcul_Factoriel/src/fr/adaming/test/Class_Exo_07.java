package fr.adaming.test;

import java.util.Scanner;

final class Class_Exo_07 {

	public static void main(String[] args) {
		
		/**************Boucle pour relancer le programme**************************/
		int n = 0;
		while(n==0) {
		
		/**************Demander d'entrer un nombre*******************************/
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez un entier =");
		int s = sc1.nextInt();
		
//		//======Calcul factoriel avec boucle For =====
//		int produit = 1;
//		for (int i = 1; i<=s; i++) {
//			produit *= i;
//		}
//		System.out.println(produit);
		
		//======Calcul factoriel avec boucle While=====
		int i = 1;
		int produit = 1;
		
		while (i < s) {
			i++;
			produit *= i;
			System.out.println(i + "! : " + produit);
		}
		//System.out.println(produit);
		
		}//End boucle while
	}//End main
}//End class
