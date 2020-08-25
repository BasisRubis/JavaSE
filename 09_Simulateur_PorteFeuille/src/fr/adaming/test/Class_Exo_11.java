package fr.adaming.test;

import java.util.Scanner;

public class Class_Exo_11 {

	public static void main(String[] args) {
		/*========= Déclaration ====*/
		int moyen = 0;
		int max = 0;
		int min = 1000;
		int mark = 0;
		
		/*========= Nombre de montant à déclarer*/
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez le nombre de montant =");
		int n = sc1.nextInt();
		System.out.println("Vous allez rentrer " + n + " montants");
		
		for (int i = 0; i<n; i++) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Entrez un montant =");
			int res = sc.nextInt();
			moyen = moyen + res;
			
			if(res > max) {
				max = res;
			}
			
			if (res < min ) {
				min = res;
			} 
	
		}
		mark = moyen / n;

		System.out.println("La somme mensuelle moyenne reçue est: " + mark);
		System.out.println("La somme mensuelle max reçue est: " + max);
		System.out.println("La somme mensuelle min reçue est: " + min);
	}//End main
}//End Class
