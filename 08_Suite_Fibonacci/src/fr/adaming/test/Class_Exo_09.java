package fr.adaming.test;

import java.util.Scanner;

public class Class_Exo_09 {

	public static void main(String[] args) {
		
		//====== Demande du nombre de fibonaccio =====
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Nombre de Fibonacci voulu Un avec n = ");
		int n = sc1.nextInt();
		
		
		//======= Declaration
		int u0 = 1;
		int u1 = 1;
		int res = 0;
		
		//======= Condition pour avoir la suite
		
		if(n==0) {
			System.out.println("0");
		}else if(n==1) {
			System.out.println("1");
		}else if(n>=2) {
			for(int i = 2; i < n; i++) {
				res = u0 + u1;
				u0 = u1;
				u1 = res;
			}
		}
		System.out.println(res);
	}//End main
}//End class
