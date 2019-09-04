package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import main.Game;

public class Forge {
	public static final Random R = new Random();

	public static void acheterEpee(Personnage p) {

		if(p.getArg() >= 20) {
			p.getHud().setAttaque(p.getAtk()*2);

			p.getHud().setArgent(p.getArg()-20);
			System.out.println("\nVous avez acheté la super épée");
			Saisie.pressEnter("Attaque *2 !\n", false);
		}
		else {
			Saisie.pressEnter("\nVous êtes bien trop pauvre pour acheter cette belle épée\n", false);
		}

	}

	public static void acheterBouclier(Personnage p) {
		if(p.getArg() >= 25) {
			p.getHud().setDefense(p.getDef()*2);
			p.getHud().setArgent(p.getArg()-25);
			System.out.println("\nVous avez acheté le magnifique bouclier");
			Saisie.pressEnter("Défense *2 !\n", false);
		}
		else {
			Saisie.pressEnter("\nVous êtes bien trop pauvre pour acheter cette magnifique épée\n", false);
		}

	}

	public static void forge(Personnage p) {
		Saisie.clearScreenOpti();
		System.out.println(Game.barAvancement);
		System.out.println(p.getHud());
		AsciiArt.hero_forgeron();
		System.out.println("\nVous arrivez devant une imposante Forge. Que souhaitez-vous faire ?");
		System.out.println("   1. Acheter une super épée");
		System.out.println("      Coute 20$, Attaque *2");
		System.out.println("   2. Acheter le magnifique bouclier");
		System.out.println("      Coute 25$, Défense *2");
		System.out.println("   3. Laisser tomber, je suis assez pauvre");
		String s = Saisie.saisie("", 3);
		int choix = Saisie.stringToInt(s);

		Saisie.clearScreenOpti();
		AsciiArt.hero_forgeron();
		if (choix == 1) {
			Forge.acheterEpee(p);
		}
		if (choix == 2) {
			Forge.acheterBouclier(p);
		}
		if (choix == 3) {
			Saisie.pressEnter("\nVous avez passé votre chemin\n", false);
		}

	}

}
