package main;

import Structure.Auberge;
import Structure.Coffre;
import Structure.Garde;
import Structure.Heros;
import interaction.Saisie;
import menu.EcranTitre;

public class Game {
	public static void main(String[] args) {
		EcranTitre.showHomeScreen();
		Heros player = new Heros();
		player.choseClasse();
		Saisie.clearScreenOpti();
		
		Coffre.coffre(player);
		
		if(player.getVie() <= 0 || player.getArg() <= 0) {
			System.out.println("Vous avez perdu !");
			System.exit(0);
		}
		
		Auberge.auberge(player);
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