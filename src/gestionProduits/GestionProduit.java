package gestionProduits;

import java.util.ArrayList;
import java.util.List;
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
		//System.out.println("\n\nVotre réponse est: " + reponse);
		
		List<Produit> produits = new ArrayList<Produit>();
		
		String gCode, gDescription;
		double gPrix;
		
		switch (reponse) {
			case "liste":
				//afficher la liste
				if (produits.isEmpty()) {
					System.out.println("Il n'y a aucun produit. Veuillez ajouter un produit");
				}
				else {
					System.out.println("LISTE DES PRODUITS");
					for (Produit p : produits) {
						System.out.println(p.getCode() + "\t" + p.getDescription() + "\t" + p.getPrix());
					}
				}
				
				break;
			case "ajoute":
				// ajouter
				System.out.print("\nEntrer code du produit: ");
				gCode = sc.next();
			
				System.out.print("Entrer description du produit: ");
				gDescription = sc.next();
				
				System.out.print("Entrer prix du produit: ");
				gPrix = sc.nextDouble();
				
				Produit tempProduit = new Produit(gCode, gDescription, gPrix);
				
				String messageAfficher = "";
				if(produits.add(tempProduit)) {
					messageAfficher = "<" + gDescription + "> a été bien ajouté.";
				}
				else {
					messageAfficher = gDescription + " n'a pas été ajouté.";
				}
				
				System.out.println(messageAfficher);
				//reponse = menu();
				
				
				break;
			case "suppr":
				//supprimer
				break;
			case "aide":
				//afficher l'aide
				break;
			case "quitter":
				//quitter
				break;
			default:
				System.out.println("Veuillez faire un choix !");
		
		}
		
		
	}
}
