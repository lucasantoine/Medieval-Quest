package Structure;

import interaction.AsciiArt;
import interaction.Saisie;
import util.IEvenement;

public class Pretre implements IEvenement {

	public static void pretre(Personnage p) {
		System.out.println(p.getHud());
		AsciiArt.hero_pretre();
		System.out.println(
				"\nVous entrez dans une église où un prêtre vous propose de recevoir la bénédiction du Seigneur");
		System.out.println("   1.Vie");
		System.out.println("   2.Attaque");
		System.out.println("   3.D�fense");
		System.out.println("   4.Argent");
		System.out.println("   5.Partir\n");
		String s = Saisie
				.saisie("", 5);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		AsciiArt.hero_pretre();
		Pretre.getChoix(choix, p);
	}

	private static void getChoix(int choix, Personnage p) {
		switch (choix) {
		case 1:
			Pretre.vie(p);
			break;
		case 2:
			Pretre.atk(p);
			break;
		case 3:
			Pretre.def(p);
			break;
		case 4:
			Pretre.arg(p);
			break;
		case 5:
			Pretre.partir(p);
			break;
		default:
			break;
		}
	}

	private static void vie(Personnage p) {
		System.out.println("\nUne lumière vous entoure et vous sentez une grande chaleur dans votre coeur.");
		Saisie.pressEnter("Vous gagnez 10 points de vie.\n", true);
		p.getHud().getStats()[0].add(10);
	}

	private static void atk(Personnage p) {
		System.out.println("\nUne lumière entoure votre épée et vous sentez votre force augmenter.");
		Saisie.pressEnter("Vous gagnez 10 points d'attaque.\n", true);
		p.getHud().getStats()[1].add(10);
	}

	private static void def(Personnage p) {
		System.out.println("\nUne lumière entoure votre armure et vous sentez votre armure s'alourdir.");
		Saisie.pressEnter("Vous gagnez 10 points de défense.\n", true);
		p.getHud().getStats()[2].add(10);
	}

	private static void arg(Personnage p) {
		System.out.println("\nLa cupidité n'est pas récompensée par le Seigneur. Le prêtre vous met à la porte après vous avoir maudit.");
		Saisie.pressEnter("Vous perdez 5 points de vie, d'attaque et de défense.\n", true);
		p.getHud().getStats()[0].add(-5);
		p.getHud().getStats()[1].add(-5);
		p.getHud().getStats()[2].add(-5);
	}

	private static void partir(Personnage p) {
		System.out.println("\nVous quittez cet endroit en grommelant que le Seigneur n'existe pas. Une enclume vous tombe malheureusement sur le crâne à la sortie de l'église.");
		Saisie.pressEnter("Vous perdez 10 points de vie. Il fallait être plus croyant.\n", true);
		p.getHud().getStats()[0].add(-10);
	}
}
