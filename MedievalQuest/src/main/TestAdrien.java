package main;



import java.util.Scanner;

import Structure.Coffre;
import Structure.Heros;
import menu.EcranTitre;

public class TestAdrien {
	public static void main(String[] args) {
		
		EcranTitre.showHomeScreen();
		
		System.out.println("caca");
		
		Heros player = new Heros();
		System.out.println(player.getHud());
		 
		
		System.out.println("Vous arrivez devant un coffre !");
		
		System.out.println(Coffre.getImage());
		System.out.println("Que voulez-vous faire ?");
		System.out.println("   1. Ouvrir le coffre (� vos risques et p�rils)");
		System.out.println("   2. Ne pas prendre de risque inutile.");
	
		/**
		String temp = Saisie.saisie("Faites votre choix !", 2);
		int saisie = Saisie.stringToInt(temp);
		**/
		
		//PROBLEME AVEC LES SCANNER !!
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un mot :");
		String str = sc.nextLine();
		System.out.println("Vous avez saisi : " + str);
		
		/**
		if(saisie == 1) {
			c.ouvrirCoffre(player);
		}
		**/
		
		System.out.println("SUITE DU JEU");
		
	}

}
