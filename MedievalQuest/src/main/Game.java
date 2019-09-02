package main;

import Structure.Coffre;
import Structure.Heros;
import affichage.Hud;
import interaction.Saisie;

public class Game {
	public static void main(String[] args) {
		EcranTitre.main(args);
		Heros player = new Heros();
		System.out.println(player.getHud());
		Coffre coffre = new Coffre();
		System.out.println("Vous arrivez en face d'un coffre. Voulez vous prendre le risque de l'ouvrir, ou allez vous passer votre chemin ?");
		String s = Saisie.saisie("Faites un choix : 1 - ouvrir, 2 - partir", 2);
		int choix = Saisie.stringToInt(s);
		if(choix == 1) coffre.ouvrirCoffre(player);
		System.out.println(player.getHud());
	}
}
