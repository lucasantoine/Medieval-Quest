package Structure;

import java.util.Random;

import interaction.AsciiArt;
import interaction.Saisie;
import main.Game;
import util.IEvenement;

public class Mendiant implements IEvenement {
	public static final Random R = new Random();

	public static void mendiant(Personnage p) {
		Saisie.clearScreenOpti();
		System.out.println(Game.barAvancement);
		System.out.println(p.getHud());
		AsciiArt.hero_mendiant();
		System.out.println("\nAlors que vous marchez tranquillement dans la rue, un mendiant vous tire par le bras et vous implore de lui donner quelques pièces d'or. Que souhaitez-vous faire?");
		System.out.println("   1.Lui donner de l'argent ( 5$ )");
		System.out.println("   2.Lui donner de l'argent ( 10$ )");
		System.out.println("   3.Le frapper");
		System.out.println("   4.L'ignorer\n");
		String s = Saisie.saisie("", 4);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
		AsciiArt.hero_mendiant();
		Mendiant.getChoix(choix, p);
	}
	
	private static void getChoix(int choix, Personnage p) {
		switch(choix) {
		case 1 : Mendiant.petitDon(p); break;
		case 2 : Mendiant.grosDon(p); break;
		case 3 : Mendiant.frapper(p); break;
		case 4 : Mendiant.ignorer(p); break;
		default : break;
		}
	}
	
	private static void petitDon(Personnage p) {
		System.out.println("\nVous lui donnez quelques pièces d'or.");
		if(p.getArg()>=40) {
			System.out.println("Le mendiant aperçoit votre bourse pleine attachée à votre ceinture et vous insulte de radin avant de vous cracher au visage.");
			Saisie.pressEnter("Vous perdez 1 point de vie.\n", false);
			p.setVie(p.getVie()-1);
		} else {
			Saisie.pressEnter("Le mendiant vous remercie et retourne se réfugier dans une ruelle.\n", false);
			p.setArgent(p.getArg()-5);
		}
	}
	
	private static void grosDon(Personnage p) {
		System.out.println("\nVous lui donnez une bourse remplie d'or.");
		if(p.getArg()<=10) {
			System.out.println("Mais vous n'avez plus d'argent ! Vous lui reprenez alors la bourse des mains, laissant votre dague tomber par inadvertance sur le sol.");
			Saisie.pressEnter("Vous perdez 10 d'attaque.\n", true);
			p.getHud().getStats()[1].add(-10);
		} else {
			int tmp = R.nextInt(3);
			System.out.println("Le mendiant se trouve être un ancien vétéran de guerre qui, pour vous remercier, vous apprends quelques techniques de survie.");
			Saisie.pressEnter("$ -10, "+p.getHud().getStats()[tmp].getStat().getSymbole()+" +5\n", true);
			p.getHud().getStats()[3].add(-10);
			p.getHud().getStats()[tmp].add(5);
		}
	}
	
	private static void frapper(Personnage p) {
		System.out.println("\nVous le repoussez violemment et l'éloignez d'un coup de pied, tout en criant qu'il ne fallait pas salir votre armure.");
		if(R.nextInt(3)==2) {
			Saisie.pressEnter("La garde semble ne pas vous avoir entendu et continue sa patrouille tranquillement.\n", false);
		} else {
			System.out.println("La garde vous a repéré et ne met pas longtemps à vous maîtriser afin de vous rouer de coups en public. Vous l'avez bien mérité.");
			Saisie.pressEnter("Vous perdez 15 points de vie.\n", true);
			p.setVie(p.getVie()-15);
		}
	}
	
	private static void ignorer(Personnage p) {
		System.out.println("\nVous faites comme si personne ne vous avez parlé et continuez votre chemin.");
		System.out.println("Quelques mètres plus loin vous vous sentez plus léger et remarquez que vous ne portez plus votre bouclier. Vous avez été volé par le mendiant.");
		Saisie.pressEnter("Vous perdez 10 de défense.:\n", true);
		p.getHud().getStats()[2].add(-10);
	}
}
