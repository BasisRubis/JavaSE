package fr.chebaiki.vue;

import java.util.Scanner;

public class Statistique {

	public static void main(String[] args) {
		
		// Declaration des variables
		int nbCB = 0, nbCheque = 0, nbVirement = 0, nbDebit = 0;
		float prctCB, prctCheque, prctVirement;
		
		// Récuperation des données
		Scanner lectureClavier = new Scanner(System.in);
		
		System.out.println("Nombre de paiements par CB");
		nbCB = lectureClavier.nextInt();
		
		System.out.println("Nombre de paiements par Cheque");
		nbCheque = lectureClavier.nextInt();
		
		System.out.println("Nombre de paiements par Virement");
		nbVirement = lectureClavier.nextInt();
		
		// Calcul
		nbDebit = nbCB + nbCheque + nbVirement;
		
		// Stats
		prctCB = (float) nbCB / nbDebit * 100;
		
		prctCheque = (float) nbCheque / nbDebit * 100;
		
		prctVirement = (float) nbVirement / nbDebit * 100;
		
		// Résultats
		System.out.println("Vous avez emis " + nbDebit + " ordres de debit ");
		System.out.println(" dont " + prctCB + " % par CB ");
		System.out.println("      " + prctCheque + " % par Cheque ");
		System.out.println("      " + prctVirement + " % par Virement ");
	}
}
