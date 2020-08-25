package fr.chebaiki.vue;

import java.util.Scanner;

public class Rectangle {

	public static void main(String[] args) {
		
		// 1. Declaration des variables 
		double uneLargeur, uneLongueur, lePerimetre;
		
		// 2. Recuperation des valeurs
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("La largeur : ");
		uneLargeur = lectureClavier.nextDouble();
		System.out.println("La longueur : ");
		uneLongueur = lectureClavier.nextDouble();
		
		// 3. Calcul du perimetre
		lePerimetre = (2 * uneLargeur) + (2 * uneLongueur);
		
		// 4. Affichage du resultat
		System.out.println("Le perimetre = " + lePerimetre);

	}

}
