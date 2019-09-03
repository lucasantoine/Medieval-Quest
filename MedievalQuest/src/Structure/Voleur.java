package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import util.IEvenement;

public class Voleur implements IEvenement{

	public static final String BKN = System.getProperty("line.separator");
	public static final Random R = new Random();
	private static String affichage = "";

	
	public static void garde(Personnage p) {
		System.out.println(p.getHud());
		AsciiArt.hero_voleur();
		System.out.println("Vous croisez la route d'un perfide Voleur !");
		String s = Saisie.saisie("Que souhaitez vous faire (1 - Voler, 2 - Appeler la Garde, 3 - Se cacher) : \n", 4);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		Voleur.getChoix(choix, p);
		Saisie.pressEnter(affichage, true);
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
		Saisie.pressEnter("Vous tentez de voler le Voleur", true);
		if(p.getHud().getStats()[0].getValue() <= 10) {
			affichage = "Le Voleur vous attrape mais il a pitié de votre piètre prestation. Il décide alors de vous donner 5 pièces d'or";	
		} else {
			affichage = "Vous pensiez vraiment voler un Voleur ... il vous a pris votre armure jeune sot !";
			p.getHud().getStats()[2].add(-5);
		}
	}
	
	private static void appelerLaGarde(Personnage p) {
		Saisie.pressEnter("Vous appelez la Garde à votre secours", true);
		if(p.getDef()>=10) {
			affichage = "Le Voleur etait deja bien assez impressionner par votre Carisme ! Il pris donc la fuite en laissant tomber sa bourse...";
			p.getHud().getStats()[3].add(10);
		} else {
			affichage = "Votre frèle corp fut si rapide à voler que le Voleur etait deja bien loin quand la Garde arriva... Un garde pensa donc que vous mentiez et vous frappa.";
			p.getHud().getStats()[0].add(-5);
		}
	}
	
	private static void seCacher(Personnage p) {
		Saisie.pressEnter("Vous prenez décidez de vous cacher", true);
		if(p.getDef() <= 10) {
			affichage = "Votre armure legère vous a permis de ne pas vous faire reperer. vous avez pu voir ou le Voleur entère son butin !";
			p.getHud().getStats()[3].add(+10);
		} else {
			affichage = "Votre armure imposante vous protège certe des lames mais ici elle a permis au Voleur de vous reperer. Il pris la fuite en faisant tomber un gantelet !";
			p.getHud().getStats()[3].add(+10);
		}
	}
	
}
