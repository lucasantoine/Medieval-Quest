package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;

public class Forge {
	public static final Random R = new Random();
	
	public static void acheterEpee(Personnage p) {
		if(p.getArg() >= 20) {
			p.getHud().setAttaque(p.getAtk()*2);
			System.out.println("Vous avez acheté la super épée");
			Saisie.pressEnter("Attaque *2 !", false);
		}
		if(p.getArg() < 20 ) {
			Saisie.pressEnter("Vous êtes bien trop pauvre pour acheter cette belle épée", false);
		}
	}
	
	public static void acheterBouclier(Personnage p) {
		if(p.getArg() >= 25) {
			p.getHud().setAttaque(p.getAtk()*2);
			System.out.println("Vous avez acheté le magnifique bouclier");
			Saisie.pressEnter("Défense *2 !", false);
		}
		if(p.getArg() < 25 ) {
			Saisie.pressEnter("Vous êtes bien trop pauvre pour acheter cette magnifique épée", false);
		}
	}
	
	public static void forge(Personnage p) {
		//AsciiArt.forge;
		System.out.println("Vous arrivez devant une imposante Forge. Que souhaitez-vous faire ?");
		System.out.println("   1. Acheter une super épée");
		System.out.println("      Coute 20$, Attaque *2");
		System.out.println("   2. Acheter le magnifique bouclier");
		System.out.println("      Coute 25$, Défense *2");
		System.out.println("   3. Laisser tomber, je suis assez pauvre");
		String s = Saisie.saisie("", 3);
		int choix = Saisie.stringToInt(s);
		
		Saisie.clearScreenOpti();
		if (choix == 1) {
			Forge.acheterEpee(p);
		}
		if (choix == 2) {
			Forge.acheterBouclier(p);
		}
		if (choix == 3) {
			Saisie.pressEnter("Vous avez passé votre chemin", false);
		}
		
		System.out.println(p.getHud());
	}
	
	public static void main(String[] args) {
		Heros p = new Heros();
		System.out.println(p.getHud());
		Forge.forge(p);
	}

}
