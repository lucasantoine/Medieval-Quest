package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import main.Game;
import util.IEvenement;

public class Coffre implements IEvenement{
	
	public static final Random R = new Random();

	
	public static void coffre(Personnage p) {
		Saisie.clearScreenOpti();
		System.out.println(Game.barAvancement);
		System.out.println(p.getHud());
		AsciiArt.hero_coffre();
		System.out.println("\n Vous arrivez en face d'un coffre. Voulez vous prendre le risque de l'ouvrir, ou allez vous passer votre chemin ?");
		System.out.println("   1. Ouvrir le coffre");
		System.out.println("   2. Passer son chemin");
		String s = Saisie.saisie("", 2);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		AsciiArt.hero_coffre();
		if(choix == 1) {
			Coffre.ouvrirCoffre(p);
		}
		if(choix == 2) {
			Saisie.pressEnter("\nVous passez votre chemin\n", false);
		}
		System.out.println(p.getHud());
		Saisie.clearScreenOpti();
	}
	
	private static void ouvrirCoffre(Personnage p) {
		int tmp = R.nextInt(4);
		System.out.println("");
		if(Coffre.bonus()) {
			System.out.println("Vous gagnez 10 "+p.getHud().getStats()[tmp].getStat().getSymbole());
			p.getHud().getStats()[tmp].add(10);
		} else {
			System.out.println("Vous perdez 5 "+p.getHud().getStats()[tmp].getStat().getSymbole());
			p.getHud().getStats()[tmp].add(-5);
		}
		Saisie.pressEnter("", false);
		
	}
	
	private static boolean bonus() {
		return R.nextInt(2)==1;
	}
}