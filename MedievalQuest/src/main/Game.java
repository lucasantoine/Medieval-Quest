package main;

import Structure.Coffre;
import Structure.Garde;
import Structure.Heros;
import interaction.AsciiArt;
import interaction.Saisie;
import menu.EcranTitre;

public class Game {
	public static void main(String[] args) {
		EcranTitre.showHomeScreen();
		Heros player = new Heros();
		player.choseClasse();
		Saisie.clearScreenOpti();
		
		
		System.out.println(player.getHud());
		System.out.println("Vous arrivez en face d'un coffre. Voulez vous prendre le risque de l'ouvrir, ou allez vous passer votre chemin ?");
		AsciiArt.hero_coffre();
		String s = Saisie.saisie("Faites un choix (1 - ouvrir, 2 - partir) : \n", 2);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		if(choix == 1) {
			Coffre.ouvrirCoffre(player);
		}
		System.out.println(player.getHud());
		if(player.getVie() <= 0 || player.getArg() <= 0) {
			System.out.println("Vous avez perdu !");
			System.exit(0);
		}
		
		
		Garde.garde(player);
		System.out.println(player.getHud());
		if(player.getVie() <= 0  || player.getArg() <= 0) {
			System.out.println("Vous avez perdu !");
			System.exit(0);
		}
	}
}