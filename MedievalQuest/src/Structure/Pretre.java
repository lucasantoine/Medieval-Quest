package Structure;

import interaction.Saisie;
import util.IEvenement;

public class Pretre implements IEvenement {

	public static void pretre(Personnage p) {
		System.out.println(
				"Vous entrez dans une église où un prêtre vous propose de recevoir la bénédiction du Seigneur");
		String s = Saisie
				.saisie("Que choisissez vous ? (1 - Vie, 2 - Attaque, 3 - Défense, 4 - Argent, 5 - Partir) : \n", 5);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
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
		Saisie.pressEnter("Une lumière vous entoure et vous sentez une grande chaleur dans votre coeur.", false);
		Saisie.pressEnter("Vous gagnez 10 points de vie.", true);
		p.getHud().getStats()[0].add(10);
	}

	private static void atk(Personnage p) {
		Saisie.pressEnter("Une lumière entoure votre épée et vous sentez votre force augmenter.", false);
		Saisie.pressEnter("Vous gagnez 10 points d'attaque.", true);
		p.getHud().getStats()[1].add(10);
	}

	private static void def(Personnage p) {
		Saisie.pressEnter("Une lumière entoure votre armure et vous sentez votre armure s'alourdir.", false);
		Saisie.pressEnter("Vous gagnez 10 points de défense.", true);
		p.getHud().getStats()[2].add(10);
	}

	private static void arg(Personnage p) {
		Saisie.pressEnter("La cupidité n'est pas récompensée par le Seigneur. Le prêtre vous met à la porte après vous avoir maudit.", false);
		Saisie.pressEnter("Vous perdez 5 points de vie, d'attaque et de défense.", true);
		p.getHud().getStats()[0].add(-5);
		p.getHud().getStats()[1].add(-5);
		p.getHud().getStats()[2].add(-5);
	}

	private static void partir(Personnage p) {
		Saisie.pressEnter("Vous quittez cet endroit en grommelant que le Seigneur n'existe pas. Une enclume vous tombe malheureusement sur le crâne à la sortie de l'église.", false);
		Saisie.pressEnter("Vous perdez 10 points de vie. Il fallait être plus croyant.", true);
		p.getHud().getStats()[0].add(-10);
	}
}
