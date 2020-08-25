package fr.chebaiki.vue;

import java.util.Scanner;

public class Cercle {

	public static void main(String[] args) {
		
		// 1. Declaration des variables
		double unRayon, lePerimetre;
		
		// 2. Recuperation de la valeur du rayon
		Scanner lectureClavier = new Scanner(System.in);
		System.out.println("Valeur du rayon : ");
		unRayon = lectureClavier.nextDouble();
		
		// 3. Calcul de la circonférence
		lePerimetre = 2 * Math.PI * unRayon;
		
		// 4. Affichage du résultat
		System.out.println("Le périmetre du cercle de " + unRayon + " (rayon) est égale à : " + lePerimetre);
		
	}
}
