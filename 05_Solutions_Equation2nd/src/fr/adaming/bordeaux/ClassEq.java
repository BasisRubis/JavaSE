package fr.adaming.bordeaux;

import java.util.Scanner;

public class ClassEq {

	public static void main(String[] args) {
		
		/**************Boucle pour relancer le programme**************************/
		int n = 0;
		while(n==0) {
		
		/**************Demander d'entrer un nombre*******************************/
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Entrez a =");
		double a = sc1.nextInt();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Entrez b =");
		double b = sc2.nextInt();
		Scanner sc3 = new Scanner(System.in);
		System.out.println("Entrez c =");
		double c = sc3.nextInt();
		
		/**************Delta**************************************************/
		double delta;
		
		delta = b*b - 4*a*c;
		
		double s0 = -b/(2*a);
		
		double s1 = (-b + Math.sqrt(delta))/(2*a);
		
		double s2 = (-b - Math.sqrt(delta))/(2*a);
		
		/**************Solution********************************************/
				
		if(delta<0){
					
		System.out.println("Il n'y a pas de solution réelle.");
					
		}else if(delta==0) { 
					
		System.out.println("La solution est unique et elle vaut : "+ s0);
					
		}else if(delta>0) { 
					
		System.out.println("Les solutions sont : "+ s1 +" "+ s2);		
		}	
		
		/******* Les structures de controle switch case *************/
		String nom = "oto";
		
		switch (nom) {
		case "toto":
			System.out.println("Bonjour TOTO");
			break;
		case "fofo":
			System.out.println("Bonjour FOFO");
			break;
		case "nomane":
			System.out.println("Bonjour NOMANE");
		default :
			System.out.println("Désolé, je ne te connais pas");
			break;
		
		}//End Boucle
	}//End main
	}
}//End class
