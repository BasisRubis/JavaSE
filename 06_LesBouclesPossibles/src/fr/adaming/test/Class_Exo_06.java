package fr.adaming.test;

public class Class_Exo_06 {

	public static void main(String[] args) {
		
		// ===========================
		// ======BOUCLE FOR===========
		// ===========================
		System.out.println("Boucle for :");

		for (int a = 3; a <= 10; a++) {
			System.out.println("a : " + a);
		}

		// ===========================
		// =======BOUCLE WHILE========
		// ===========================
		System.out.println("Boucle while :");

		int i = 3;
		while (i < 11) { // aussi possible i <= 10
			System.out.println("w : " + i);
			i += 1;
		}

		// ===========================
		// =====BOUCLE DO..WHILE======
		// ===========================
		System.out.println("Boucle do..while :");

		int d = 2;
		do {
			d = d + 1;
			System.out.println("d : " + d);
		} while (d < 10);

	}// End main
}// End class
