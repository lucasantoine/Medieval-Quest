 package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import main.Game;
import util.IEvenement;

public class Fontaine implements IEvenement {
	public static final Random R = new Random();

	public static void maison(Personnage p) {
		Saisie.clearScreenOpti();
		System.out.println(Game.barAvancement);
		System.out.println(p.getHud());
		AsciiArt.hero_fontaine();
		System.out.println("\nVous arrivez sur une place avec une fontaine en son centre. Vous remarquez les pièces brillantes qui en tapisse le fond. Que voulez vous faire ?");
		System.out.println("   1.Boire l'eau de la fontaine");
		System.out.println("   2.Faire un don");
		System.out.println("   3.Voler les pieces");
		String s = Saisie.saisie("", 3);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		Fontaine.getChoix(choix, p);
	}
	
	private static void getChoix(int choix, Personnage p) {
		switch(choix) {
		case 1 : Fontaine.boire(p); break;
		case 2 : Fontaine.don(p); break;
		case 3 : Fontaine.voler(p); break;
		default: break;
		}
	}
	
	private static void boire(Personnage p) {
		System.out.println("\nVous remplissez votre gourde et buvez de grandes gorgées de l'eau de la fontaine.");
		Saisie.pressEnter("Vous gagnez 5 points de vie.", true);
		p.getHud().getStats()[0].add(5);
	}

	private static void don(Personnage p) {
		System.out.println("\nVous décidez de lancer une pièce d'or dans la fontaine.");
		if(R.nextInt(6)==5) {
			int tmp = R.nextInt(3);
			System.out.println("C'est votre jour de chance, le Seigneur vous accorde une bénédiction !");
			Saisie.pressEnter(p.getHud().getStats()[tmp].getStat().getSymbole()+" + 20\n", true);
			p.getHud().getStats()[tmp].add(20);
			p.getHud().getStats()[3].add(-1);
		} else {
			System.out.println("Malheureusement, rien ne se passe...");
			Saisie.pressEnter("Vous avez perdu 1 pièce d'or.\n", true);
			p.getHud().getStats()[3].add(-1);
		}
	}
	
	private static void voler(Personnage p) {
		System.out.println("Vous escaladez le rebord de la cascade et commencez à ramasser les pièces d'or. En voulant sortir, vous glissez et tombez la tête la première\nlaissant ainsi s'échapper une partie du butin");
		Saisie.pressEnter("Vous perdez 5 points de vie et gagnez 20 pièces d'or.", true);
		p.getHud().getStats()[0].add(-5);
		p.getHud().getStats()[3].add(20);
	}
}
