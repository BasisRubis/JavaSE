package fr.chebaiki.vue;

import java.io.IOException;

public class MaClasse {

	public static void main(String[] args) throws IOException {
		
		// 1. Déclaration des variables
		String tmp = "";
		char caract = '\0';
		int valeur;
		
		// 2. Explication à l'utilisateur
		System.out.println("Entrez des chiffres et appuyez sur ");
		System.out.println("la touche Entrée, pour valider la saisie : ");
		
		// 3. Boucle
		while(caract != '\n') {
			caract = (char) System.in.read();
			
			if (caract != '\r' && caract != '\n') {
				tmp = tmp + caract;
			}
		}
		
		// 4. Analyse des touches tapées
		System.out.println("Vous avez entré : " + tmp);
		valeur = Integer.parseInt(tmp);
		System.out.println("C'est à dire : " + valeur + " en entier");
		
	} // End main
}
