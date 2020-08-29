package fr.chebaiki.vue;

import java.util.Scanner;

public class MaClasse {

	public static void main(String[] args) {

		// 1. Déclaration des variables
		int nbPiece5C = 0, nbPiece10C = 0, nbPiece20C = 0;
		int piece;
		int totalRecu = 0;
		
		// 2. Message bienvenue
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Pour obtenir un café, entrez au moins 45 cents");
		System.out.println("Je rends la monnaie");
		
		// 3. Boucle jusqu'à avoir 45 cents
		do {
			
			// 3.1 Recuperation de la pièce
			System.out.println("Valeur de la pièce entrée : ");
			piece = lectureClavier.nextInt();
			
			// 3.2 Enregistrement de la piece inserée
			switch (piece) {
			case 5:
				nbPiece5C = nbPiece5C + 1;
				break;
			
			case 10:
				nbPiece10C = nbPiece10C + 1;
				break;

			case 20:
				nbPiece20C = nbPiece20C + 1;
				break;
				
			default:
				piece = 0;
				System.out.println("Pièce impossible");
			}
			
			// 3.3 Calcul du montant total inserée
			totalRecu = totalRecu + piece;
			
			// 3.4 Affichage des informations
			System.out.println("Vous avez entré : ");
			System.out.println("    " + nbPiece5C + " pièce(s) de 5 cents");
			System.out.println("    " + nbPiece10C + " pièce(s) de 10 cents");
			System.out.println("    " + nbPiece20C + " pièce(s) de 20 cents");
			System.out.println("Soit au total : " + totalRecu + " cents");
		} while (totalRecu < 45);
		
		System.out.println("Voici votre café ");
		if(totalRecu > 45) {
			System.out.println("Et je vous rends : " + (totalRecu - 45 ) + " cents");
		}
		
	}// End Main
}
