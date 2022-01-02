package gestionProduits;

import java.util.Scanner;

public class GestionProduit {

	private static Scanner sc = new Scanner(System.in);
	
	static String menu() {
		boolean leTest;
		String reponse;
		do {
			System.out.println("\nBienvenue dans l'application <Gestion de Produits>\n");
			System.out.println("COMMANDES DU MENU");
			System.out.println("liste\t - Liste tous les produits");
			System.out.println("ajoute\t - Ajoute un produit");
			System.out.println("suppr\t - Supprime un produit");
			System.out.println("aide\t - Affiche ce menu");
			System.out.println("quitter\t - Quitte l'application");
			System.out.print("\nEntrer une commande: ");
			reponse = sc.next();
			reponse = reponse.trim().toLowerCase();
			leTest = !(reponse.equals("liste") || reponse.equals("ajoute") || reponse.equals("suppr") || reponse.equals("aide") || reponse.equals("quitter"));
			//System.out.println("<< " + leTest + ">>");
		} while (leTest);
		
		return reponse;
	}
	public static void main(String[] args) {
		String reponse;
		reponse = menu();
		System.out.println("\n\nVotre réponse est: " + reponse);
		
		/*switch (reponse) {
		case "liste":
			//afficher la liste
			break;
		
		
		}*/
		
		
	}
}
