package Structure;

import interaction.AsciiArt;
import interaction.Saisie;
import util.IEvenement;

public class Maison implements IEvenement {
	
	public static void maison(Personnage p) {
		System.out.println(p.getHud());
		AsciiArt.hero_maisonHantee();
		System.out.println("\nVous apercevez de la lumière qui s'échappe d'une maison abandonnée depuis des années.");
		String s = Saisie.saisie("Que voulez vous faire ? (1 - Frapper à la porte, 2 - Entrer sans frapper, 3 - Partir sans entrer) : \n", 3);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		Maison.getChoix(choix, p);
	}
	
	private static void getChoix(int choix, Personnage p) {
		switch(choix) {
		case 1 : Maison.frapper(p); break;
		case 2 : Maison.entrer(p); break;
		case 3 : Maison.partir(p); break;
		default: break;
		}
	}
	
	private static void frapper(Personnage p) {
		System.out.println("\n Vous frappez à la porte si fort qu'elle se détruit. Tout comme la maison. Vous repartez après vous être péniblement sorti des décombres.");
		Saisie.pressEnter("Vous perdez 10 points de vie.\n", true);
	}
	
	private static void entrer(Personnage p) {
		System.out.println("\n Vous entrez et surprenez un mage de sang faisant un rituel. Vous parvenez à le convaincre de vous offrir de la durée de vie contre votre silence sur ses activités.");
		Saisie.pressEnter("Vous gagnez 10 points de vie.\n", true);
	}

	private static void partir(Personnage p) {
		Saisie.pressEnter("\nVous décidez de ne pas vous risquer à entrer.", true);
	}
}
