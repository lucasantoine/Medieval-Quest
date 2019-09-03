package Structure;

import java.util.Random;

import interaction.Saisie;
import util.IEvenement;

public class Mendiant implements IEvenement {
	public static final Random R = new Random();

	public static void mendiant(Personnage p) {
		System.out.println("Alors que vous marchez tranquillement dans la rue, un mendiant vous tire par le bras et vous implore de lui donner quelques pièces d'or.");
		String s = Saisie.saisie("Que souhaitez vous faire ? (1 - Lui donner de l'argent (5$), 2 - Lui donner beaucoup d'argent (10$), 3 - Le frapper, 4 - L'ignorer) : \n", 4);
		int choix = Saisie.stringToInt(s);
		Saisie.clearScreenOpti();
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
		Saisie.pressEnter("Vous lui donnez quelques pièces d'or.", false);
		if(p.getArg()>=40) {
			Saisie.pressEnter("Le mendiant aperçoit votre bourse pleine attachée à votre ceinture et vous insulte de radin avant de vous cracher au visage.",false);
			Saisie.pressEnter("HP -1", false);
			p.getHud().getStats()[0].add(-1);
		} else {
			Saisie.pressEnter("Le mendiant vous remercie et retourne se réfugier dans une ruelle.", false);
		}
	}
	
	private static void grosDon(Personnage p) {
		Saisie.pressEnter("Vous lui donnez une bourse remplie d'or.", false);
		if(p.getArg()<=10) {
			Saisie.pressEnter("Mais vous n'avez plus d'argent ! Vous lui reprenez alors la bourse des mains, laissant votre dague tomber par inadvertance sur le sol.", false);
			Saisie.pressEnter("ATK -5", false);
			p.getHud().getStats()[1].add(-5);
		} else {
			int tmp = R.nextInt(3);
			Saisie.pressEnter("Le mendiant se trouve être un ancien vétéran de guerre qui, pour vous remercier, vous apprends quelques techniques de survie.", false);
			Saisie.pressEnter("$ -10, "+p.getHud().getStats()[tmp].getStat().getSymbole()+" +5", false);
			p.getHud().getStats()[3].add(-10);
			p.getHud().getStats()[tmp].add(5);
		}
	}
	
	private static void frapper(Personnage p) {
		Saisie.pressEnter("Vous le repoussez violemment et l'éloignez d'un coup de pied, tout en criant qu'il ne fallait pas salir votre armure.", false);
		if(R.nextInt(3)==2) {
			Saisie.pressEnter("Heureusement pour vous la garde semble ne pas vous avoir entendu et continue sa patrouille tranquillement.", false);
		} else {
			Saisie.pressEnter("La garde vous a repéré et ne met pas longtemps à vous maîtriser afin de vous rouer de coups en public. Vous l'avez bien mérité.", false);
			Saisie.pressEnter("HP -15", false);
			p.getHud().getStats()[0].add(-5);
		}
	}
	
	private static void ignorer(Personnage p) {
		Saisie.pressEnter("Vous faites comme si personne ne vous avez parlé et continuez votre chemin.", false);
		Saisie.pressEnter("Quelques mètres plus loin vous vous sentez plus léger et remarquez que vous ne portez plus votre bouclier. Vous avez été volé par le mendiant.", false);
		Saisie.pressEnter("DEF -10", false);
		p.getHud().getStats()[2].add(-10);
	}
	
	public static void main(String[] args) {
		Heros h = new Heros();
		System.out.println(h.getHud().toString());
		Mendiant.mendiant(h);
		System.out.println(h.getHud().toString());

	}
}
