 package Structure;

import java.util.Random;

import interaction.Saisie;
import util.IEvenement;

public class Fontaine implements IEvenement {
	public static final Random R = new Random();

	public static void maison(Personnage p) {
		System.out.println("\nVous arrivez sur une place avec une fontaine en son centre. Vous remarquez les pièces brillantes qui en tapisse le fond.");
		String s = Saisie.saisie("Que voulez vous faire ? (1 - Boire l'eau de la fontaine, 2 - Faire un don, 3 - Voler les pièces) : \n", 3);
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
			Saisie.pressEnter(p.getHud().getStats()[tmp].getStat().getSymbole()+" + 20", true);
			p.getHud().getStats()[tmp].add(20);
			p.getHud().getStats()[3].add(-1);
		} else {
			System.out.println("Malheureusement, rien ne se passe...");
			Saisie.pressEnter("Vous avez perdu 1 pièce d'or.", true);
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
