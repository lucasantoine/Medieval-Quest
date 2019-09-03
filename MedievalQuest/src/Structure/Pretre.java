package Structure;

import interaction.Saisie;
import util.IEvenement;

public class Pretre implements IEvenement {
	
	public static void pretre(Personnage p) {
		System.out.println("Vous entrez dans une église où un prêtre vous propose de recevoir la bénédiction du Seigneur");
		String s = Saisie.saisie("Que choisissez vous ? (1 - Vie, 2 - Attaque, 3 - Défense, 4 - Argent, 5 - Partir) : \n", 5);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		Pretre.getChoix(choix, p);
	}
	
	private static void getChoix(int choix, Personnage p) {
		switch(choix) {
		case 1 : ; break;
		case 2 : ; break;
		case 3 : ; break;
		case 4 : ; break;
		case 5 : ; break;
		}
	}
	
	private static void atk(Personnage p) {
		
	}
	
	private static void def(Personnage p) {
		
	}
}
