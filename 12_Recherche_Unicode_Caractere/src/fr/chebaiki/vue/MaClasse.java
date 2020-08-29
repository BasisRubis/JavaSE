package fr.chebaiki.vue;

import java.util.Scanner;

public class MaClasse {

	public static void main(String[] args) {
		
		// 1. Declaration des variables
		char recherche, aTrouver;
		
		// 2. Interaction utilisateur
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Quel caractère recherchez-vous : ");
		recherche = lectureClavier.next().charAt(0);
		
		// 3. Boucle de balayage de la table ASCII
		for(int i = 0; i <= 127; i++) {
			aTrouver = (char) i;
			if(aTrouver == recherche) {
				System.out.println("Le code Unicode de " + aTrouver);
				System.out.println(" est \\u00" + Integer.toString(i, 16));
			}
		}
	} //End main
}
