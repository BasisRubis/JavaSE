package fr.chebaiki.vue;

import java.util.Scanner;

public class MaClasse {

	public static void main(String[] args) {
		
		// 1. Déclaration des variables
		int aleatoire = (int) (10 * Math.random());
		boolean resultat = true;
		int essai = 0;
		
		// 2. Enoncé du jeu 
		System.out.println("Nous allons jouer à un petit jeu");
		System.out.println("Un nombre entre 0 et 10 a été choisie");
		System.out.println("Devine-le !");
		
		// 2. Boucle
		do {
			essai = essai + 1;
			// 2.1 Demande à l'utilisateur
			System.out.println("Entre ton choix :");
			Scanner lectureClavier = new Scanner(System.in);
			int choix = lectureClavier.nextInt();
			
			// 2.2 Analyse du choix
			if(choix == aleatoire) {
				resultat = false;
			}
			
		} while (resultat);
		
		System.out.println("Gagné !!");
		System.out.println("Le nombre était : " + aleatoire);
		System.out.println("Réussi en " + essai + " essai(s)");

	} // End main
}
