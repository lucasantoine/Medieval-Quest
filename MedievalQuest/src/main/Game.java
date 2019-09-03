package main;

import Structure.Coffre;
import Structure.Heros;
import interaction.Saisie;
import menu.EcranTitre;

public class Game {
	public static void main(String[] args) {
		EcranTitre.main(args);
		Heros player = new Heros();
		System.out.println(player.getHud());
		System.out.println("Vous arrivez en face d'un coffre. Voulez vous prendre le risque de l'ouvrir, ou allez vous passer votre chemin ?");
		String s = Saisie.saisie("Faites un choix : 1 - ouvrir, 2 - partir", 2);
		int choix = Saisie.stringToInt(s);
		if(choix == 1) Coffre.ouvrirCoffre(player);
		System.out.println(player.getHud());
	}
}