package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import main.Game;
import util.IEvenement;

public class Voleur implements IEvenement{

	public static final Random R = new Random();

	public static void voleur(Personnage p) {
		Saisie.clearScreenOpti();
		System.out.println(Game.barAvancement);
		System.out.println(p.getHud());
		AsciiArt.hero_voleur();
		System.out.println("\nVous croisez la route d'un perfide Voleur !");
		System.out.println("   1.Le voler");
		System.out.println("   2.Appeler la Garde");
		System.out.println("   3.Se cacher\n");
		String s = Saisie.saisie("", 3);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		AsciiArt.hero_voleur();
		Voleur.getChoix(choix, p);
	}
	
	private static void getChoix(int choix, Personnage p) {
		switch(choix) {
		case 1 : Voleur.voler(p); break;
		case 2 : Voleur.appelerLaGarde(p); break;
		case 3 : Voleur.seCacher(p); break;
		default:;break;
		}
	}
	
	private static void voler(Personnage p) {
		System.out.println("\nVous tentez de voler le Voleur");
		if(p.getHud().getStats()[0].getValue() <= 10) {
			System.out.println("Le Voleur vous attrape mais il a pitié de votre piètre prestation. Il décide alors de vous donner 5 pièces d'or");	
			Saisie.pressEnter("Or +5\n", false);
			p.getHud().getStats()[3].add(5);
		} else {
			System.out.println("Vous pensiez vraiment voler un Voleur ... il vous a pris votre armure jeune sot !");
			Saisie.pressEnter("Armure -5\n", false);
			p.getHud().getStats()[2].add(-5);
		}
	}
	
	private static void appelerLaGarde(Personnage p) {
		System.out.println("\nVous appelez la Garde à votre secours");
		if(p.getDef()>=10) {
			System.out.println("Le Voleur etait deja bien assez impressionné par votre Charisme ! Il prit donc la fuite en laissant tomber sa bourse...");
			Saisie.pressEnter("Or +10\n", false);
			p.getHud().getStats()[3].add(10);
		} else {
			System.out.println("Votre frèle corps fut si rapide à voler que le Voleur etait deja bien loin quand la Garde arriva... Un garde pensa que vous mentiez et vous frappa.");
			Saisie.pressEnter("PV -5\n", false);
			p.getHud().getStats()[0].add(-5);
		}
	}
	
	private static void seCacher(Personnage p) {
		System.out.println("\nVous décidez de vous cacher");
		if(p.getDef() <= 10) {
			System.out.println("Votre armure legère vous a permis de ne pas vous faire reperer. vous avez pu voir ou le Voleur enterre son butin !");
			Saisie.pressEnter("Or +10\n", false);
			p.getHud().getStats()[3].add(+10);
		} else {
			System.out.println("Votre armure imposante vous protège certe des lames mais ici elle a permis au Voleur de vous reperer. Il pris la fuite en faisant tomber un gantelet !");
			Saisie.pressEnter("Def +10\n", false );
			p.getHud().getStats()[2].add(+10);
		}
	}
	
}
